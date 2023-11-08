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
import javax.swing.table.TableModel;
import controller.QuanLyKhachSanController;
public class JP_KhachHang extends javax.swing.JPanel {

    DefaultTableModel tbl_KhachHang;
    List<tbl_KhachHang> arrKhachHang = new ArrayList<>();
    private static boolean ktThem;
    private static String macu, sTimKhachHang;
    private static String makh, tenkh, diachi, email,gioitinh, cmnd, sodt;

    private static DefaultTableCellRenderer center = new DefaultTableCellRenderer() {{
        setHorizontalAlignment(SwingConstants.CENTER);
    }};

    public JP_KhachHang() throws IOException {
        initComponents();
        XoaTrang();
        KhoaMo(false);
        LayNguon();
        LayNguonCBO();
        sTimKhachHang = "";
    }

    public void LayNguon() throws IOException {
        tbl_KhachHang = (DefaultTableModel)  tb_KhachHang.getModel();
        arrKhachHang = QuanLyController.NguonKhachHang(sTimKhachHang);
        tbl_KhachHang.setRowCount(0);
        arrKhachHang.forEach((KQ) -> {
            tbl_KhachHang.addRow(new Object[]{KQ.getMakh(), KQ.getTenkh(),KQ.getSdt(),KQ.getEmail(),KQ.getCmnd(), KQ.getDiachi(), KQ.getGioitinh()});
        });
    }
    public void LayNguonCBO() throws IOException {
        arrKhachHang = QuanLyController.NguonKhachHang(sTimKhachHang);
    }
    public void KhoaMo(boolean b) {
        txtmakh.setEditable(b);
        txttenkh.setEditable(b);
        txtdiachi.setEditable(b);
        txtcmnd.setEditable(b);
        txtsdt.setEditable(b);
        txtemail.setEditable(b);
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_KhachHang.setEnabled(!b);
    }
    public void refresh(boolean b) {
        txtmakh.setEditable(b);
        txttenkh.setEditable(b);
        txtdiachi.setEditable(b);
        txtemail.setEditable(b);
        rdb_Nam.setSelected(false);
        rdb_Nu.setSelected(false);
        txtcmnd.setEditable(b);
        txtsdt.setEditable(b);
        bt_them.setEnabled(b);
        bt_sua.setEnabled(b);
        bt_xoa.setEnabled(b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_KhachHang.setEnabled(b);
    }
    
    public void XoaTrang() {
        txtmakh.setText("");
        txttenkh.setText("");
        txtdiachi.setText("");
        txtemail.setText("");
        rdb_Nam.setSelected(false);
        rdb_Nu.setSelected(false);
        txtcmnd.setText("");
        txtsdt.setText("");
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
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmakh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttenkh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcmnd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        rdb_Nam = new javax.swing.JRadioButton();
        rdb_Nu = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bt_ghi = new javax.swing.JButton();
        bt_khong = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_KhachHang = new javax.swing.JTable();

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
        jLabel1.setText("Customer management");
        jPanel5.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(330, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi Tiết ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel2.setText("Mã Khách Hàng:");

        txtmakh.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtmakh.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Tên Khách Hàng: ");

        txttenkh.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txttenkh.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txttenkh.setMinimumSize(new java.awt.Dimension(7, 25));
        txttenkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenkhActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("Địa Chỉ:");

        txtdiachi.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtdiachi.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel5.setText("Giới Tính:");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setText("CMND/CCCD:");

        txtcmnd.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtcmnd.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel7.setText("SĐT:");

        txtsdt.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtsdt.setMargin(new java.awt.Insets(0, 2, 0, 0));

        rdb_Nam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdb_Nam);
        rdb_Nam.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_Nam.setLabel("Nam");

        rdb_Nu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdb_Nu);
        rdb_Nu.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_Nu.setLabel("Nữ");

        jLabel9.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmakh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttenkh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsdt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcmnd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdb_Nam)
                                        .addGap(50, 50, 50)
                                        .addComponent(rdb_Nu))
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txttenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdb_Nam)
                    .addComponent(rdb_Nu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cập Nhật ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điều Khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N

        bt_ghi.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_ghi.setText("Ghi");
        bt_ghi.setMaximumSize(new java.awt.Dimension(85, 25));
        bt_ghi.setMinimumSize(new java.awt.Dimension(85, 25));
        bt_ghi.setPreferredSize(new java.awt.Dimension(85, 25));
        bt_ghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ghiActionPerformed(evt);
            }
        });

        bt_khong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_khong.setText("Không");
        bt_khong.setMaximumSize(new java.awt.Dimension(85, 25));
        bt_khong.setMinimumSize(new java.awt.Dimension(85, 25));
        bt_khong.setPreferredSize(new java.awt.Dimension(85, 25));
        bt_khong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_khongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(bt_ghi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ghi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tb_KhachHang.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Khách Hàng ", "SĐT", "Email", "CMND/CCCD", "Địa Chỉ ", "Giới Tính "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_KhachHang.setMinimumSize(new java.awt.Dimension(450, 100));
        tb_KhachHang.setRowHeight(25);
        tb_KhachHang.setRowMargin(5);
        tb_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_KhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_KhachHang);
        if (tb_KhachHang.getColumnModel().getColumnCount() > 0) {
            tb_KhachHang.getColumnModel().getColumn(0).setPreferredWidth(10);
            tb_KhachHang.getColumnModel().getColumn(0).setCellRenderer(center);
            tb_KhachHang.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb_KhachHang.getColumnModel().getColumn(2).setPreferredWidth(20);
            tb_KhachHang.getColumnModel().getColumn(2).setCellRenderer(center);
            tb_KhachHang.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_KhachHang.getColumnModel().getColumn(4).setPreferredWidth(30);
            tb_KhachHang.getColumnModel().getColumn(4).setCellRenderer(center);
            tb_KhachHang.getColumnModel().getColumn(5).setPreferredWidth(40);
            tb_KhachHang.getColumnModel().getColumn(6).setPreferredWidth(20);
            tb_KhachHang.getColumnModel().getColumn(6).setCellRenderer(center);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel10, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        sTimKhachHang = txt_timkiem.getText();
        try{
            LayNguon();
        }catch(IOException ex){
            Logger.getLogger(JP_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txttenkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenkhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenkhActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        ktThem = true;
        macu = "";
        KhoaMo(true);
        XoaTrang();
        txtmakh.requestFocus();
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        if (txtmakh.getText().length() <= 0) {
            return;
        }
        macu = txtmakh.getText();
        ktThem = false;
        KhoaMo(true);
        txtmakh.requestFocus();
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        if (txtmakh.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(this, "Hãy nhập thông tin cần xoá!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        macu = txtmakh.getText();
        for (int i = 0; i < arrKhachHang.size(); i++) {
            if (arrKhachHang.get(i).getMakh().equals(macu)) {
                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa khách hàng này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
                if (kq == JOptionPane.YES_OPTION) {
                    QuanLyController.XoaKhachHang(macu);
                    XoaTrang();
                    try {
                        LayNguon();
                    } catch (IOException ex) {
                        Logger.getLogger(JP_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return;
            }
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_ghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ghiActionPerformed
        if (txtmakh.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmakh.requestFocus();
            return;
        }
        if (txttenkh.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txttenkh.requestFocus();
            return;
        }
        if (!rdb_Nam.isSelected() && !rdb_Nu.isSelected() ) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn Giới Tính.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (QuanLyKhachSanController.KiemTraTrungMa("khachhang", "ID", txtmakh.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Mã ngành đã tồn tại trong cơ sở dữ liệu.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmakh.requestFocus();
            return;
        }
        makh = txtmakh.getText();
        tenkh = txttenkh.getText();
        diachi = txtdiachi.getText();
        email=txtemail.getText();
        
        if (rdb_Nam.isSelected()) {
            gioitinh = "1";
        } else  {
            gioitinh = "0";
        }
        cmnd = txtcmnd.getText();
        sodt = txtsdt.getText();

        tbl_KhachHang cn = new tbl_KhachHang(makh, tenkh, sodt,email, cmnd, diachi, gioitinh);

        if (ktThem == true) {
            QuanLyController.ThemKhachHang(cn);
        } else {
            QuanLyController.CapNhapKhachHang(cn, macu);
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
    }//GEN-LAST:event_bt_khongActionPerformed

    private void tb_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_KhachHangMouseClicked
        int index = tb_KhachHang.getSelectedRow();
        TableModel model = tb_KhachHang.getModel();
        makh = model.getValueAt(index, 0).toString();
        tenkh =model.getValueAt(index, 1).toString();
        sodt = model.getValueAt(index,2 ).toString();
        email= model.getValueAt(index, 3).toString();
        cmnd = model.getValueAt(index, 4).toString();
        diachi = model.getValueAt(index, 5).toString();
        gioitinh = model.getValueAt(index, 6).toString();
        
    
        txtmakh.setText(makh);
        txttenkh.setText(tenkh);
        txtdiachi.setText(diachi);
        txtemail.setText(email);
        if(gioitinh.equalsIgnoreCase("Nam") ){
            rdb_Nam.setSelected(true);
            rdb_Nu.setSelected(false);
        }else{
            rdb_Nam.setSelected(false);
            rdb_Nu.setSelected(true);
        }
        txtcmnd.setText(cmnd);
        txtsdt.setText(sodt);
    }//GEN-LAST:event_tb_KhachHangMouseClicked


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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_Nam;
    private javax.swing.JRadioButton rdb_Nu;
    private javax.swing.JTable tb_KhachHang;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txtcmnd;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmakh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttenkh;
    // End of variables declaration//GEN-END:variables
}
