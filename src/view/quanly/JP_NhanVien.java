package view.quanly;

import controller.QuanLyController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.tbl_NhanVien;
import controller.QuanLyKhachSanController;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import model.tbl_ChucVu;

public final class JP_NhanVien extends javax.swing.JPanel {

    DefaultTableModel model;//DefaultTableModel là một lớp trong Java Swing được sử dụng để quản lý dữ liệu cho một JTable (bảng hiển thị dữ liệu).
    List<tbl_NhanVien> list = new ArrayList<>();
    private static boolean ktThem;
    private static String macu;
    private static String manv, hoten, macv, gioitinh, ngaysinh, sdt, diachi, email, matkhau;
    private static String timkiem;

    public JP_NhanVien() throws IOException {
        initComponents();
        LoadDataArrayListToTable();
        LoadComBoBox();
        timkiem = "";
        KhoaMo(false);
    }

    public void LoadDataArrayListToTable() throws IOException {
        list = QuanLyController.NguonNhanVien(timkiem);//lấy danh sách các đối tuượng 
        model = (DefaultTableModel) tb_nhanvien.getModel();
        model.setRowCount(0);//thiết lập số hàng của bảng là 0
        for (tbl_NhanVien nv : list) { //để lặp qua từng đối tượng tbl_NhanVien trong danh sách list.
            model.addRow(new Object[]{nv.getid(), nv.getHoten(), nv.getMacv(), nv.getNgaysinh(), nv.getGioitinh(), nv.getDiachi(), nv.getEmail(), nv.getSdt(), nv.getMatkhau()});
        }
       
    }
    private DefaultComboBoxModel<String> comboBoxModel;
    public void LoadComBoBox() throws IOException {
         comboBoxModel = new DefaultComboBoxModel<>();
         cbmacv.setModel(comboBoxModel);
         List<tbl_ChucVu> chucvu = QuanLyController.ChucVu();
         for (tbl_ChucVu o : chucvu) {
            comboBoxModel.addElement(o.getMaChucVu() +"-"+o.getTenChucVu() ); 
        }
    }

    public void KhoaMo(boolean b) {
        txtmanv.setEditable(b);
        txthoten.setEditable(b);
        cbmacv.setEditable(b);
        rbnu.setSelected(false);
        rbnam.setSelected(false);
        txtsdt.setEditable(b);
        txtdiachi.setEditable(b);
        txtemail.setEditable(b);
        txtmatkhau.setEditable(b);
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
    }

    public void refresh(boolean b) {
        txtmanv.setEditable(b);
        txthoten.setEditable(b);
        cbmacv.setEditable(b);
        rbnu.setSelected(false);
        rbnam.setSelected(false);
        txtsdt.setEditable(b);
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        txtngaysinh.setDate(currentDate);
        txtdiachi.setEditable(b);
        txtemail.setEditable(b);
        txtmatkhau.setEditable(b);
        bt_them.setEnabled(b);
        bt_sua.setEnabled(b);
        bt_xoa.setEnabled(b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);

    }

    public void XoaTrang() {
        txtmanv.setText("");
        txthoten.setText("");
        cbmacv.setSelectedIndex(0);
        rbnu.setSelected(false);
        rbnam.setSelected(false);
        txtsdt.setText("");
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        txtngaysinh.setDate(currentDate);
        txtdiachi.setText("");
        txtemail.setText("");
        txtmatkhau.setText("");
        txttimkiem.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bt_ghi = new javax.swing.JButton();
        bt_khong = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        lb7 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        rbnam = new javax.swing.JRadioButton();
        rbnu = new javax.swing.JRadioButton();
        cbmacv = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmatkhau = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        txtngaysinh = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_nhanvien = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1140, 780));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(76, 41, 211));
        jPanel2.setPreferredSize(new java.awt.Dimension(1140, 70));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(76, 41, 211));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 70));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 10, 20));

        txttimkiem.setBackground(new java.awt.Color(123, 156, 225));
        txttimkiem.setBorder(null);
        txttimkiem.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel10.add(txttimkiem);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel8);

        jPanel2.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee manager");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(310, 500));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điều Khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(330, 70));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_ghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ghi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cập Nhật", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(330, 70));

        bt_them.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_them.setText("Thêm ");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });

        bt_sua.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_sua.setText("Sửa ");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });

        bt_xoa.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(bt_sua)
                .addGap(33, 33, 33)
                .addComponent(bt_xoa)
                .addGap(23, 23, 23))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_them)
                    .addComponent(bt_sua)
                    .addComponent(bt_xoa))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N
        jPanel13.setPreferredSize(new java.awt.Dimension(330, 440));

        lb1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb1.setText("Mã Nhân Viên");

        txtmanv.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        lb2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb2.setText("Họ Tên:");

        txthoten.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txthoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotenActionPerformed(evt);
            }
        });

        lb3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb3.setText("Mã Chức Vụ:");

        lb4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb4.setText("Giới Tính:");

        lb6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb6.setText("Số Điện Thoại:");

        txtsdt.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        lb7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb7.setText("Địa Chỉ:");

        txtdiachi.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        rbnam.setBackground(new java.awt.Color(255, 255, 255));
        rbnam.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rbnam.setText("Nam");
        rbnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnamActionPerformed(evt);
            }
        });

        rbnu.setBackground(new java.awt.Color(255, 255, 255));
        rbnu.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rbnu.setText("Nữ");

        cbmacv.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbmacv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbmacvMouseClicked(evt);
            }
        });
        cbmacv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmacvActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel2.setText("Email:");

        txtemail.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Mật Khẩu");

        txtmatkhau.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        lb5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb5.setText("Ngày Sinh:");

        txtngaysinh.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(rbnam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(rbnu)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmanv)
                            .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txthoten)
                            .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbmacv, 0, 265, Short.MAX_VALUE)
                            .addComponent(txtemail)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsdt)
                            .addComponent(lb6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdiachi)
                            .addComponent(txtmatkhau)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb1)
                .addGap(0, 0, 0)
                .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb2)
                .addGap(0, 0, 0)
                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb3)
                .addGap(0, 0, 0)
                .addComponent(cbmacv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb5)
                .addGap(0, 0, 0)
                .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(rbnam)
                    .addComponent(rbnu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb7)
                .addGap(0, 0, 0)
                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb6)
                .addGap(0, 0, 0)
                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(830, 10));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setPreferredSize(new java.awt.Dimension(5, 700));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(5, 700));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel1, java.awt.BorderLayout.LINE_END);

        tb_nhanvien.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Họ Tên", "Mã Chức Vụ", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Email", "Số Điện Thoại", "Mật Khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_nhanvien.setRowHeight(25);
        tb_nhanvien.setRowMargin(5);
        tb_nhanvien.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tb_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_nhanvien);

        jPanel9.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel9, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        timkiem = txttimkiem.getText();
        try {
            LoadDataArrayListToTable();
        } catch (IOException ex) {
            Logger.getLogger(JP_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        // TODO add your handling code here:
        ktThem = true;
        macu = "";
        KhoaMo(true);
        XoaTrang();
        txtmanv.requestFocus();
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        // TODO add your handling code here:
        if (txtmanv.getText().length() <= 0) {
            return;
        }
        macu = txtmanv.getText();
        ktThem = false;
        KhoaMo(true);
        txtmanv.requestFocus();
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        // TODO add your handling code here:
        if (txtmanv.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(this, "Hãy nhập thông tin cần xoá!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        macu = txtmanv.getText();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getid().equals(macu)) {
                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa khumg?", "Thông Báo", JOptionPane.YES_NO_OPTION);
                if (kq == JOptionPane.YES_OPTION) {
                    QuanLyController.XoaNhanVien(macu);
                    try {
                        LoadDataArrayListToTable();
                    } catch (IOException ex) {
                        Logger.getLogger(JP_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showConfirmDialog(this, "Không tìm thấy kết quả!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    txtmanv.requestFocus();
                }
            }
        }
        XoaTrang();
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void txthotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthotenActionPerformed

    private void rbnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnamActionPerformed

    private void cbmacvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmacvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmacvMouseClicked

    private void cbmacvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmacvActionPerformed
        // TODO add your handling code here:
        String selectedValue = (String) comboBoxModel.getSelectedItem(); // Lấy giá trị
        String[] values = selectedValue.split("-"); // Chia chuỗi
        String mact = values[0];

        comboBoxModel.setSelectedItem(mact);
    }//GEN-LAST:event_cbmacvActionPerformed

    private void tb_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_nhanvienMouseClicked
        // TODO add your handling code here:
        int index = tb_nhanvien.getSelectedRow();
        TableModel model = tb_nhanvien.getModel();
        manv = model.getValueAt(index, 0).toString();
        hoten = model.getValueAt(index, 1).toString();
        macv = model.getValueAt(index, 2).toString();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 3).toString());
            txtngaysinh.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(JP_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        gioitinh = model.getValueAt(index, 4).toString();
        diachi = model.getValueAt(index, 5).toString();
        email = model.getValueAt(index, 6).toString();
        sdt = model.getValueAt(index, 7).toString();
        matkhau = model.getValueAt(index, 8).toString();

        txtmanv.setText(manv);
        txthoten.setText(hoten);
        txtsdt.setText(sdt);
        txtdiachi.setText(diachi);
        txtemail.setText(email);
        txtmatkhau.setText(matkhau);
        if (gioitinh.equalsIgnoreCase("Nam")) {
            rbnam.setSelected(true);
            rbnu.setSelected(false);
        } else {
            rbnu.setSelected(true);
            rbnam.setSelected(false);
        }

        int itemCount = comboBoxModel.getSize();
        for (int i = 0; i < itemCount; i++) {
            String selectedValue = comboBoxModel.getElementAt(i);
            String[] values = selectedValue.split("-");
            String mact = values[0];

            if (mact.equalsIgnoreCase(macv)) {
                comboBoxModel.setSelectedItem(mact);
                break;
            }
        }
    }//GEN-LAST:event_tb_nhanvienMouseClicked

    private void bt_ghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ghiActionPerformed
        if (txtmanv.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã nhân viên ", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmanv.requestFocus();
            return;
        }
        if (QuanLyKhachSanController.KiemTraTrungMa("NhanVien", "MaNhanVien", txtmanv.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmanv.requestFocus();
            return;
        }
        manv = txtmanv.getText();
        hoten = txthoten.getText();
        macv = (String) cbmacv.getSelectedItem();
        String gioitinh;
        if (rbnam.isSelected()) {
            gioitinh = "1";
        } else {
            gioitinh = "0";
        }
        sdt = txtsdt.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngaysinh = sdf.format(txtngaysinh.getDate());

        diachi = txtdiachi.getText();
        email = txtemail.getText();
        matkhau = txtmatkhau.getText();

        tbl_NhanVien nv = new tbl_NhanVien(manv, hoten, macv, ngaysinh, gioitinh, diachi, email, sdt, matkhau);
        if (ktThem == true) {
            QuanLyController.ThemNhanVien(nv);
            JOptionPane.showMessageDialog(this, "Thêm mới thành công ");
        } else {
            QuanLyController.CapNhatNhanVien(nv, macu);
            JOptionPane.showMessageDialog(this, "Cập nhập thành công");
        }
        try {
            LoadDataArrayListToTable();
        } catch (IOException ex) {
            Logger.getLogger(JP_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cbmacv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JRadioButton rbnam;
    private javax.swing.JRadioButton rbnu;
    private javax.swing.JTable tb_nhanvien;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtmatkhau;
    private com.toedter.calendar.JDateChooser txtngaysinh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
