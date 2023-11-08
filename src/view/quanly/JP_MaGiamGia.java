package view.quanly;

import controller.QuanLyController;
import model.tbl_KhachHang;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import controller.QuanLyKhachSanController;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import model.tbl_MaGiamGia;
public class JP_MaGiamGia extends javax.swing.JPanel {

    DefaultTableModel tbl_MaGiamGia;
    List<tbl_MaGiamGia> arrMaGiamGia = new ArrayList<>();
    private static boolean ktThem;
    private static String macu, sTimMaGiamGia;
    private static String magiamgia, tenmagiamgia, chietkhau, tinhtrang;

    private static DefaultTableCellRenderer center = new DefaultTableCellRenderer() {{
        setHorizontalAlignment(SwingConstants.CENTER);
    }};

    public JP_MaGiamGia() throws IOException {
        initComponents();
        XoaTrang();
        KhoaMo(false);
        LayNguon();
        LayNguonCBO();
        sTimMaGiamGia = "";
    }

    public void LayNguon() throws IOException {
        tbl_MaGiamGia = (DefaultTableModel)  tb_MaGiamGia.getModel();
        arrMaGiamGia = QuanLyController.NguonMaGiamGia(sTimMaGiamGia);
        tbl_MaGiamGia.setRowCount(0);
        arrMaGiamGia.forEach((KQ) -> {
            tbl_MaGiamGia.addRow(new Object[]{KQ.getMagiamgia(), KQ.getTenmagiamgia(), KQ.getChietkhau(), KQ.getTinhtrang()});
        });
    }
    public void LayNguonCBO() throws IOException {
        arrMaGiamGia = QuanLyController.NguonMaGiamGia(sTimMaGiamGia);
//        for (int i = 0; i < arrMaGiamGia.size(); i++) {
//            cbgioitinh.addItem(arrMaGiamGia.get(i).getGioitinh());
//        }
    }
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (value.equals("Còn Hạn Sử Dụng")) {
                c.setBackground(new Color( 102, 255, 102));
            } else {
                c.setBackground(table.getBackground());
            }
            return c;
        }
    };
    public void KhoaMo(boolean b) {
        txtmagiamgia.setEditable(b);
        txttenmagiamgia.setEditable(b);
        txtchietkhau.setEditable(b);
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_MaGiamGia.setEnabled(!b);
    }
    public void refresh(boolean b) {
        txtmagiamgia.setEditable(b);
        txttenmagiamgia.setEditable(b);
        txtchietkhau.setEditable(b);
        rdb_conhan.setSelected(false);
        rdb_hethan.setSelected(false);
        bt_them.setEnabled(b);
        bt_sua.setEnabled(b);
        bt_xoa.setEnabled(b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_MaGiamGia.setEnabled(b);
    }
    
    public void XoaTrang() {
        txtmagiamgia.setText("");
        txttenmagiamgia.setText("");
        txtchietkhau.setText("");
        rdb_conhan.setSelected(false);
        rdb_hethan.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txt_timkiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        bt_ghi = new javax.swing.JButton();
        bt_khong = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmagiamgia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttenmagiamgia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtchietkhau = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        rdb_conhan = new javax.swing.JRadioButton();
        rdb_hethan = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_MaGiamGia = new javax.swing.JTable();

        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1140, 780));
        setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(76, 41, 211));
        jPanel5.setPreferredSize(new java.awt.Dimension(1140, 70));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(76, 41, 211));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 70));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 10, 20));

        txt_timkiem.setBackground(new java.awt.Color(123, 156, 225));
        txt_timkiem.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_timkiem.setBorder(null);
        txt_timkiem.setMinimumSize(new java.awt.Dimension(100, 15));
        txt_timkiem.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel9.add(txt_timkiem);

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel8);

        jPanel5.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Discount Voucher");
        jPanel5.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(310, 710));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điều Khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N

        bt_ghi.setBackground(new java.awt.Color(0, 0, 255));
        bt_ghi.setFont(new java.awt.Font("Montserrat SemiBold", 1, 13)); // NOI18N
        bt_ghi.setForeground(new java.awt.Color(255, 255, 255));
        bt_ghi.setText("Ghi");
        bt_ghi.setPreferredSize(new java.awt.Dimension(130, 34));
        bt_ghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ghiActionPerformed(evt);
            }
        });

        bt_khong.setFont(new java.awt.Font("Montserrat Medium", 1, 13)); // NOI18N
        bt_khong.setForeground(new java.awt.Color(0, 0, 255));
        bt_khong.setText("Không");
        bt_khong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        bt_khong.setPreferredSize(new java.awt.Dimension(130, 34));
        bt_khong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_khongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_ghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ghi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cập Nhật ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N

        bt_them.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_them.setText("Thêm ");
        bt_them.setMaximumSize(new java.awt.Dimension(85, 25));
        bt_them.setMinimumSize(new java.awt.Dimension(85, 25));
        bt_them.setPreferredSize(new java.awt.Dimension(85, 25));
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });

        bt_sua.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_sua.setText("Sửa ");
        bt_sua.setMaximumSize(new java.awt.Dimension(85, 25));
        bt_sua.setMinimumSize(new java.awt.Dimension(85, 25));
        bt_sua.setPreferredSize(new java.awt.Dimension(85, 25));
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });

        bt_xoa.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_xoa.setText("Xóa ");
        bt_xoa.setMaximumSize(new java.awt.Dimension(55, 25));
        bt_xoa.setMinimumSize(new java.awt.Dimension(55, 25));
        bt_xoa.setPreferredSize(new java.awt.Dimension(55, 25));
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi Tiết ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel2.setText("Mã Giảm Giá:");

        txtmagiamgia.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtmagiamgia.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Tên Mã Giảm Giá:");

        txttenmagiamgia.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txttenmagiamgia.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txttenmagiamgia.setMinimumSize(new java.awt.Dimension(7, 25));
        txttenmagiamgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenmagiamgiaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("Chiết Khấu");

        txtchietkhau.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtchietkhau.setMargin(new java.awt.Insets(0, 2, 0, 0));

        lb4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb4.setText("Tình Trạng:");

        rdb_conhan.setBackground(new java.awt.Color(255, 255, 255));
        rdb_conhan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_conhan.setText("Còn hạn");
        rdb_conhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_conhanActionPerformed(evt);
            }
        });

        rdb_hethan.setBackground(new java.awt.Color(255, 255, 255));
        rdb_hethan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_hethan.setText("Hết hạn");
        rdb_hethan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_hethanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(lb4)
                        .addGap(26, 26, 26)
                        .addComponent(rdb_conhan, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdb_hethan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txttenmagiamgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmagiamgia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtchietkhau)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtmagiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txttenmagiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtchietkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(rdb_conhan)
                    .addComponent(rdb_hethan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(5, 700));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(5, 700));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel3, java.awt.BorderLayout.LINE_END);

        tb_MaGiamGia.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_MaGiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Giảm Giá", "Tên Mã Giảm Giá", "Chiết Khấu", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_MaGiamGia.setMinimumSize(new java.awt.Dimension(450, 100));
        tb_MaGiamGia.setRowHeight(25);
        tb_MaGiamGia.setRowMargin(5);
        tb_MaGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_MaGiamGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_MaGiamGia);
        if (tb_MaGiamGia.getColumnModel().getColumnCount() > 0) {
            tb_MaGiamGia.getColumnModel().getColumn(0).setPreferredWidth(4);
            tb_MaGiamGia.getColumnModel().getColumn(1).setPreferredWidth(200);
            tb_MaGiamGia.getColumnModel().getColumn(2).setPreferredWidth(20);
            tb_MaGiamGia.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(jPanel10, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        sTimMaGiamGia = txt_timkiem.getText();
        try{
            LayNguon();
        }catch(IOException ex){
            Logger.getLogger(JP_MaGiamGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        ktThem = true;
        macu = "";
        KhoaMo(true);
        XoaTrang();
        txtmagiamgia.requestFocus();
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        if (txtmagiamgia.getText().length() <= 0) {
            return;
        }
        macu = txtmagiamgia.getText();
        ktThem = false;
        KhoaMo(true);
        txtmagiamgia.requestFocus();
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        if (txtmagiamgia.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(this, "Hãy nhập thông tin cần xoá!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        macu = txtmagiamgia.getText();
        for (int i = 0; i < arrMaGiamGia.size(); i++) {
            if (arrMaGiamGia.get(i).getMagiamgia().equals(macu)) {
                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa mã giảm giá này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
                if (kq == JOptionPane.YES_OPTION) {
                    QuanLyController.XoaMaGiamGia(macu);
                    XoaTrang();
                    try {
                        LayNguon();
                    } catch (IOException ex) {
                        Logger.getLogger(JP_MaGiamGia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return;
            }
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void txttenmagiamgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenmagiamgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenmagiamgiaActionPerformed

    private void rdb_conhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_conhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_conhanActionPerformed

    private void rdb_hethanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_hethanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_hethanActionPerformed

    private void tb_MaGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_MaGiamGiaMouseClicked
        int index = tb_MaGiamGia.getSelectedRow();
        TableModel model = tb_MaGiamGia.getModel();
        magiamgia = model.getValueAt(index, 0).toString();
        tenmagiamgia = model.getValueAt(index, 1).toString();
        chietkhau = model.getValueAt(index, 2).toString();
        tinhtrang = model.getValueAt(index, 3).toString();
        txtmagiamgia.setText(magiamgia);
        txttenmagiamgia.setText(tenmagiamgia);
        txtchietkhau.setText(chietkhau);
        if(tinhtrang == "Còn Hạn Sử Dụng"){
            rdb_conhan.setSelected(true);
            rdb_hethan.setSelected(false);
        }else{
            rdb_conhan.setSelected(false);
            rdb_hethan.setSelected(true);
        }
    }//GEN-LAST:event_tb_MaGiamGiaMouseClicked

    private void bt_ghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ghiActionPerformed
        if (txtmagiamgia.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmagiamgia.requestFocus();
            return;
        }
        if (txttenmagiamgia.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txttenmagiamgia.requestFocus();
            return;
        }
        if (QuanLyKhachSanController.KiemTraTrungMa("PhieuGiamGia", "MaGiamGia", txtmagiamgia.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Mã ngành đã tồn tại trong cơ sở dữ liệu.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmagiamgia.requestFocus();
            return;
        }
        magiamgia = txtmagiamgia.getText();
        tenmagiamgia = txttenmagiamgia.getText();
        chietkhau = txtchietkhau.getText();
        if (rdb_conhan.isSelected()) {
            tinhtrang = "1";
        } else  {
            tinhtrang = "0";
        }
        tbl_MaGiamGia mgg = new tbl_MaGiamGia(magiamgia, tenmagiamgia, chietkhau, tinhtrang);
        if (ktThem == true) {
            QuanLyController.ThemMaGiamGia(mgg);
        } else {
            QuanLyController.CapNhapMaGiamGia(mgg, macu);
        }
        try {
            LayNguon();
        } catch (IOException ex) {
            Logger.getLogger(QuanLyKhachSanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        KhoaMo(false);
    }//GEN-LAST:event_bt_ghiActionPerformed

    private void bt_khongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_khongActionPerformed
        XoaTrang();
        KhoaMo(false);
        refresh(true);
    }//GEN-LAST:event_bt_khongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ghi;
    private javax.swing.JButton bt_khong;
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb4;
    private javax.swing.JRadioButton rdb_conhan;
    private javax.swing.JRadioButton rdb_hethan;
    private javax.swing.JTable tb_MaGiamGia;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txtchietkhau;
    private javax.swing.JTextField txtmagiamgia;
    private javax.swing.JTextField txttenmagiamgia;
    // End of variables declaration//GEN-END:variables
}
