package view.hoatdong;

import controller.DatMonController;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.tbl_QuanLiTienIch;

public class JP_QuanLyTienIch extends javax.swing.JPanel {

    static DefaultTableModel model;
    static ArrayList<tbl_QuanLiTienIch> arrQuanLiTienIch = new ArrayList<>();

    public static String maphieudatphongString, mahoadonString, makhachhangString, tenkhachhangString, emailkhachhang, sdt, maphongString, ngaydenString, ngaydiString, songayluutruString,tongtienString;

    public JP_QuanLyTienIch() throws IOException, SQLException {
        initComponents();
        LayNguon("");
    }

    public static void LayNguon(String dk) throws IOException, SQLException {
        arrQuanLiTienIch = DatMonController.NguonQuanLiTienIch(dk);
        model = (DefaultTableModel) tb_qlphongtructuyen.getModel();
        model.setRowCount(0);
        arrQuanLiTienIch.forEach((KQ) -> {
            model.addRow(new Object[]{KQ.getMaphieudatphong(), KQ.getPhong(), KQ.getTenkhachhang(), KQ.getEmailkhachhang(), KQ.getSdt(), KQ.getNgayden(), KQ.getNgaydi(),
                KQ.getSongayolai(), KQ.getTongthanhtoan()});
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_mahoadon = new javax.swing.JLabel();
        lb_makh = new javax.swing.JLabel();
        lb_tenkh = new javax.swing.JLabel();
        lb_maphong = new javax.swing.JLabel();
        lb_ngayden = new javax.swing.JLabel();
        lb_ngaydi = new javax.swing.JLabel();
        lb_TongTien = new javax.swing.JLabel();
        btn_dongy = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_sodienthoai = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_qlphongtructuyen = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(76, 41, 211));
        jPanel1.setPreferredSize(new java.awt.Dimension(1140, 70));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Utility Management");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 710));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 120));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông Tin Chi Tiết");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setPreferredSize(new java.awt.Dimension(105, 100));
        jPanel4.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 590));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Mã Hoá Đơn:");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 23, 110, -1));

        jLabel26.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel26.setText("Tổng Tiền:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 110, -1));

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel15.setText("Ngày Đi:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 110, -1));

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel16.setText("Ngày Đến:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 110, -1));

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel10.setText("Phòng:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 113, 110, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Người Đặt:");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 83, 110, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Mã Khách Hàng:");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 53, 120, -1));

        lb_mahoadon.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_mahoadon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_mahoadon.setText(" ");
        jPanel8.add(lb_mahoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 210, -1));

        lb_makh.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_makh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_makh.setText(" ");
        jPanel8.add(lb_makh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, -1));

        lb_tenkh.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_tenkh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tenkh.setText(" ");
        jPanel8.add(lb_tenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, -1));

        lb_maphong.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_maphong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_maphong.setText(" ");
        jPanel8.add(lb_maphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, -1));

        lb_ngayden.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_ngayden.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_ngayden.setText(" ");
        jPanel8.add(lb_ngayden, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 210, -1));

        lb_ngaydi.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_ngaydi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_ngaydi.setText(" ");
        jPanel8.add(lb_ngaydi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, -1));

        lb_TongTien.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_TongTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TongTien.setText(" ");
        jPanel8.add(lb_TongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 210, -1));

        btn_dongy.setFont(new java.awt.Font("Montserrat", 3, 14)); // NOI18N
        btn_dongy.setText("Chuyển tới nhà hàng");
        btn_dongy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dongyMouseClicked(evt);
            }
        });
        btn_dongy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dongyActionPerformed(evt);
            }
        });
        jPanel8.add(btn_dongy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 270, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel11.setText("Email:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 100, -1));

        lb_email.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_email.setText(" ");
        jPanel8.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 210, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel12.setText("Số Điện Thoại:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 110, -1));

        lb_sodienthoai.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_sodienthoai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_sodienthoai.setText(" ");
        jPanel8.add(lb_sodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, -1));

        jPanel2.add(jPanel8, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tb_qlphongtructuyen.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tb_qlphongtructuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã PDP", "Phòng", "Họ Tên", "Email", "Số Điện Thoại", "Ngày Đến", "Ngày Đi", "Số Ngày lưu trú", "Tổng Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_qlphongtructuyen.setRowHeight(25);
        tb_qlphongtructuyen.setRowMargin(2);
        tb_qlphongtructuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_qlphongtructuyenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_qlphongtructuyen);
        if (tb_qlphongtructuyen.getColumnModel().getColumnCount() > 0) {
            tb_qlphongtructuyen.getColumnModel().getColumn(1).setPreferredWidth(35);
            tb_qlphongtructuyen.getColumnModel().getColumn(2).setPreferredWidth(50);
            tb_qlphongtructuyen.getColumnModel().getColumn(3).setPreferredWidth(50);
            tb_qlphongtructuyen.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/filter_35px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_qlphongtructuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_qlphongtructuyenMouseClicked
        try {
            int index = tb_qlphongtructuyen.getSelectedRow();
            TableModel model = tb_qlphongtructuyen.getModel();
            maphieudatphongString = model.getValueAt(index, 0).toString();
            maphongString = model.getValueAt(index, 1).toString();
            tenkhachhangString = model.getValueAt(index, 2).toString();
            emailkhachhang = model.getValueAt(index, 3).toString();
            sdt = model.getValueAt(index, 4).toString();
            ngaydenString = model.getValueAt(index, 5).toString();
            ngaydiString = model.getValueAt(index, 6).toString();
            songayluutruString = model.getValueAt(index, 7).toString();
            tongtienString = model.getValueAt(index, 8).toString();
            
            lb_mahoadon.setText( DatMonController.NguonTruyVanDuLieu("MaHoaDon",maphieudatphongString));
            lb_makh.setText(DatMonController.NguonTruyVanDuLieu("MaKhachHang",maphieudatphongString)) ;
            lb_tenkh.setText(tenkhachhangString);
            lb_maphong.setText(maphongString);
            lb_email.setText(emailkhachhang);
            lb_sodienthoai.setText(sdt);
            lb_ngayden.setText(ngaydenString);
            lb_ngaydi.setText(ngaydiString);
            lb_TongTien.setText(tongtienString);
//        MoKhoaBTN(conthieuString);
        } catch (IOException ex) {
            Logger.getLogger(JP_QuanLyTienIch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_qlphongtructuyenMouseClicked

    private void btn_dongyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dongyActionPerformed
    }//GEN-LAST:event_btn_dongyActionPerformed

    private void btn_dongyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dongyMouseClicked
        try {
            JFrame JF_NhaHang = new JF_NhaHang();
            JF_NhaHang.setVisible(true);
            JF_NhaHang.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(JP_QuanLyTienIch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dongyMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JFrame dialogBL = new JDiaLog_BoLocNhaHang();
        dialogBL.setVisible(true);
        dialogBL.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dongy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_TongTien;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_mahoadon;
    private javax.swing.JLabel lb_makh;
    private javax.swing.JLabel lb_maphong;
    private javax.swing.JLabel lb_ngayden;
    private javax.swing.JLabel lb_ngaydi;
    private javax.swing.JLabel lb_sodienthoai;
    private javax.swing.JLabel lb_tenkh;
    public static javax.swing.JTable tb_qlphongtructuyen;
    // End of variables declaration//GEN-END:variables
}
