package view.quanly;
import controller.QuanLyController;
import model.tbl_Phong;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import controller.QuanLyKhachSanController;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class JP_Phong extends javax.swing.JPanel {
private File selectedFile;  
    DefaultTableModel tbl_Phong;
    ArrayList<tbl_Phong> arrPhong = new ArrayList<>();
    private static boolean ktThem;
    private static String macu;
    private static String maPhong, loaiPhong,kieuPhong,slmax,loaigiuong,giaPhong,img,img2,dientich,tamnhin,moTa, tinhTrang;
    
    public JP_Phong() throws IOException, SQLException {
        initComponents();
        XoaTrang();
        KhoaMo(false);
        LayNguon();
        LoadComboBoxLoaiPhong();
    }
    
    public void LayNguon() throws IOException {
        tbl_Phong = (DefaultTableModel) tb_Phong.getModel();
        arrPhong = QuanLyController.NguonPhong();
        tbl_Phong.setRowCount(0);
        arrPhong.forEach((KQ) -> {

            tbl_Phong.addRow(new Object[]{KQ.getMaPhong(), KQ.getLoaiPhong(),KQ.getKieuPhong(), KQ.getSLMax(), KQ.getLoaiGiuong(), KQ.getGiaPhong(),KQ.getDienTich(),
                                           KQ.getTamNhin(),KQ.getMoTa(), KQ.getTinhTrang()});

        });
    }
    
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (value.equals("Trống")) {
                c.setBackground(new Color( 102, 255, 102));
            } else {
                c.setBackground(table.getBackground());
            }
            return c;
        }
    };
    
    public void KhoaMo(boolean b) {
        txt_maphong.setEditable(b);
        cbb_loaiphong.setEditable(b);
        txt_loaigiuong.setEditable(b);
        txt_slmax.setEditable(b);
        txt_giaphong.setEditable(b);
        txt_kieuphong.setEditable(b);
        lb_anh.setText("tên ảnh");
        txt_dientich.setEditable(b);
        txt_tamnhin.setEditable(b);
        txt_mota.setEditable(b);
      
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_Phong.setEnabled(!b);
    }

    public void refresh(boolean b) {
        txt_maphong.setEditable(b);
        cbb_loaiphong.setEditable(b);
        txt_loaigiuong.setEditable(b);
        txt_slmax.setEditable(b);
        txt_giaphong.setEditable(b);
        rdb_Empty.setSelected(false);
        rdb_Full.setSelected(false);
        txt_dientich.setEditable(b);
        txt_tamnhin.setEditable(b);
        txt_mota.setEditable(b);
        txt_kieuphong.setEditable(b);
        
        bt_them.setEnabled(b);
        bt_sua.setEnabled(b);
        bt_xoa.setEnabled(b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
        tb_Phong.setEnabled(b);
    }

    public void XoaTrang() {
        txt_maphong.setText("");
//        cbb_loaiphong.setSelectedIndex(0);
        txt_loaigiuong.setText("");
        txt_slmax.setText("");
        txt_giaphong.setText("");
        rdb_Empty.setSelected(false);
        rdb_Full.setSelected(false);
        txt_mota.setText("");
        txt_dientich.setText("");
        txt_tamnhin.setText("");
        lb_anh.setText("tên ảnh");
        txt_kieuphong.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txt_timkiem2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        bt_ghi = new javax.swing.JButton();
        bt_khong = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_maphong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbb_loaiphong = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_loaigiuong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_slmax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_giaphong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdb_Full = new javax.swing.JRadioButton();
        rdb_Empty = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txt_kieuphong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_dientich = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_tamnhin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lb_anh = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Phong = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1140, 780));
        setPreferredSize(new java.awt.Dimension(1140, 780));
        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(76, 41, 211));
        jPanel4.setPreferredSize(new java.awt.Dimension(1140, 70));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(76, 41, 211));
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 70));
        jPanel8.setRequestFocusEnabled(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 10, 20));

        txt_timkiem2.setBackground(new java.awt.Color(123, 156, 225));
        txt_timkiem2.setBorder(null);
        txt_timkiem2.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel8.add(txt_timkiem2);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel11);

        jPanel4.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Room manager");
        jPanel4.add(jLabel8, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 710));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 170));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(300, 85));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cập Nhật"), "Cập Nhật", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N
        jPanel14.setPreferredSize(new java.awt.Dimension(360, 61));

        bt_them.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });

        bt_sua.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });

        bt_xoa.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bt_xoa.setText("Xoá");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_them, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(bt_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điều Khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N
        jPanel15.setPreferredSize(new java.awt.Dimension(360, 60));

        bt_ghi.setBackground(new java.awt.Color(0, 0, 255));
        bt_ghi.setFont(new java.awt.Font("Montserrat SemiBold", 1, 13)); // NOI18N
        bt_ghi.setForeground(new java.awt.Color(255, 255, 255));
        bt_ghi.setText("Ghi");
        bt_ghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ghiActionPerformed(evt);
            }
        });

        bt_khong.setFont(new java.awt.Font("Montserrat Medium", 1, 13)); // NOI18N
        bt_khong.setForeground(new java.awt.Color(0, 0, 255));
        bt_khong.setText("Không");
        bt_khong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        bt_khong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_khongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_ghi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ghi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 11))); // NOI18N
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 600));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel2.setText("Mã Phòng:");

        txt_maphong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_maphong.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txt_maphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maphongActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("Loại Phòng:");

        cbb_loaiphong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbb_loaiphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_loaiphongActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel9.setText("Loại giường:");

        txt_loaigiuong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_loaigiuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loaigiuongActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel10.setText("Số lương người tối đa:");

        txt_slmax.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_slmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_slmaxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel5.setText("Giá Phòng:");

        txt_giaphong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_giaphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_giaphongActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel7.setText("Tình Trạng:");

        rdb_Full.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdb_Full);
        rdb_Full.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_Full.setText("Full");
        rdb_Full.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_FullActionPerformed(evt);
            }
        });

        rdb_Empty.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdb_Empty);
        rdb_Empty.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_Empty.setText("Empty");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setText("Mô Tả:");

        txt_mota.setColumns(20);
        txt_mota.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_mota.setRows(5);
        jScrollPane2.setViewportView(txt_mota);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel1.setText("Kiểu phòng");

        txt_kieuphong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_kieuphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kieuphongActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Diện tích:");

        txt_dientich.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel12.setText("Tầm nhìn:");

        txt_tamnhin.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_tamnhin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tamnhinActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel13.setText("IMG:");

        lb_anh.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb_anh.setForeground(new java.awt.Color(51, 0, 51));
        lb_anh.setText("Tên Ảnh");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/camera_16px_black.png"))); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_maphong)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_loaiphong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_kieuphong)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_loaigiuong)
                    .addComponent(txt_slmax)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_dientich)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tamnhin)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_anh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(txt_giaphong))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdb_Full, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_Empty))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txt_maphong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(cbb_loaiphong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(txt_kieuphong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(txt_loaigiuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(txt_slmax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txt_dientich, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(txt_tamnhin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_anh, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_giaphong, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdb_Full)
                    .addComponent(rdb_Empty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(5, 700));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(840, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        tb_Phong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_Phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Loại Phòng", "Kiểu Phòng", "SLMax", "Loại Giường", "Giá Phòng", "Diện Tích", "Tầm Nhìn", "Mô Tả", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Phong.setGridColor(new java.awt.Color(0, 0, 0));
        tb_Phong.setRowHeight(25);
        tb_Phong.setRowMargin(5);
        tb_Phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_PhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Phong);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(jPanel10, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

    }//GEN-LAST:event_jLabel11MouseClicked

    private void tb_PhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_PhongMouseClicked
        try{
        int index = tb_Phong.getSelectedRow();
        TableModel model = tb_Phong.getModel();
        maPhong = model.getValueAt(index, 0).toString();
        loaiPhong = model.getValueAt(index, 1).toString();
        kieuPhong=model.getValueAt(index, 2).toString();
        slmax=model.getValueAt(index, 3).toString();
        loaigiuong = model.getValueAt(index, 4).toString();
        giaPhong = model.getValueAt(index, 5).toString();
        dientich=  model.getValueAt(index, 6).toString();
        tamnhin = model.getValueAt(index, 7).toString();
        moTa = model.getValueAt(index, 8).toString();
        tinhTrang = model.getValueAt(index, 9).toString();

        txt_maphong.setText(maPhong);
        cbb_loaiphong.setSelectedItem(loaiPhong);
        txt_kieuphong.setText(kieuPhong);
        txt_slmax.setText(slmax);
        txt_loaigiuong.setText(loaigiuong);
        txt_giaphong.setText(giaPhong);
        lb_anh.setText(QuanLyController.NguonTruyVanDuLieuPhong("IMG", maPhong));
        txt_dientich.setText(dientich);
        txt_tamnhin.setText(tamnhin);
        txt_mota.setText(moTa);
        if (tinhTrang == "Trống") {
            rdb_Empty.setSelected(true);
            rdb_Full.setSelected(false);
        } else {
            rdb_Empty.setSelected(false);
            rdb_Full.setSelected(true);
        }
        txt_mota.setText(moTa);
        } catch (IOException ex) {
            Logger.getLogger(JP_Phong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_PhongMouseClicked

    private void txt_maphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maphongActionPerformed

    }//GEN-LAST:event_txt_maphongActionPerformed

    private void cbb_loaiphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_loaiphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_loaiphongActionPerformed

    private void txt_loaigiuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loaigiuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loaigiuongActionPerformed

    private void txt_slmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_slmaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_slmaxActionPerformed

    private void txt_giaphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_giaphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_giaphongActionPerformed

    private void rdb_FullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_FullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_FullActionPerformed

    private void txt_kieuphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kieuphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kieuphongActionPerformed

    private void txt_tamnhinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tamnhinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tamnhinActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
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
    }//GEN-LAST:event_jLabel14MouseClicked

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        ktThem = true;
        macu = "";
        KhoaMo(true);
        XoaTrang();
        txt_maphong.requestFocus();
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        if (txt_maphong.getText().length() <= 0) {
            return;
        }
        macu = txt_maphong.getText();
        ktThem = false;
        KhoaMo(true);
        txt_maphong.requestFocus();
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        if (txt_maphong.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(this, "Hãy nhập thông tin cần xoá!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        macu = txt_maphong.getText();
        for (int i = 0; i < arrPhong.size(); i++) {
            if (arrPhong.get(i).getMaPhong().equals(macu)) {
                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa Phòng này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
                if (kq == JOptionPane.YES_OPTION) {
                    QuanLyController.XoaPhong(macu);
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
        maPhong = txt_maphong.getText();
        loaiPhong = (String) cbb_loaiphong.getSelectedItem();
        giaPhong=txt_giaphong.getText();
        kieuPhong=txt_kieuphong.getText();
        slmax=txt_slmax.getText();
        loaigiuong=txt_loaigiuong.getText();
        img=lb_anh.getText();
        img2="../img/roomstyle/"+lb_anh.getText();
        dientich=txt_dientich.getText();
        tamnhin=txt_tamnhin.getText();
        moTa = txt_mota.getText();
        if (txt_maphong.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã phòng.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txt_maphong.requestFocus();
            return;
        }
        if (cbb_loaiphong.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn loại phòng.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            cbb_loaiphong.requestFocus();
            return;
        }
        if (txt_giaphong.getText().length() <= 0|| kieuPhong.length()==0||slmax.length()==0||loaigiuong.length()==0||img=="Tên ảnh"||dientich.length()==0||tamnhin.length()==0||moTa.length()==0) {
            JOptionPane.showMessageDialog(this, "Nhập thiếu thông tin phòng!.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txt_giaphong.requestFocus();
            return;
        }
        if (!rdb_Empty.isSelected() && !rdb_Full.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn tình trạng hiện tại của phòng.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (QuanLyKhachSanController.KiemTraTrungMa("Phong", "MaPhong", txt_maphong.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Mã ngành đã tồn tại trong cơ sở dữ liệu.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txt_maphong.requestFocus();
            return;
        }

        if (rdb_Empty.isSelected()) {
            tinhTrang = "Trống";
        } else {
            tinhTrang = "Đầy";
        }
        tbl_Phong cn = new tbl_Phong(maPhong, loaiPhong,kieuPhong,slmax,loaigiuong, giaPhong,img2,dientich,tamnhin,moTa, tinhTrang);
        if (ktThem == true) {
            QuanLyController.ThemPhong(cn);
            JOptionPane.showMessageDialog(this, "Thêm mới thành công!");

            String uploadDirectory = "C:\\xampp\\htdocs\\BurningHotel\\img\\roomstyle";
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
            QuanLyController.CapNhatPhong(cn, macu);
            JOptionPane.showMessageDialog(this, "Cập nhập thành công!");
        }
        try {
            LayNguon();
        } catch (IOException ex) {
        }
        
        KhoaMo(false);
    }//GEN-LAST:event_bt_ghiActionPerformed

    private void bt_khongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_khongActionPerformed
        XoaTrang();
        KhoaMo(false);
    }//GEN-LAST:event_bt_khongActionPerformed
    private DefaultComboBoxModel<String> comboBoxLoaiPhong;
    public void LoadComboBoxLoaiPhong() throws IOException, SQLException {
     comboBoxLoaiPhong = new DefaultComboBoxModel<>();
     cbb_loaiphong.setModel(comboBoxLoaiPhong);
     ArrayList<String> loaiphong = QuanLyController.LoaiPhong();
     for (String p : loaiphong) {
         comboBoxLoaiPhong.addElement(p);
     }
 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ghi;
    private javax.swing.JButton bt_khong;
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb_loaiphong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_anh;
    private javax.swing.JRadioButton rdb_Empty;
    private javax.swing.JRadioButton rdb_Full;
    private javax.swing.JTable tb_Phong;
    private javax.swing.JTextField txt_dientich;
    private javax.swing.JTextField txt_giaphong;
    private javax.swing.JTextField txt_kieuphong;
    private javax.swing.JTextField txt_loaigiuong;
    private javax.swing.JTextField txt_maphong;
    private javax.swing.JTextArea txt_mota;
    private javax.swing.JTextField txt_slmax;
    private javax.swing.JTextField txt_tamnhin;
    private javax.swing.JTextField txt_timkiem2;
    // End of variables declaration//GEN-END:variables
}
