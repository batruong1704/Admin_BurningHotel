package view.hoatdong;

import controller.DatMonController;
import controller.DatPhongController;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.tbl_CTPhieuDV;
import model.tbl_MonAn;
import model.tbl_HoaDon;
import model.tbl_PhieuBonus;
import view.Home;

public final class JF_NhaHang extends javax.swing.JFrame {

    DefaultTableModel tbl_MonAn, tbl_ChotDichVu;
    List<tbl_MonAn> arrMonAn = new ArrayList<>();
    private String mamonan, tenmonan, giamonan, tongphieu, tiencoc;
    int soluong;
    private final HashMap<String, Integer> monanHashMap = new HashMap<>();

    public JF_NhaHang() throws IOException {
        initComponents();
        LayNguonDV();
        hienThiDanhSachPhanLoai();
    }

    public void LayNguonDV() throws IOException {
        tbl_MonAn = (DefaultTableModel) tb_monan.getModel();
        arrMonAn = DatMonController.NguonMonAn("", "");
        tbl_MonAn.setRowCount(0);
        arrMonAn.forEach((KQ) -> {
            tbl_MonAn.addRow(new Object[]{KQ.getID(), KQ.getTenMon(), KQ.getPhanLoai(), KQ.getThanhTien(), KQ.getSoLuongDaBan()});
        });
    }

    public void hienThiDanhSachPhanLoai() {
        ArrayList<String> danhSachPhanLoai = DatMonController.layDanhSachPhanLoai();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(danhSachPhanLoai.toArray(new String[0]));
        cb_tkdanhmuc.setModel(model);
    }

    private void tinhTongTien() {
        DefaultTableModel tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();
        double tongTien = 0.0;

        for (int i = 0; i < tbl_ChotDichVu.getRowCount(); i++) {
            if (tbl_ChotDichVu.getValueAt(i, 2) != null) {
                String giaTien = tbl_ChotDichVu.getValueAt(i, 2).toString();
                double gia = Double.parseDouble(giaTien);
                int soLuong = Integer.parseInt(tbl_ChotDichVu.getValueAt(i, 1).toString());
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
        cb_tkdanhmuc = new javax.swing.JComboBox<>();
        btn_b2_timkiem = new javax.swing.JLabel();
        btn_b2_refreshdv = new javax.swing.JLabel();
        txt_tknoidung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lb_tongtien = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btn_hoanthanh = new container.Button();
        btn_quaylai = new container.Button();
        jPanel2 = new javax.swing.JPanel();
        btn_loaibo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_chotmonan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        lb_ma = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lb_ten = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lb_gia = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_themsoluong = new javax.swing.JLabel();
        txt_soluongsp = new javax.swing.JTextField();
        btn_giamsoluong2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_monan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel20.setBackground(new java.awt.Color(76, 41, 211));
        jPanel20.setPreferredSize(new java.awt.Dimension(1100, 60));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(76, 41, 211));
        jPanel6.setPreferredSize(new java.awt.Dimension(380, 60));

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bộ lọc:");

        cb_tkdanhmuc.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        btn_b2_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        btn_b2_timkiem.setText("jLabel14");

        btn_b2_refreshdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh_26px_light.png"))); // NOI18N
        btn_b2_refreshdv.setText("jLabel14");

        txt_tknoidung.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cb_tkdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tknoidung, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_b2_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_b2_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_b2_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_b2_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cb_tkdanhmuc)
                                .addComponent(txt_tknoidung)))))
                .addGap(18, 18, 18))
        );

        jPanel20.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Restaurant");
        jPanel20.add(jLabel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(340, 640));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(340, 510));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(340, 70));

        lb_tongtien.setFont(new java.awt.Font("Montserrat Medium", 3, 20)); // NOI18N
        lb_tongtien.setForeground(new java.awt.Color(255, 0, 0));
        lb_tongtien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tongtien.setText("0");

        jLabel38.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        jLabel38.setText("Tổng:");

        btn_hoanthanh.setText("Hoàn Thành");
        btn_hoanthanh.setBorderColor(new java.awt.Color(0, 0, 255));
        btn_hoanthanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hoanthanhActionPerformed(evt);
            }
        });

        btn_quaylai.setText("Quay Lại");
        btn_quaylai.setBorderColor(new java.awt.Color(0, 0, 255));
        btn_quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hoanthanh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hoanthanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 25));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btn_loaibo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_loaibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_25px.png"))); // NOI18N
        btn_loaibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loaiboMouseClicked(evt);
            }
        });
        jPanel2.add(btn_loaibo, java.awt.BorderLayout.LINE_END);

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lựa chọn món");
        jPanel2.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        tb_chotmonan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_chotmonan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Món", "Số Lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            tb_chotmonan.getColumnModel().getColumn(1).setPreferredWidth(20);
            tb_chotmonan.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jPanel3.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel28.setText("Mã Món:");

        lb_ma.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_ma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel30.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel30.setText("Tên Món:");

        lb_ten.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_ten.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel34.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel34.setText("Giá:");

        lb_gia.setFont(new java.awt.Font("Montserrat Medium", 3, 16)); // NOI18N
        lb_gia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btn_them.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_them.setText("Thêm");
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

        btn_themsoluong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_themsoluong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sum_25px.png"))); // NOI18N
        btn_themsoluong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themsoluongMouseClicked(evt);
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

        btn_giamsoluong2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_giamsoluong2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus_25px.png"))); // NOI18N
        btn_giamsoluong2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_giamsoluong2MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel35.setText("Số Lượng:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_giamsoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt_soluongsp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(btn_themsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_gia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(lb_ten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_ma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_soluongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_giamsoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_themsoluong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btn_them)))))
                .addGap(12, 12, 12))
        );

        jPanel21.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel21, java.awt.BorderLayout.LINE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(762, 30));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lựa chọn món");
        jPanel7.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

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
        tb_monan.setRowMargin(5);
        tb_monan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_monanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_monan);
        if (tb_monan.getColumnModel().getColumnCount() > 0) {
            tb_monan.getColumnModel().getColumn(0).setPreferredWidth(15);
            tb_monan.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb_monan.getColumnModel().getColumn(2).setPreferredWidth(50);
            tb_monan.getColumnModel().getColumn(3).setPreferredWidth(30);
            tb_monan.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel8.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();
        mamonan = lb_ma.getText();
        tenmonan = lb_ten.getText();
        giamonan = lb_gia.getText();
        soluong = Integer.parseInt(txt_soluongsp.getText());

        if (mamonan.isEmpty() || tenmonan.isEmpty() || giamonan.isEmpty()) {
            return;
        }

        // Kiểm tra xem sản phẩm đã tồn tại trong bảng chưa
        int existingRow = -1;
        for (int i = 0; i < tbl_ChotDichVu.getRowCount(); i++) {
            if (tenmonan.equals(tbl_ChotDichVu.getValueAt(i, 0).toString())) {
                existingRow = i;
                break;
            }
        }

        if (existingRow != -1) {
            // Sản phẩm đã tồn tại, cập nhật số lượng
            int currentSoluong = (int) tbl_ChotDichVu.getValueAt(existingRow, 1);
            tbl_ChotDichVu.setValueAt(currentSoluong + soluong, existingRow, 1);
        } else {
            // Sản phẩm chưa tồn tại, thêm sản phẩm mới
            Object[] row = {tenmonan, soluong, giamonan};
            tbl_ChotDichVu.addRow(row);
        }
        tinhTongTien();
        // Xoá nội dung và đặt lại txt_soluongsp = 1
        lb_ma.setText("");
        lb_ten.setText("");
        lb_gia.setText("");
        txt_soluongsp.setText("1");
    }//GEN-LAST:event_btn_themMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_loaiboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loaiboMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();
        int selectedRow = tb_chotmonan.getSelectedRow();

        if (selectedRow != -1) {
            String tenMonAn = tbl_ChotDichVu.getValueAt(selectedRow, 0).toString();

            // Kiểm tra xem sản phẩm có cùng tên đã tồn tại trong bảng chưa
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
                    // Nếu số lượng lớn hơn 1, giảm số lượng
                    tbl_ChotDichVu.setValueAt(currentSoluong - 1, existingRow, 1);
                } else {
                    // Nếu số lượng bằng 1, xoá hàng
                    tbl_ChotDichVu.removeRow(selectedRow);
                }
            }
        }
        tinhTongTien();
    }//GEN-LAST:event_btn_loaiboMouseClicked

    private void tb_chotmonanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_chotmonanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_chotmonanMouseClicked

    private void tb_monanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_monanMouseClicked
        int index = tb_monan.getSelectedRow();
        TableModel model = tb_monan.getModel();
        lb_ma.setText(model.getValueAt(index, 0).toString());
        lb_ten.setText(model.getValueAt(index, 1).toString());
        lb_gia.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_tb_monanMouseClicked

    private void btn_hoanthanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoanthanhActionPerformed
//        try {
//            giamonan = lb_gia.getText();
//            if (giamonan.isEmpty()) {
//                giamonan = "0";
//            }
//            tbl_PhieuBonus cnmonan = new tbl_PhieuBonus("", JP_DatPhong.maPhieuDk, giamonan);
//            DatPhongController.ThemPhieuBonus(cnmonan, "MaPDV", "PhieuDichVu", "PDV");
//
//            for (int i = 0; i < tb_chotmonan.getRowCount(); i++) {
//                mamonan = tb_chotmonan.getValueAt(i, 0).toString();
//                giamonan = tb_chotmonan.getValueAt(i, 2).toString();
//                tbl_CTPhieuDV cnCTPDV = new tbl_CTPhieuDV("", "", mamonan, giamonan);
//                DatPhongController.ThemCTPhieuDichVu(cnCTPDV);
//            }
//            //            double tongmonan = Double.parseDouble(lb_b2_tonggiamonan.getText());
//            double tongphong = Double.parseDouble(JP_DatPhong.tinhTien);
//
//            //            tongphieu = String.valueOf(tongphong + tongmonan);
//            LocalDate currentDate = LocalDate.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            String ngayHienTai = currentDate.format(formatter);
//            //            tiencoc = txt_tiencoc.getText();
//            if (tiencoc.isEmpty()) {
//                tiencoc = "0";
//            }
//            tbl_HoaDon cnhd = new tbl_HoaDon("", JP_DatPhong.maPhieuDk, "", "", ngayHienTai, tongphieu, tiencoc);
//            DatPhongController.ThemHoaDon(cnhd, tiencoc);
//            JOptionPane.showMessageDialog(this, "Đặt phòng Thành Công!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
//            dispose();
//            JFrame jf_Main = new Home();
//            jf_Main.setLocationRelativeTo(null);
//            jf_Main.setVisible(true);
//        } catch (SQLException ex) {
//            Logger.getLogger(JF_NhaHang.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_btn_hoanthanhActionPerformed

    private void btn_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quaylaiActionPerformed

    private void updateGia() {
        String giaStr = lb_gia.getText(); // Lấy giá ban đầu từ dữ liệu bảng
        double gia = Double.parseDouble(giaStr);

        String soLuongStr = txt_soluongsp.getText();
        int soLuong = Integer.parseInt(soLuongStr);

        double giaTongCong = gia * soLuong;
        lb_gia.setText(String.valueOf(giaTongCong)); // Cập nhật giá tổng cộng vào lb_gia
    }

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

    private void txt_soluongspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_soluongspFocusLost
        String soLuongStr = txt_soluongsp.getText();

        if (soLuongStr.isEmpty()) {
            // Nếu trường số lượng rỗng, đặt lại giá trị mặc định là 1
            txt_soluongsp.setText("1");
        } else {
            try {
                int soLuong = Integer.parseInt(soLuongStr);
                if (soLuong < 1 || soLuong > 9) {
                    JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ. Vui lòng nhập số lượng từ 1 đến 9.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    // Đặt lại giá trị mặc định là 1
                    txt_soluongsp.setText("1");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ. Vui lòng nhập số lượng từ 1 đến 9.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                // Đặt lại giá trị mặc định là 1
                txt_soluongsp.setText("1");
            }
        }
    }//GEN-LAST:event_txt_soluongspFocusLost

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
    private javax.swing.JLabel btn_b2_refreshdv;
    private javax.swing.JLabel btn_b2_timkiem;
    private javax.swing.JLabel btn_giamsoluong;
    private javax.swing.JLabel btn_giamsoluong1;
    private javax.swing.JLabel btn_giamsoluong2;
    private container.Button btn_hoanthanh;
    private javax.swing.JLabel btn_loaibo;
    private container.Button btn_quaylai;
    private javax.swing.JButton btn_them;
    private javax.swing.JLabel btn_themsoluong;
    private javax.swing.JComboBox<String> cb_tkdanhmuc;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
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
