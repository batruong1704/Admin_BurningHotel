package view;

import controller.DatMonController;
import controller.DatPhongController;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

public final class JF_DatMonB21 extends javax.swing.JFrame {

    DefaultTableModel tbl_MonAn, tbl_ChotDichVu;
    List<tbl_MonAn> arrMonAn = new ArrayList<>();
    private String b2_mamonan, b2_tenmonan, b2_giamonan, b2_tongphieu, b2_tiencoc;

    public JF_DatMonB21() throws IOException {
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

    private void TinhTongGia(DefaultTableModel bang, JLabel lb_cantinh) {
        Double TongTien = 0.0;
        for (int i = 0; i < bang.getRowCount(); i++) {
            if (bang.getValueAt(i, bang.getColumnCount() - 1) != null) {
                String giaTien = bang.getValueAt(i, bang.getColumnCount() - 1).toString();
                double gia = Double.parseDouble(giaTien);
                TongTien += gia;
            }
        }
        String tongTienSP = String.valueOf(TongTien);
        lb_cantinh.setText(tongTienSP);                      // Chuyển đổi kiểu int sang String

//        double giamonan = Double.parseDouble(lb_b2_tonggiamonan.getText());
//        double giaphong = Double.parseDouble(lb_b2_tonggiaphong.getText());
//
//        double tong = giamonan + giaphong;
//        String tongphieu = String.valueOf(tong);
//        lb_b2_tongphieumonan.setText(tongphieu);
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
        jPanel21 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lb_b2_tongphieudv = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btn_hoanthanh = new container.Button();
        btn_quaylai = new container.Button();
        jPanel2 = new javax.swing.JPanel();
        btn_b2_loaibo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_chotmonan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        lb_b2_ma = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lb_b2_ten = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lb_b2_gia = new javax.swing.JLabel();
        btn_b2_them = new javax.swing.JButton();
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
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 60));

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bộ lọc:");

        btn_b2_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        btn_b2_timkiem.setText("jLabel14");

        btn_b2_refreshdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh_26px_light.png"))); // NOI18N
        btn_b2_refreshdv.setText("jLabel14");

        txt_tknoidung.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cb_tkdanhmuc, 0, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tknoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_b2_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_b2_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_b2_timkiem)
                        .addComponent(btn_b2_refreshdv)
                        .addComponent(txt_tknoidung))
                    .addComponent(cb_tkdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel20.add(jPanel6, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(340, 640));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(340, 470));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(340, 60));

        lb_b2_tongphieudv.setFont(new java.awt.Font("Montserrat Medium", 3, 20)); // NOI18N
        lb_b2_tongphieudv.setForeground(new java.awt.Color(255, 0, 0));
        lb_b2_tongphieudv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_b2_tongphieudv.setText("0");

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
                        .addComponent(lb_b2_tongphieudv, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_b2_tongphieudv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btn_b2_loaibo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_b2_loaibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_25px.png"))); // NOI18N
        btn_b2_loaibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_b2_loaiboMouseClicked(evt);
            }
        });
        jPanel2.add(btn_b2_loaibo, java.awt.BorderLayout.LINE_END);

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
                "TenMon", "SoLuong", "Giá"
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

        jPanel3.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jLabel28.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel28.setText("Mã Món:");

        lb_b2_ma.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_b2_ma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel30.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel30.setText("Tên Món:");

        lb_b2_ten.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_b2_ten.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel34.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel34.setText("Giá:");

        lb_b2_gia.setFont(new java.awt.Font("Montserrat Medium", 3, 16)); // NOI18N
        lb_b2_gia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btn_b2_them.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_b2_them.setText("Thêm");
        btn_b2_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_b2_themMouseClicked(evt);
            }
        });
        btn_b2_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b2_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_b2_ma, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(lb_b2_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_b2_gia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_b2_them)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_b2_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_b2_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_b2_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_b2_them)
                .addContainerGap(55, Short.MAX_VALUE))
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

        jPanel8.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_b2_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_b2_themMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();
        b2_mamonan = lb_b2_ma.getText();
        b2_tenmonan = lb_b2_ten.getText();
        b2_giamonan = lb_b2_gia.getText();
        boolean skt = false;
        // Kiểm tra trùng lặp với cột đầu tiên của bảng
        for (int i = 0; i < tbl_ChotDichVu.getRowCount(); i++) {
            if (tbl_ChotDichVu.getValueAt(i, 0) != null && tbl_ChotDichVu.getValueAt(i, 0).equals(b2_mamonan)) {
                skt = true;
                break;
            }
        }
        if (skt) {
            JOptionPane.showMessageDialog(this, "Dịch vụ này đã có, không thể thêm mới", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        } else {
            Object[] row = {b2_mamonan, b2_tenmonan, b2_giamonan};
            tbl_ChotDichVu.addRow(row);
//            TinhTongGia(tbl_ChotDichVu, lb_b2_tonggiamonan);
        }
    }//GEN-LAST:event_btn_b2_themMouseClicked

    private void btn_b2_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b2_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_b2_themActionPerformed

    private void btn_b2_loaiboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_b2_loaiboMouseClicked
        tbl_ChotDichVu = (DefaultTableModel) tb_chotmonan.getModel();

        int row = tb_chotmonan.getSelectedRow(); // Lấy số hàng được chọn trong bảng
        if (row != -1) { // Kiểm tra xem hàng có được chọn không
            tbl_ChotDichVu.removeRow(row);
        }

//        TinhTongGia(tbl_ChotDichVu, lb_b2_tonggiamonan); // tính tổng giá trị của tất cả các hàng trong bảng
    }//GEN-LAST:event_btn_b2_loaiboMouseClicked

    private void tb_chotmonanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_chotmonanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_chotmonanMouseClicked

    private void tb_monanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_monanMouseClicked
        int index = tb_monan.getSelectedRow();
        TableModel model = tb_monan.getModel();
        lb_b2_ma.setText(model.getValueAt(index, 0).toString());
        lb_b2_ten.setText(model.getValueAt(index, 1).toString());
        lb_b2_gia.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_tb_monanMouseClicked

    private void btn_hoanthanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoanthanhActionPerformed
        try {
            b2_giamonan = lb_b2_gia.getText();
            if (b2_giamonan.isEmpty()) {
                b2_giamonan = "0";
            }
            tbl_PhieuBonus cnmonan = new tbl_PhieuBonus("", JP_DatPhong.maPhieuDk, b2_giamonan);
            DatPhongController.ThemPhieuBonus(cnmonan, "MaPDV", "PhieuDichVu", "PDV");

            for (int i = 0; i < tb_chotmonan.getRowCount(); i++) {
                b2_mamonan = tb_chotmonan.getValueAt(i, 0).toString();
                b2_giamonan = tb_chotmonan.getValueAt(i, 2).toString();
                tbl_CTPhieuDV cnCTPDV = new tbl_CTPhieuDV("", "", b2_mamonan, b2_giamonan);
                DatPhongController.ThemCTPhieuDichVu(cnCTPDV);
            }
            //            double tongmonan = Double.parseDouble(lb_b2_tonggiamonan.getText());
            double tongphong = Double.parseDouble(JP_DatPhong.tinhTien);

            //            b2_tongphieu = String.valueOf(tongphong + tongmonan);
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String ngayHienTai = currentDate.format(formatter);
            //            b2_tiencoc = txt_b2_tiencoc.getText();
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
            Logger.getLogger(JF_DatMonB21.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_hoanthanhActionPerformed

    private void btn_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quaylaiActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new JF_DatMonB21().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(JF_DatMonB21.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_b2_loaibo;
    private javax.swing.JLabel btn_b2_refreshdv;
    private javax.swing.JButton btn_b2_them;
    private javax.swing.JLabel btn_b2_timkiem;
    private container.Button btn_hoanthanh;
    private container.Button btn_quaylai;
    private javax.swing.JComboBox<String> cb_tkdanhmuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel lb_b2_gia;
    private javax.swing.JLabel lb_b2_ma;
    private javax.swing.JLabel lb_b2_ten;
    private javax.swing.JLabel lb_b2_tongphieudv;
    private javax.swing.JTable tb_chotmonan;
    private javax.swing.JTable tb_monan;
    private javax.swing.JTextField txt_tknoidung;
    // End of variables declaration//GEN-END:variables
}
