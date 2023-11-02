package view;

import controller.QuanLyController;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.tbl_DauBep;
public class JP_DauBep extends javax.swing.JPanel {

    DefaultTableModel tbl_DauBep;
    List<tbl_DauBep> arrDauBep = new ArrayList<>();
    private static boolean ktThem;
    private static String macu, sTimDauBep;
    private static String id, hoten, gioitinh, chucvu, sonamkn, email, sdt, diachi, mota, hinhanh;
    public static Date ngaysinh;

    private static DefaultTableCellRenderer center = new DefaultTableCellRenderer() {{
        setHorizontalAlignment(SwingConstants.CENTER);
    }};

    public JP_DauBep() throws IOException {
        initComponents();
        XoaTrang();
        KhoaMo(false);
        LayNguon();
        LayNguonCBO();
        sTimDauBep = "";
    }

    public void LayNguon() throws IOException {
        tbl_DauBep = (DefaultTableModel)  tb_DauBep.getModel();
        arrDauBep = QuanLyController.NguonDauBep(sTimDauBep);
        tbl_DauBep.setRowCount(0);
        arrDauBep.forEach((KQ) -> {
            tbl_DauBep.addRow(new Object[]{KQ.getId(), KQ.getHoten(),KQ.getGioitinh(), KQ.getNgaysinh(), KQ.getChucvu(), KQ.getSonamkn(),KQ.getEmail(), KQ.getSdt(), KQ.getDiachi(), KQ.getMota(), KQ.getHinhanh()});
        });
    }
    public void LayNguonCBO() throws IOException {
        arrDauBep = QuanLyController.NguonDauBep(sTimDauBep);
//        for (int i = 0; i < arrKhachHang.size(); i++) {
//            cbgioitinh.addItem(arrKhachHang.get(i).getGioitinh());
//        }
    }
    public void KhoaMo(boolean b) {
        txtid.setEditable(b);
        txttendb.setEditable(b);
        rdb_Nam.setSelected(b);
        rdb_Nu.setSelected(b);
        rdb_Khac.setSelected(b);
        txtchucvu.setEditable(b);   
        txtsonamkn.setEditable(b);
        txtdiachi.setEditable(b);
        txtemail.setEditable(b);
        txtsdt.setEditable(b);
        txtmota.setEditable(b);
        txthinhanh.setEditable(b);
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_DauBep.setEnabled(!b);
    }
    public void refresh(boolean b) {
        txtid.setEditable(b);
        txttendb.setEditable(b);
        txtdiachi.setEditable(b);
        rdb_Nam.setSelected(false);
        rdb_Nu.setSelected(false);
        rdb_Khac.setSelected(false);
        txtchucvu.setEditable(b);
        txtemail.setEditable(b);
        bt_them.setEnabled(b);
        bt_sua.setEnabled(b);
        bt_xoa.setEnabled(b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_DauBep.setEnabled(b);
    }
    
    public void XoaTrang() {
        txtid.setText("");
        txttendb.setText("");
        txtdiachi.setText("");
        rdb_Nam.setSelected(false);
        rdb_Nu.setSelected(false);
        rdb_Khac.setSelected(false);
        txtchucvu.setText("");
        txtemail.setText("");
        txtsonamkn.setText("");
        txtsdt.setText("");
        txtmota.setText("");
        txthinhanh.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txt_timkiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttendb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtchucvu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        rdb_Nam = new javax.swing.JRadioButton();
        rdb_Nu = new javax.swing.JRadioButton();
        rdb_Khac = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txt_namsinh = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtsonamkn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        txtmota = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txthinhanh = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bt_ghi = new javax.swing.JButton();
        bt_khong = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DauBep = new javax.swing.JTable();

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
        jPanel8.setPreferredSize(new java.awt.Dimension(400, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi Tiết ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel2.setText("ID:");

        txtid.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtid.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Tên Đầu Bếp: ");

        txttendb.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txttendb.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txttendb.setMinimumSize(new java.awt.Dimension(7, 25));
        txttendb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttendbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("Địa Chỉ:");

        txtdiachi.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtdiachi.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel5.setText("Giới Tính:");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setText("Chức Vụ:");

        txtchucvu.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtchucvu.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel7.setText("Email:");

        txtemail.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtemail.setMargin(new java.awt.Insets(0, 2, 0, 0));

        rdb_Nam.setBackground(new java.awt.Color(255, 255, 255));
        rdb_Nam.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_Nam.setLabel("Nam");

        rdb_Nu.setBackground(new java.awt.Color(255, 255, 255));
        rdb_Nu.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_Nu.setLabel("Nữ");

        rdb_Khac.setBackground(new java.awt.Color(255, 255, 255));
        rdb_Khac.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_Khac.setText("Khác");
        rdb_Khac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_KhacActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel19.setText("Năm Sinh:");

        txt_namsinh.setBackground(new java.awt.Color(255, 255, 255));
        txt_namsinh.setDateFormatString("yyyy, MM, dd");
        txt_namsinh.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel9.setText("Số Năm Kinh Nghiệm:");

        txtsonamkn.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtsonamkn.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel10.setText("SĐT:");

        txtsdt.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtsdt.setMargin(new java.awt.Insets(0, 2, 0, 0));

        txtmota.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtmota.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel11.setText("Mô Tả:");

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel12.setText("Hình Ảnh:");

        txthinhanh.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txthinhanh.setMargin(new java.awt.Insets(0, 2, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid)
                    .addComponent(txttendb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_namsinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtchucvu)
                    .addComponent(txtsonamkn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtemail)
                    .addComponent(txtsdt)
                    .addComponent(txtdiachi)
                    .addComponent(txtmota)
                    .addComponent(txthinhanh)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb_Nam)
                                .addGap(50, 50, 50)
                                .addComponent(rdb_Nu)
                                .addGap(56, 56, 56)
                                .addComponent(rdb_Khac))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txttendb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdb_Nam)
                    .addComponent(rdb_Nu)
                    .addComponent(rdb_Khac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(2, 2, 2)
                .addComponent(txt_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(txtchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(txtsonamkn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(txthinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
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
                .addGap(49, 49, 49)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(36, 36, 36)
                .addComponent(bt_ghi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tb_DauBep.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_DauBep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Đầu Bếp", "Giới Tính ", "Năm Sinh", "Chức Vụ", "Số Năm Kinh Nghiệm", "Email", "SĐT", "Địa Chỉ ", "Mô Tả", "Hình Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_DauBep.setMinimumSize(new java.awt.Dimension(450, 100));
        tb_DauBep.setRowHeight(25);
        tb_DauBep.setRowMargin(5);
        tb_DauBep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DauBepMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_DauBep);
        if (tb_DauBep.getColumnModel().getColumnCount() > 0) {
            tb_DauBep.getColumnModel().getColumn(0).setCellRenderer(center);
            tb_DauBep.getColumnModel().getColumn(2).setCellRenderer(center);
            tb_DauBep.getColumnModel().getColumn(3).setCellRenderer(center);
            tb_DauBep.getColumnModel().getColumn(7).setCellRenderer(center);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        sTimDauBep = txt_timkiem.getText();
        try{
            LayNguon();
        }catch(IOException ex){
            Logger.getLogger(JP_DauBep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        ktThem = true;
        macu = "";
        KhoaMo(true);
        XoaTrang();
        txtid.requestFocus();
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        if (txtid.getText().length() <= 0) {
            return;
        }
        macu = txtid.getText();
        ktThem = false;
        KhoaMo(true);
        txtid.requestFocus();
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        if (txtid.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(this, "Hãy nhập thông tin cần xoá!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        macu = txtid.getText();
        for (int i = 0; i < arrDauBep.size(); i++) {
            if (arrDauBep.get(i).getId().equals(macu)) {
                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đầu bếp này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
                if (kq == JOptionPane.YES_OPTION) {
                    QuanLyController.XoaDauBep(macu);
                    XoaTrang();
                    try {
                        LayNguon();
                    } catch (IOException ex) {
                        Logger.getLogger(JP_DauBep.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return;
            }
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_ghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ghiActionPerformed
        if (txtid.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtid.requestFocus();
            return;
        }
        if (txttendb.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txttendb.requestFocus();
            return;
        }
        if (!rdb_Nam.isSelected() && !rdb_Nu.isSelected() && !rdb_Khac.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn Giới Tính.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (QuanLyKhachSanController.KiemTraTrungMa("KhachHang", "MaKhachHang", txtid.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Mã ngành đã tồn tại trong cơ sở dữ liệu.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtid.requestFocus();
            return;
        }
        id = txtid.getText();
        hoten = txttendb.getText();
        if (rdb_Nam.isSelected()) {
            gioitinh = "Nam";
        } else if(rdb_Nu.isSelected()) {
            gioitinh = "Nữ";
        }else{
            gioitinh="Khác";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(txt_namsinh.getDate());
        chucvu = txtchucvu.getText();
        sonamkn = txtsonamkn.getText();
        email = txtemail.getText();
        sdt = txtsdt.getText();
        diachi = txtdiachi.getText();
        mota = txtmota.getText();
        hinhanh = txthinhanh.getText();
        
        tbl_DauBep db = new tbl_DauBep(id, hoten, gioitinh, date, chucvu, sonamkn, email, sdt, diachi, mota, hinhanh);
        if (ktThem == true) {
            QuanLyController.ThemDauBep(db);
        } else {
            QuanLyController.CapNhapDauBep(db, macu);
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

    private void tb_DauBepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DauBepMouseClicked
        int index = tb_DauBep.getSelectedRow();
        TableModel model = tb_DauBep.getModel();
        id = model.getValueAt(index, 0).toString();
        hoten = model.getValueAt(index, 1).toString();        
        gioitinh = model.getValueAt(index, 2).toString();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 3).toString());
            txt_namsinh.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(JP_DauBep.class.getName()).log(Level.SEVERE, null, ex);
        }
        chucvu = model.getValueAt(index, 4).toString();
        sonamkn  = model.getValueAt(index, 5).toString();
        email = model.getValueAt(index, 6).toString();
        sdt = model.getValueAt(index, 7).toString();
        diachi = model.getValueAt(index, 8).toString();
        mota = model.getValueAt(index, 9).toString();
        hinhanh = model.getValueAt(index, 10).toString();
        txtid.setText(id);
        txttendb.setText(hoten);
        if(gioitinh.equalsIgnoreCase("Nam") ){
            rdb_Nam.setSelected(true);
            rdb_Nu.setSelected(false);
            rdb_Khac.setSelected(false);
        }else if(gioitinh.equalsIgnoreCase("Nữ")){
            rdb_Nam.setSelected(false);
            rdb_Nu.setSelected(true);
            rdb_Khac.setSelected(false);
        }else{
            rdb_Nam.setSelected(false);
            rdb_Nu.setSelected(false);
            rdb_Khac.setSelected(true);
        }
        txtchucvu.setText(chucvu);
        txtsonamkn.setText(sonamkn);
        txtemail.setText(email);
        txtsdt.setText(sdt);
        txtdiachi.setText(diachi);
        txtmota.setText(mota);
        txthinhanh.setText(hinhanh);
    }//GEN-LAST:event_tb_DauBepMouseClicked

    private void rdb_KhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_KhacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_KhacActionPerformed

    private void txttendbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttendbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttendbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ghi;
    private javax.swing.JButton bt_khong;
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JRadioButton rdb_Khac;
    private javax.swing.JRadioButton rdb_Nam;
    private javax.swing.JRadioButton rdb_Nu;
    private javax.swing.JTable tb_DauBep;
    private com.toedter.calendar.JDateChooser txt_namsinh;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txtchucvu;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthinhanh;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtsonamkn;
    private javax.swing.JTextField txttendb;
    // End of variables declaration//GEN-END:variables
}