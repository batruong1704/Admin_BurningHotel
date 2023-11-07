package view.hoatdong;

import controller.DatPhongController;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.tbl_CTPhieuDV;
import model.tbl_DichVu;
import model.tbl_HoaDon;
import model.tbl_MonAn;
import model.tbl_PhieuBonus;
import view.Home;

public final class JP_DatPhongB2 extends javax.swing.JFrame {

    DefaultTableModel tbl_DichVu_b2, tbl_SanPham_b2, tbl_ChotDichVu, tbl_ChotSanPham;
    List<tbl_DichVu> arrDichVu_b2 = new ArrayList<>();
    List<tbl_MonAn> arrSanPham_b2 = new ArrayList<>();
    private String b2_madv, b2_tendv, b2_giadv, b2_masp, b2_tensp, b2_soluongsp, b2_tongphieu, b2_tiencoc;

    public JP_DatPhongB2() throws IOException {
        initComponents();
        Buoc2_LayNguonDV();
        lb_b2_tonggiaphong.setText(JP_DatPhong.tinhTien);
    }

    public void Buoc2_LayNguonDV() throws IOException {
        tbl_DichVu_b2 = (DefaultTableModel) tb_dichvu.getModel();
        arrDichVu_b2 = DatPhongController.NguonDichVu("");
        tbl_DichVu_b2.setRowCount(0);
        arrDichVu_b2.forEach((KQ) -> {
            tbl_DichVu_b2.addRow(new Object[]{KQ.getMadichvu(), KQ.getTendichvu(), KQ.getGiadichvu()});
        });
    }

    private void TinhTongGia(DefaultTableModel bang, JLabel lb_cantinh) {
        Double b2_tongTienSP = 0.0;
        for (int i = 0; i < bang.getRowCount(); i++) {
            if (bang.getValueAt(i, bang.getColumnCount() - 1) != null) {
                String giaTien = bang.getValueAt(i, bang.getColumnCount() - 1).toString();
                double gia = Double.parseDouble(giaTien);
                b2_tongTienSP += gia;
            }
        }
        String tongTienSP = String.valueOf(b2_tongTienSP);
        lb_cantinh.setText(tongTienSP);                      // Chuyển đổi kiểu int sang String

        double giadv = Double.parseDouble(lb_b2_tonggiadv.getText());
        double giaphong = Double.parseDouble(lb_b2_tonggiaphong.getText());

        double tong = giadv + giaphong;
        String tongphieu = String.valueOf(tong);
        lb_b2_tongphieudv.setText(tongphieu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txt_b2_timkiemdv = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btn_b2_timkiemdv = new javax.swing.JLabel();
        btn_b2_refreshdv = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_b2_madv = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lb_b2_tendv = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lb_b2_giadv = new javax.swing.JLabel();
        btn_b2_themdv = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        lb_b2_tonggiadv = new javax.swing.JLabel();
        lb_b2_tonggiaphong = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lb_b2_tongphieudv = new javax.swing.JLabel();
        txt_b2_tiencoc = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        button1 = new container.Button();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_b2_loaibodichvu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_chotdichvu = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_dichvu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel20.setBackground(new java.awt.Color(76, 41, 211));
        jPanel20.setPreferredSize(new java.awt.Dimension(1100, 60));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(76, 41, 211));
        jPanel7.setPreferredSize(new java.awt.Dimension(340, 60));

        txt_b2_timkiemdv.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bộ lọc:");

        btn_b2_timkiemdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        btn_b2_timkiemdv.setText("jLabel14");

        btn_b2_refreshdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh_26px_light.png"))); // NOI18N
        btn_b2_refreshdv.setText("jLabel14");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_b2_timkiemdv, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_b2_timkiemdv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_b2_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(btn_b2_timkiemdv))
                        .addComponent(btn_b2_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(2, 2, 2)
                        .addComponent(txt_b2_timkiemdv, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jPanel20.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Service management");
        jPanel20.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(340, 720));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(340, 720));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 155));

        lb_b2_madv.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_b2_madv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel28.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel28.setText("Mã Dịch Vụ:");

        jLabel30.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel30.setText("Tên Dịch Vụ:");

        lb_b2_tendv.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_b2_tendv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel34.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel34.setText("Giá:");

        lb_b2_giadv.setFont(new java.awt.Font("Montserrat Medium", 3, 16)); // NOI18N
        lb_b2_giadv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btn_b2_themdv.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_b2_themdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sum_25px.png"))); // NOI18N
        btn_b2_themdv.setBorder(null);
        btn_b2_themdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_b2_themdvMouseClicked(evt);
            }
        });
        btn_b2_themdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b2_themdvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_b2_tendv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_b2_madv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_b2_giadv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_b2_themdv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addGap(0, 0, 0)
                .addComponent(lb_b2_madv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(0, 0, 0)
                .addComponent(lb_b2_tendv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_b2_giadv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_b2_themdv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(340, 145));

        jLabel35.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel35.setText("Tổng dịch vụ:");

        lb_b2_tonggiadv.setFont(new java.awt.Font("Montserrat Medium", 3, 16)); // NOI18N
        lb_b2_tonggiadv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_b2_tonggiadv.setText("0");

        lb_b2_tonggiaphong.setFont(new java.awt.Font("Montserrat Medium", 3, 16)); // NOI18N
        lb_b2_tonggiaphong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_b2_tonggiaphong.setText("0");

        jLabel37.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel37.setText("Tổng giá phòng:");

        jLabel38.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        jLabel38.setText("Tổng:");

        lb_b2_tongphieudv.setFont(new java.awt.Font("Montserrat Medium", 3, 20)); // NOI18N
        lb_b2_tongphieudv.setForeground(new java.awt.Color(255, 0, 0));
        lb_b2_tongphieudv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_b2_tongphieudv.setText("0");

        txt_b2_tiencoc.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel39.setText("Tiền cọc:");

        button1.setText("Hoàn Thành");
        button1.setBorderColor(new java.awt.Color(0, 0, 255));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_b2_tonggiaphong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_b2_tongphieudv, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(lb_b2_tonggiadv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_b2_tiencoc, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_b2_tonggiadv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_b2_tonggiaphong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_b2_tongphieudv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_b2_tiencoc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 25));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btn_b2_loaibodichvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_b2_loaibodichvu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_25px.png"))); // NOI18N
        btn_b2_loaibodichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_b2_loaibodichvuMouseClicked(evt);
            }
        });
        jPanel2.add(btn_b2_loaibodichvu, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dịch Vụ Đã Chọn");
        jPanel2.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        tb_chotdichvu.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_chotdichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Dịch Vụ", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_chotdichvu.setPreferredSize(new java.awt.Dimension(250, 160));
        tb_chotdichvu.setRowMargin(5);
        tb_chotdichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_chotdichvuMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tb_chotdichvu);
        if (tb_chotdichvu.getColumnModel().getColumnCount() > 0) {
            tb_chotdichvu.getColumnModel().getColumn(0).setPreferredWidth(5);
            tb_chotdichvu.getColumnModel().getColumn(1).setPreferredWidth(200);
            tb_chotdichvu.getColumnModel().getColumn(2).setPreferredWidth(29);
        }

        jPanel6.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(760, 30));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lựa chọn dịch vụ");
        jPanel11.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(10, 690));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel13, java.awt.BorderLayout.LINE_END);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tb_dichvu.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_dichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Dịch Vụ", "Tên Dịch Vụ", "Giá Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_dichvu.setRowHeight(22);
        tb_dichvu.setRowMargin(5);
        tb_dichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_dichvuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_dichvu);
        if (tb_dichvu.getColumnModel().getColumnCount() > 0) {
            tb_dichvu.getColumnModel().getColumn(0).setPreferredWidth(5);
            tb_dichvu.getColumnModel().getColumn(1).setPreferredWidth(250);
            tb_dichvu.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jPanel10.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_dichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dichvuMouseClicked
        int index = tb_dichvu.getSelectedRow();
        TableModel model = tb_dichvu.getModel();
        lb_b2_madv.setText(model.getValueAt(index, 0).toString());
        lb_b2_tendv.setText(model.getValueAt(index, 1).toString());
        lb_b2_giadv.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_tb_dichvuMouseClicked

    private void btn_b2_themdvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_b2_themdvMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotdichvu.getModel();
        b2_madv = lb_b2_madv.getText();
        b2_tendv = lb_b2_tendv.getText();
        b2_giadv = lb_b2_giadv.getText();
        boolean skt = false;
        // Kiểm tra trùng lặp với cột đầu tiên của bảng
        for (int i = 0; i < tbl_ChotDichVu.getRowCount(); i++) {
            if (tbl_ChotDichVu.getValueAt(i, 0) != null && tbl_ChotDichVu.getValueAt(i, 0).equals(b2_madv)) {
                skt = true;
                break;
            }
        }
        if (skt) {
            JOptionPane.showMessageDialog(this, "Dịch vụ này đã có, không thể thêm mới", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        } else {
            Object[] row = {b2_madv, b2_tendv, b2_giadv};
            tbl_ChotDichVu.addRow(row);
            TinhTongGia(tbl_ChotDichVu, lb_b2_tonggiadv);
        }
    }//GEN-LAST:event_btn_b2_themdvMouseClicked

    private void btn_b2_themdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b2_themdvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_b2_themdvActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try {
            b2_giadv = lb_b2_giadv.getText();
            if (b2_giadv.isEmpty()) {
                b2_giadv = "0";
            }
            tbl_PhieuBonus cndv = new tbl_PhieuBonus("", JP_DatPhong.maPhieuDk, b2_giadv);
            DatPhongController.ThemPhieuBonus(cndv, "MaPDV", "PhieuDichVu", "PDV");

            for (int i = 0; i < tb_chotdichvu.getRowCount(); i++) {
                b2_madv = tb_chotdichvu.getValueAt(i, 0).toString();
                b2_giadv = tb_chotdichvu.getValueAt(i, 2).toString();
                tbl_CTPhieuDV cnCTPDV = new tbl_CTPhieuDV("", "", b2_madv, b2_giadv);
                DatPhongController.ThemCTPhieuDichVu(cnCTPDV);
            }
            double tongdv = Double.parseDouble(lb_b2_tonggiadv.getText());
            double tongphong = Double.parseDouble(JP_DatPhong.tinhTien);

            b2_tongphieu = String.valueOf(tongphong + tongdv);
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String ngayHienTai = currentDate.format(formatter);
            b2_tiencoc = txt_b2_tiencoc.getText();
            if (b2_tiencoc.isEmpty()) {
                b2_tiencoc = "0";
            }
            tbl_HoaDon cnhd = new tbl_HoaDon("", JP_DatPhong.maPhieuDk, "", "", ngayHienTai, b2_tongphieu, b2_tiencoc);
            DatPhongController.ThemHoaDon(cnhd, b2_tiencoc);
            JOptionPane.showMessageDialog(this, "Đặt phòng Thành Công!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            JFrame jf_Main = new Home();
            jf_Main.setLocationRelativeTo(null);
            jf_Main.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(JP_DatPhongB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void btn_b2_loaibodichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_b2_loaibodichvuMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotdichvu.getModel();

        int row = tb_chotdichvu.getSelectedRow(); // Lấy số hàng được chọn trong bảng
        if (row != -1) { // Kiểm tra xem hàng có được chọn không
            tbl_ChotDichVu.removeRow(row);
        }

        TinhTongGia(tbl_ChotDichVu, lb_b2_tonggiadv); // tính tổng giá trị của tất cả các hàng trong bảng
    }//GEN-LAST:event_btn_b2_loaibodichvuMouseClicked

    private void tb_chotdichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_chotdichvuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_chotdichvuMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new JP_DatPhongB2().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(JP_DatPhongB2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_b2_loaibodichvu;
    private javax.swing.JLabel btn_b2_refreshdv;
    private javax.swing.JButton btn_b2_themdv;
    private javax.swing.JLabel btn_b2_timkiemdv;
    private container.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JLabel lb_b2_giadv;
    private javax.swing.JLabel lb_b2_madv;
    private javax.swing.JLabel lb_b2_tendv;
    private javax.swing.JLabel lb_b2_tonggiadv;
    private javax.swing.JLabel lb_b2_tonggiaphong;
    private javax.swing.JLabel lb_b2_tongphieudv;
    private javax.swing.JTable tb_chotdichvu;
    private javax.swing.JTable tb_dichvu;
    private javax.swing.JTextField txt_b2_tiencoc;
    private javax.swing.JTextField txt_b2_timkiemdv;
    // End of variables declaration//GEN-END:variables
}
