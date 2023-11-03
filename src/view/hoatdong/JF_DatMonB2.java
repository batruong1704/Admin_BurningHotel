package view.hoatdong;

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

public final class JF_DatMonB2 extends javax.swing.JFrame {

    DefaultTableModel tbl_MonAn, tbl_ChotDichVu;
    List<tbl_MonAn> arrMonAn = new ArrayList<>();
    private String b2_mamonan, b2_tenmonan, b2_giamonan, b2_tongphieu, b2_tiencoc;

    public JF_DatMonB2() throws IOException {
        initComponents();
        Buoc2_LayNguonDV();
    }

    public void Buoc2_LayNguonDV() throws IOException {
        tbl_MonAn = (DefaultTableModel) tb_monan.getModel();
        arrMonAn = DatMonController.NguonMonAn("", "");
        tbl_MonAn.setRowCount(0);
        arrMonAn.forEach((KQ) -> {
            tbl_MonAn.addRow(new Object[]{KQ.getID(), KQ.getTenMon(), KQ.getPhanLoai(), KQ.getThanhTien(), KQ.getSoLuongDaBan()});
        });
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
        jPanel21 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        lb_b2_tongphieudv = new javax.swing.JLabel();
        button1 = new container.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_b2_loaibo = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_chotmonan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_monan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_b2_refreshdv = new javax.swing.JLabel();
        lb_b2_ten = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lb_b2_ma = new javax.swing.JLabel();
        lb_b2_gia = new javax.swing.JLabel();
        btn_b2_timkiem = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_b2_timkiem = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btn_b2_them = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel20.setBackground(new java.awt.Color(76, 41, 211));
        jPanel20.setPreferredSize(new java.awt.Dimension(1100, 60));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1102, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(340, 640));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(340, 180));

        jLabel38.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        jLabel38.setText("Tổng:");

        lb_b2_tongphieudv.setFont(new java.awt.Font("Montserrat Medium", 3, 20)); // NOI18N
        lb_b2_tongphieudv.setForeground(new java.awt.Color(255, 0, 0));
        lb_b2_tongphieudv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_b2_tongphieudv.setText("0");

        button1.setText("Hoàn Thành");
        button1.setBorderColor(new java.awt.Color(0, 0, 255));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_b2_tongphieudv, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 216, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_b2_tongphieudv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 25));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Danh Sách Đã Chọn");
        jPanel2.add(jLabel3, java.awt.BorderLayout.CENTER);

        btn_b2_loaibo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_b2_loaibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_25px.png"))); // NOI18N
        btn_b2_loaibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_b2_loaiboMouseClicked(evt);
            }
        });
        jPanel2.add(btn_b2_loaibo, java.awt.BorderLayout.LINE_END);

        jPanel21.add(jPanel2, java.awt.BorderLayout.PAGE_START);

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
        if (tb_chotmonan.getColumnModel().getColumnCount() > 0) {
            tb_chotmonan.getColumnModel().getColumn(0).setPreferredWidth(100);
            tb_chotmonan.getColumnModel().getColumn(1).setPreferredWidth(20);
            tb_chotmonan.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jPanel21.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel21, java.awt.BorderLayout.LINE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
            tb_monan.getColumnModel().getColumn(0).setPreferredWidth(20);
            tb_monan.getColumnModel().getColumn(1).setPreferredWidth(70);
            tb_monan.getColumnModel().getColumn(2).setPreferredWidth(25);
            tb_monan.getColumnModel().getColumn(3).setPreferredWidth(25);
            tb_monan.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lựa chọn món");

        btn_b2_refreshdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh_25px.png"))); // NOI18N
        btn_b2_refreshdv.setText("jLabel14");

        lb_b2_ten.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_b2_ten.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel28.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel28.setText("Mã Món:");

        lb_b2_ma.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        lb_b2_ma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lb_b2_gia.setFont(new java.awt.Font("Montserrat Medium", 3, 16)); // NOI18N
        lb_b2_gia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btn_b2_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_dark_26px.png"))); // NOI18N
        btn_b2_timkiem.setText("jLabel14");

        jLabel34.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel34.setText("Giá:");

        txt_b2_timkiem.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setText("Bộ lọc:");

        jLabel30.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel30.setText("Tên Món:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_b2_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_b2_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_b2_refreshdv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_b2_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lb_b2_gia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_b2_them))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_b2_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_b2_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_b2_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_b2_timkiem)
                        .addComponent(btn_b2_refreshdv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_b2_them)
                    .addComponent(lb_b2_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_b2_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_monanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_monanMouseClicked
        int index = tb_monan.getSelectedRow();
        TableModel model = tb_monan.getModel();
        lb_b2_ma.setText(model.getValueAt(index, 0).toString());
        lb_b2_ten.setText(model.getValueAt(index, 1).toString());
        lb_b2_gia.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_tb_monanMouseClicked

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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
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
            Logger.getLogger(JF_DatMonB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new JF_DatMonB2().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(JF_DatMonB2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_b2_loaibo;
    private javax.swing.JLabel btn_b2_refreshdv;
    private javax.swing.JButton btn_b2_them;
    private javax.swing.JLabel btn_b2_timkiem;
    private container.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lb_b2_gia;
    private javax.swing.JLabel lb_b2_ma;
    private javax.swing.JLabel lb_b2_ten;
    private javax.swing.JLabel lb_b2_tongphieudv;
    private javax.swing.JTable tb_chotmonan;
    private javax.swing.JTable tb_monan;
    private javax.swing.JTextField txt_b2_timkiem;
    // End of variables declaration//GEN-END:variables
}
