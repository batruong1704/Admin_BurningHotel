package view.hoatdong;

import controller.DatMonController;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.tbl_ChiTietMonAn;
import model.tbl_MonAn;
import model.tbl_PhieuMonAn;

public final class JF_NhaHang extends javax.swing.JFrame {

    DefaultTableModel tbl_MonAn, tbl_ChotDichVu;
    List<tbl_MonAn> arrMonAn = new ArrayList<>();
    private String mamonan, tenmonan, giamonan, tongphieu, tiencoc;
    private int soluong;
    private final HashMap<String, Integer> monanHashMap = new HashMap<>();
    private String mahoadon, makhachhang, maphong;

    public JF_NhaHang() throws IOException {
        initComponents();
        LayNguonDV("", "");
        hienThiDanhSachPhanLoai();
        mahoadon = JP_QuanLyTienIch.mahoadonString;
        makhachhang = JP_QuanLyTienIch.makhachhangString;
        maphong = JP_QuanLyTienIch.maphongString;
    }

    public void LayNguonDV(String danhmuc, String content) throws IOException {
        tbl_MonAn = (DefaultTableModel) tb_monan.getModel();
        arrMonAn = DatMonController.NguonMonAn(danhmuc, content);
        tbl_MonAn.setRowCount(0);
        arrMonAn.forEach((KQ) -> {
            tbl_MonAn.addRow(new Object[]{KQ.getID(), KQ.getTenMon(), KQ.getPhanLoai(), KQ.getThanhTien(), KQ.getSoLuongDaBan()});
        });
    }

    public void hienThiDanhSachPhanLoai() {
        ArrayList<String> danhSachPhanLoai = DatMonController.layDanhSachPhanLoai();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(danhSachPhanLoai.toArray(new String[0]));
        cbb_tkdanhmuc.setModel(model);
    }

    private void tinhTongTien() {
        DefaultTableModel tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();
        double tongTien = 0.0;

        for (int i = 0; i < tbl_ChotDichVu.getRowCount(); i++) {
            if (tbl_ChotDichVu.getValueAt(i, 3) != null) {
                String giaTien = tbl_ChotDichVu.getValueAt(i, 3).toString();
                double gia = Double.parseDouble(giaTien);
                int soLuong = Integer.parseInt(tbl_ChotDichVu.getValueAt(i, 2).toString());
                tongTien += gia * soLuong;
            }
        }
        String tongTienStr = String.valueOf(tongTien);
        lb_tongtien.setText(tongTienStr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cbb_tkdanhmuc = new javax.swing.JComboBox<>();
        btn_timkiem = new javax.swing.JLabel();
        btn_refreshdv = new javax.swing.JLabel();
        txt_tknoidung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        lb_tongtien = new javax.swing.JLabel();
        btn_quaylai = new container.Button();
        btn_hoanthanh = new container.Button();
        jPanel3 = new javax.swing.JPanel();
        lb_ma = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lb_ten = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lb_gia = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btn_giamsoluong2 = new javax.swing.JLabel();
        txt_soluongsp = new javax.swing.JTextField();
        btn_themsoluong = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_loaibo = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_chotmonan = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_monan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel20.setBackground(new java.awt.Color(76, 41, 211));
        jPanel20.setPreferredSize(new java.awt.Dimension(1100, 60));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(76, 41, 211));
        jPanel6.setPreferredSize(new java.awt.Dimension(420, 60));

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bộ lọc:");

        cbb_tkdanhmuc.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        btn_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        btn_timkiem.setText("jLabel14");
        btn_timkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_timkiemMouseClicked(evt);
            }
        });

        btn_refreshdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh_26px_light.png"))); // NOI18N
        btn_refreshdv.setText("jLabel14");
        btn_refreshdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshdvMouseClicked(evt);
            }
        });

        txt_tknoidung.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(cbb_tkdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tknoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(cbb_tkdanhmuc)
                    .addComponent(txt_tknoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Restaurant");
        jPanel20.add(jLabel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(380, 640));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 65));

        jLabel38.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        jLabel38.setText("Tổng:");

        lb_tongtien.setFont(new java.awt.Font("Montserrat Medium", 3, 20)); // NOI18N
        lb_tongtien.setForeground(new java.awt.Color(255, 0, 0));
        lb_tongtien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tongtien.setText("0");

        btn_quaylai.setForeground(new java.awt.Color(255, 255, 255));
        btn_quaylai.setText("Quay Lại");
        btn_quaylai.setBorderColor(new java.awt.Color(0, 0, 255));
        btn_quaylai.setColor(new java.awt.Color(0, 0, 255));
        btn_quaylai.setColorOver(new java.awt.Color(67, 0, 255));
        btn_quaylai.setFont(new java.awt.Font("Monterrat", 1, 13)); // NOI18N
        btn_quaylai.setRadius(10);
        btn_quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quaylaiActionPerformed(evt);
            }
        });

        btn_hoanthanh.setForeground(new java.awt.Color(0, 0, 255));
        btn_hoanthanh.setText("Hoàn Thành");
        btn_hoanthanh.setBorderColor(new java.awt.Color(0, 0, 255));
        btn_hoanthanh.setFont(new java.awt.Font("Monterrat", 1, 13)); // NOI18N
        btn_hoanthanh.setIconTextGap(2);
        btn_hoanthanh.setMaximumSize(new java.awt.Dimension(91, 25));
        btn_hoanthanh.setName(""); // NOI18N
        btn_hoanthanh.setRadius(10);
        btn_hoanthanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hoanthanhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_hoanthanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_quaylai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btn_hoanthanh, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel10.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(380, 130));

        lb_ma.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_ma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel28.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel28.setText("  Mã Món:");

        jLabel30.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel30.setText("  Tên Món:");

        lb_ten.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_ten.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel34.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel34.setText("  Giá:");

        lb_gia.setFont(new java.awt.Font("Montserrat Medium", 3, 16)); // NOI18N
        lb_gia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel35.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel35.setText("  Số Lượng:");

        btn_giamsoluong2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_giamsoluong2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus_25px.png"))); // NOI18N
        btn_giamsoluong2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_giamsoluong2MouseClicked(evt);
            }
        });

        txt_soluongsp.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        txt_soluongsp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_soluongsp.setText("1");
        txt_soluongsp.setPreferredSize(new java.awt.Dimension(24, 24));
        txt_soluongsp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_soluongspFocusLost(evt);
            }
        });

        btn_themsoluong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_themsoluong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sum_25px.png"))); // NOI18N
        btn_themsoluong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themsoluongMouseClicked(evt);
            }
        });

        btn_them.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_giamsoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt_soluongsp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_themsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_gia, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(lb_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_ma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_soluongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_giamsoluong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_themsoluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );

        jPanel10.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(380, 25));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh Sách Món");
        jPanel5.add(jLabel2, java.awt.BorderLayout.CENTER);

        btn_loaibo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_loaibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_25px.png"))); // NOI18N
        btn_loaibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loaiboMouseClicked(evt);
            }
        });
        jPanel5.add(btn_loaibo, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        tb_chotmonan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_chotmonan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên Món", "Số Lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_chotmonan.setPreferredSize(new java.awt.Dimension(250, 160));
        tb_chotmonan.setRowMargin(5);
        tb_chotmonan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_chotmonanMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tb_chotmonan);
        if (tb_chotmonan.getColumnModel().getColumnCount() > 0) {
            tb_chotmonan.getColumnModel().getColumn(0).setPreferredWidth(5);
            tb_chotmonan.getColumnModel().getColumn(1).setPreferredWidth(125);
            tb_chotmonan.getColumnModel().getColumn(2).setPreferredWidth(5);
            tb_chotmonan.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        jPanel4.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 30));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(45, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lựa chọn món");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tb_monan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_monan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Món", "Danh Mục", "Giá", "Đã Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_monan.setRowHeight(22);
        tb_monan.setRowMargin(10);
        tb_monan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_monanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_monan);
        if (tb_monan.getColumnModel().getColumnCount() > 0) {
            tb_monan.getColumnModel().getColumn(0).setPreferredWidth(10);
            tb_monan.getColumnModel().getColumn(1).setPreferredWidth(200);
            tb_monan.getColumnModel().getColumn(2).setPreferredWidth(50);
            tb_monan.getColumnModel().getColumn(3).setPreferredWidth(25);
            tb_monan.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jPanel11.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel9, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateGia() {
        String giaStr = lb_gia.getText(); // Lấy giá ban đầu từ dữ liệu bảng
        double gia = Double.parseDouble(giaStr);

        String soLuongStr = txt_soluongsp.getText();
        int soLuong = Integer.parseInt(soLuongStr);

        double giaTongCong = gia * soLuong;
        lb_gia.setText(String.valueOf(giaTongCong)); // Cập nhật giá tổng cộng vào lb_gia
    }

    private void btn_timkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_timkiemMouseClicked
        try {
            LayNguonDV(cbb_tkdanhmuc.getSelectedItem().toString(), txt_tknoidung.getText().trim());
        } catch (IOException ex) {
            Logger.getLogger(JF_NhaHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_timkiemMouseClicked

    private void tb_monanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_monanMouseClicked
        int index = tb_monan.getSelectedRow();
        TableModel model = tb_monan.getModel();
        lb_ma.setText(model.getValueAt(index, 0).toString());
        lb_ten.setText(model.getValueAt(index, 1).toString());
        lb_gia.setText(model.getValueAt(index, 3).toString());

        // Cập nhật giá tổng cộng khi chọn một dòng mới trong bảng tb_monan
        updateGia();
    }//GEN-LAST:event_tb_monanMouseClicked

    private void btn_giamsoluong2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_giamsoluong2MouseClicked
        String soLuongStr = txt_soluongsp.getText();
        int soLuong = Integer.parseInt(soLuongStr);

        if (soLuong > 1) {
            soLuong--;
            txt_soluongsp.setText(String.valueOf(soLuong));
            updateGia();
        } else {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm phải lớn hơn 1", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_giamsoluong2MouseClicked

    private void txt_soluongspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_soluongspFocusLost
        String soLuongStr = txt_soluongsp.getText();

        if (soLuongStr.isEmpty()) {
            txt_soluongsp.setText("1");
        } else {
            try {
                int soLuong = Integer.parseInt(soLuongStr);
                if (soLuong < 1 || soLuong > 9) {
                    JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ. Vui lòng nhập số lượng từ 1 đến 9.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    txt_soluongsp.setText("1");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ. Vui lòng nhập số lượng từ 1 đến 9.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                txt_soluongsp.setText("1");
            }
        }
    }//GEN-LAST:event_txt_soluongspFocusLost

    private void btn_themsoluongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themsoluongMouseClicked
        String soLuongStr = txt_soluongsp.getText();
        int soLuong = Integer.parseInt(soLuongStr);

        if (soLuong < 9) {
            soLuong++;
            txt_soluongsp.setText(String.valueOf(soLuong));
            updateGia();
        } else {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm đã đạt tối đa (9)", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_themsoluongMouseClicked

    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();
        mamonan = lb_ma.getText();
        tenmonan = lb_ten.getText();
        giamonan = lb_gia.getText();
        soluong = Integer.parseInt(txt_soluongsp.getText());

        if (mamonan.isEmpty() || tenmonan.isEmpty() || giamonan.isEmpty()) {
            return;
        }

        boolean isExisting = false;
        int existingRow = -1;
        for (int i = 0; i < tbl_ChotDichVu.getRowCount(); i++) {
            if (mamonan.equals(tbl_ChotDichVu.getValueAt(i, 0).toString())) {
                existingRow = i;
                isExisting = true;
                break;
            }
        }

        if (isExisting) {
            // Món đã tồn tại trong bảng tb_chotmonan, cập nhật số lượng và giá
            int currentSoluong = (int) tbl_ChotDichVu.getValueAt(existingRow, 2);
            tbl_ChotDichVu.setValueAt(currentSoluong + soluong, existingRow, 2);

            // Cập nhật giá dựa trên số lượng mới
            double giaTien = Double.parseDouble(giamonan);
            double giaTongCong = giaTien * (currentSoluong + soluong);
            tbl_ChotDichVu.setValueAt(giaTongCong, existingRow, 3);
        } else {
            // Món chưa tồn tại trong bảng tb_chotmonan, thêm mới món
            Object[] row = {mamonan, tenmonan, soluong, giamonan};
            tbl_ChotDichVu.addRow(row);
        }

        tinhTongTien();
        lb_ma.setText("");
        lb_ten.setText("");
        lb_gia.setText("");
        txt_soluongsp.setText("1");
    }//GEN-LAST:event_btn_themMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quaylaiActionPerformed

    private void btn_hoanthanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoanthanhActionPerformed
        tongphieu = lb_tongtien.getText();

        tbl_PhieuMonAn pma = new tbl_PhieuMonAn("", mahoadon, tongphieu);
        DatMonController.ThemPhieuMonAn(pma, mahoadon);
        for (int i = 0; i < tb_chotmonan.getRowCount(); i++) {
            mamonan = tb_chotmonan.getValueAt(i, 0).toString();
            soluong = Integer.parseInt(tb_chotmonan.getValueAt(i, 2).toString());
            giamonan = tb_chotmonan.getValueAt(i, 3).toString();
            int mapma = DatMonController.LayMaPMA(mahoadon);
            tbl_ChiTietMonAn ctma = new tbl_ChiTietMonAn("", mamonan, giamonan, mapma, soluong);
            DatMonController.ThemChiTietDatMon(ctma, mapma);
        }
        try {
            DatMonController.CapNhatHoaDon(mahoadon, tongphieu);
        } catch (SQLException ex) {
            Logger.getLogger(JF_NhaHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_hoanthanhActionPerformed

    private void btn_loaiboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loaiboMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();
        int selectedRow = tb_chotmonan.getSelectedRow();

        if (selectedRow != -1) {
            String tenMonAn = tbl_ChotDichVu.getValueAt(selectedRow, 0).toString();
            int existingRow = -1;
            for (int i = 0; i < tbl_ChotDichVu.getRowCount(); i++) {
                if (tenMonAn.equals(tbl_ChotDichVu.getValueAt(i, 0).toString())) {
                    existingRow = i;
                    break;
                }
            }

            if (existingRow != -1) {
                int currentSoluong = (int) tbl_ChotDichVu.getValueAt(existingRow, 1);
                if (currentSoluong > 1) {
                    tbl_ChotDichVu.setValueAt(currentSoluong - 1, existingRow, 1);
                } else {
                    tbl_ChotDichVu.removeRow(selectedRow);
                }
            }
        }
        tinhTongTien();
    }//GEN-LAST:event_btn_loaiboMouseClicked

    private void tb_chotmonanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_chotmonanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_chotmonanMouseClicked

    private void btn_refreshdvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshdvMouseClicked
        try {
            LayNguonDV("", "");
        } catch (IOException ex) {
            Logger.getLogger(JF_NhaHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_refreshdvMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new JF_NhaHang().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(JF_NhaHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_giamsoluong2;
    private container.Button btn_hoanthanh;
    private javax.swing.JLabel btn_loaibo;
    private container.Button btn_quaylai;
    private javax.swing.JLabel btn_refreshdv;
    private javax.swing.JButton btn_them;
    private javax.swing.JLabel btn_themsoluong;
    private javax.swing.JLabel btn_timkiem;
    private javax.swing.JComboBox<String> cbb_tkdanhmuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lb_gia;
    private javax.swing.JLabel lb_ma;
    private javax.swing.JLabel lb_ten;
    private javax.swing.JLabel lb_tongtien;
    private javax.swing.JTable tb_chotmonan;
    private javax.swing.JTable tb_monan;
    private javax.swing.JTextField txt_soluongsp;
    private javax.swing.JTextField txt_tknoidung;
    // End of variables declaration//GEN-END:variables
}
