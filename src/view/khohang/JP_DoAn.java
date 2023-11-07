package view.khohang;

import controller.HangHoaController;
import controller.QuanLyKhachSanController;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.tbl_DoAn;

public class JP_DoAn extends javax.swing.JPanel {

    DefaultTableModel tbl_DoAn;
    List<tbl_DoAn> arrDoAn = new ArrayList<>();
    private static boolean ktThem;
    private static String macu, sTimDoAn;
    private static String id, tenmon, phanloai, thoigiannau, dokho, thanhphan, hamluongcalo, thanhtien, mota, soluongban, img,img2;
     private File selectedFile;  
    private static DefaultTableCellRenderer center = new DefaultTableCellRenderer() {{
        setHorizontalAlignment(SwingConstants.CENTER);
    }};

    public JP_DoAn() throws IOException {
        initComponents();
        XoaTrang();
        KhoaMo(false);
        LayNguon();
        LayNguonCBO();
        sTimDoAn = "";
    }

    public void LayNguon() throws IOException {
        tbl_DoAn = (DefaultTableModel)  tb_DoAn.getModel();
        arrDoAn = HangHoaController.NguonDoAn(sTimDoAn);
        tbl_DoAn.setRowCount(0);
        arrDoAn.forEach((KQ) -> {
            tbl_DoAn.addRow(new Object[]{KQ.getId(), KQ.getTenmon(),KQ.getPhanloai(), KQ.getThoigiannau(), KQ.getDokho(), KQ.getThanhphan(),KQ.getHamluongcalo(), KQ.getThanhtien(), KQ.getMota(), KQ.getSoluongban(), KQ.getImg()});
        });
    }
    private DefaultComboBoxModel<String> comboBoxModel;
    public void LayNguonCBO() throws IOException {
        arrDoAn = HangHoaController.NguonDoAn(sTimDoAn);
        
        }
 
    public void KhoaMo(boolean b) {
        txtid.setEditable(b);
        txttenmon.setEditable(b);
        cbphanloai.setEditable(b);
        txtthoigiannau.setEditable(b);
        cbdokho.setEditable(b);
        txt_thanhphan.setEditable(b);
        txtslban.setEditable(b);    
        txtcalo.setEditable(b);
        txtthanhtien.setEditable(b);
        txtmota.setEditable(b);
        lb_anh.setText("Tên Ảnh");
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_DoAn.setEnabled(!b);
    }
    public void refresh(boolean b) {
        txtid.setEditable(b);
        txttenmon.setEditable(b);
        cbphanloai.setEditable(b);
        txtthoigiannau.setEditable(b);
        cbdokho.setEditable(b);
        txt_thanhphan.setEditable(b);
        txtslban.setEditable(b);    
        txtcalo.setEditable(b);
        txtthanhtien.setEditable(b);
        txtmota.setEditable(b);
        lb_anh.setText("Tên Ảnh");
        bt_them.setEnabled(b);
        bt_sua.setEnabled(b);
        bt_xoa.setEnabled(b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_DoAn.setEnabled(b);
    }
    
    public void XoaTrang() {
        txtid.setText("");
        txttenmon.setText("");
        txtthoigiannau.setText("");
        txt_thanhphan.setText("");
        txtslban.setText("");
        txtcalo.setText("");
        txtthanhtien.setText("");
        txtmota.setText("");
        lb_anh.setText("Tên Ảnh");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        general = new javax.swing.ButtonGroup();
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
        txttenmon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcalo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtthanhtien = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtslban = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmota = new javax.swing.JTextArea();
        cbdokho = new javax.swing.JComboBox<>();
        txtthoigiannau = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbphanloai = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_thanhphan = new javax.swing.JTextArea();
        bt_chonanh = new javax.swing.JButton();
        lb_anh = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bt_ghi = new javax.swing.JButton();
        bt_khong = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DoAn = new javax.swing.JTable();

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
        jLabel3.setText("Tên Món: ");

        txttenmon.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txttenmon.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txttenmon.setMinimumSize(new java.awt.Dimension(7, 25));
        txttenmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenmonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setText("Phân Loại:");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel7.setText("Hàm Lượng Calo:");

        txtcalo.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtcalo.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txtcalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcaloActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel19.setText("Thời Gian Nấu:");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel9.setText("Thành Phần:");

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel10.setText("Thành Tiền:");

        txtthanhtien.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtthanhtien.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel11.setText("Mô Tả:");

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel12.setText("Hình Ảnh:");

        txtslban.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtslban.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("Số Lượng Bán:");

        txtmota.setColumns(20);
        txtmota.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtmota.setRows(5);
        jScrollPane2.setViewportView(txtmota);

        cbdokho.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbdokho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dễ", "Bình thường", "Tương đối khó", "Khó" }));
        cbdokho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdokhoActionPerformed(evt);
            }
        });

        txtthoigiannau.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtthoigiannau.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txtthoigiannau.setMinimumSize(new java.awt.Dimension(7, 25));
        txtthoigiannau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthoigiannauActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel13.setText("Độ khó:");

        cbphanloai.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbphanloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Món Khai Vị", "Món Chính", "Món Tráng Miệng", "Đồ Uống" }));
        cbphanloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbphanloaiActionPerformed(evt);
            }
        });

        txt_thanhphan.setColumns(20);
        txt_thanhphan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_thanhphan.setRows(5);
        jScrollPane3.setViewportView(txt_thanhphan);

        bt_chonanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/camera_16px_black.png"))); // NOI18N
        bt_chonanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chonanhActionPerformed(evt);
            }
        });

        lb_anh.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(cbphanloai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttenmon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcalo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtthanhtien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbdokho, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtthoigiannau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtslban, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_chonanh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(txttenmon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(cbphanloai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(txtthoigiannau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(cbdokho, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(txtcalo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(txtthanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtslban, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_chonanh)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tb_DoAn.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_DoAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Món", "Phân Loại", "Thời Gian Nấu", "Độ Khó", "Thành Phần", "Hàm Lượng Calo", "Thành Tiền", "Mô Tả", "Số Lượng Bán", "Hình Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_DoAn.setMinimumSize(new java.awt.Dimension(450, 100));
        tb_DoAn.setRowHeight(25);
        tb_DoAn.setRowMargin(5);
        tb_DoAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DoAnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_DoAn);
        if (tb_DoAn.getColumnModel().getColumnCount() > 0) {
            tb_DoAn.getColumnModel().getColumn(0).setCellRenderer(center);
            tb_DoAn.getColumnModel().getColumn(2).setCellRenderer(center);
            tb_DoAn.getColumnModel().getColumn(3).setCellRenderer(center);
            tb_DoAn.getColumnModel().getColumn(7).setCellRenderer(center);
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
        sTimDoAn = txt_timkiem.getText();
        try{
            LayNguon();
        }catch(IOException ex){
            Logger.getLogger(JP_DoAn.class.getName()).log(Level.SEVERE, null, ex);
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
        for (int i = 0; i < arrDoAn.size(); i++) {
            if (arrDoAn.get(i).getId().equals(macu)) {
                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa món này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
                if (kq == JOptionPane.YES_OPTION) {
                    HangHoaController.XoaDoAn(macu);
                    XoaTrang();
                    try {
                        LayNguon();
                    } catch (IOException ex) {
                        Logger.getLogger(JP_DoAn.class.getName()).log(Level.SEVERE, null, ex);
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
        if (txttenmon.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txttenmon.requestFocus();
            return;
        }
        if (QuanLyKhachSanController.KiemTraTrungMa("doan", "ID", txtid.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Mã ngành đã tồn tại trong cơ sở dữ liệu.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtid.requestFocus();
            return;
        }
        id = txtid.getText();
        tenmon = txttenmon.getText();
        phanloai = (String) cbphanloai.getSelectedItem();
        thoigiannau = txtthoigiannau.getText();
        dokho = (String) cbdokho.getSelectedItem();
        thanhphan = txt_thanhphan.getText();
        hamluongcalo = txtcalo.getText();
        thanhtien = txtthanhtien.getText();
        soluongban = txtslban.getText();
        mota = txtmota.getText();
        img = lb_anh.getText();
        img2="../img/Doan/"+lb_anh.getText();
        tbl_DoAn da = new tbl_DoAn(id, tenmon, phanloai, thoigiannau, dokho, thanhphan, hamluongcalo, thanhtien, mota, soluongban, img2);
        if (ktThem == true) {
            HangHoaController.ThemDoAn(da);
            String uploadDirectory = "C:\\xampp\\htdocs\\BurningHotel\\img\\DoAn";
            File uploadFile = new File(uploadDirectory, img);
            
        try {
            FileOutputStream fos = new FileOutputStream(uploadFile);
            FileInputStream fis = new FileInputStream(selectedFile);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
            // Xử lý lỗi tại đây nếu cần
        }
        } else {
            HangHoaController.CapNhapDoAn(da, macu);
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

    private void tb_DoAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DoAnMouseClicked
        int index = tb_DoAn.getSelectedRow();
        TableModel model = tb_DoAn.getModel();
        id = model.getValueAt(index, 0).toString();
        tenmon = model.getValueAt(index, 1).toString();        
        phanloai = model.getValueAt(index, 2).toString();
        thoigiannau = model.getValueAt(index, 3).toString();
        dokho  = model.getValueAt(index, 4).toString();
        thanhphan = model.getValueAt(index, 5).toString();
        hamluongcalo = model.getValueAt(index, 6).toString();
        thanhtien = model.getValueAt(index, 7).toString();
        mota = model.getValueAt(index, 8).toString();
        soluongban = model.getValueAt(index, 9).toString();
        img = model.getValueAt(index, 10).toString();
        txtid.setText(id);
        txttenmon.setText(tenmon);
        cbphanloai.setSelectedItem(phanloai);
        txtthoigiannau.setText(thoigiannau);
        cbdokho.setSelectedItem(dokho);
        txt_thanhphan.setText(thanhphan);
        txtcalo.setText(hamluongcalo);
        txtthanhtien.setText(thanhtien);
        txtslban.setText(soluongban);
        txtmota.setText(mota);
        lb_anh.setText(img);
    }//GEN-LAST:event_tb_DoAnMouseClicked

    private void txttenmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenmonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenmonActionPerformed

    private void cbdokhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdokhoActionPerformed

    }//GEN-LAST:event_cbdokhoActionPerformed

    private void txtthoigiannauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthoigiannauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthoigiannauActionPerformed

    private void cbphanloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbphanloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbphanloaiActionPerformed

    private void txtcaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcaloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcaloActionPerformed

    private void bt_chonanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_chonanhActionPerformed
        // TODO add your handling code here:
          JFileChooser filechooser= new JFileChooser();
        FileNameExtensionFilter imageFilter= new FileNameExtensionFilter("hinhanh","png","jpg");
        filechooser.setFileFilter(imageFilter);
        filechooser.setMultiSelectionEnabled(false);
        int x=filechooser.showDialog(this, "Chọn file");
        if (x==filechooser.APPROVE_OPTION){
            selectedFile =filechooser.getSelectedFile();
            String fileName =  selectedFile.getName();
            lb_anh.setText(fileName);
        }
    }//GEN-LAST:event_bt_chonanhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_chonanh;
    private javax.swing.JButton bt_ghi;
    private javax.swing.JButton bt_khong;
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JComboBox<String> cbdokho;
    private javax.swing.JComboBox<String> cbphanloai;
    private javax.swing.ButtonGroup general;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_anh;
    private javax.swing.JTable tb_DoAn;
    private javax.swing.JTextArea txt_thanhphan;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txtcalo;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextArea txtmota;
    private javax.swing.JTextField txtslban;
    private javax.swing.JTextField txttenmon;
    private javax.swing.JTextField txtthanhtien;
    private javax.swing.JTextField txtthoigiannau;
    // End of variables declaration//GEN-END:variables
}
