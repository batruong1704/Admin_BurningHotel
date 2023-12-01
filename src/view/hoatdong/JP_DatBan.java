package view.hoatdong;
import view.quanly.*;
import controller.QuanLyController;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.tbl_DatBan;

public final class JP_DatBan extends javax.swing.JPanel {
private File selectedFile;  
    DefaultTableModel tbl_DatBan;
    List<tbl_DatBan> arrDatBan = new ArrayList<>();
    private static boolean ktThem;
    private static String macu, sTimBan;
    private static String ID, MaKhachHang,TenKhachHang,Email,Sdt,SoLuong,ThoiGian,NgayDat,NgayDen,TinhTrang,MaNhanVien,tCot;
    public static String laymanhanvien;
    public JP_DatBan() throws IOException, SQLException {
        initComponents();
        XoaTrang();
        KhoaMo(false);
        LayNguon();
        lb_manhanvien.setText(JP_DatBan.laymanhanvien);
        lb_ngaydat.setText(NgayDat);
    }
    
    public void LayNguon() throws IOException {
        tbl_DatBan = (DefaultTableModel) tb_DatBan.getModel();
        arrDatBan =  QuanLyController.NguonDatBan(sTimBan, tCot);
        tbl_DatBan.setRowCount(0);
        arrDatBan.forEach((KQ) -> {
            tbl_DatBan.addRow(new Object[]{KQ.getID(), KQ.getTenKhachHang(),KQ.getEmail(), KQ.getSdt(), KQ.getSoLuong(), KQ.getThoiGian(),KQ.getNgayDen(),KQ.getMaNhanVien(),
                                           KQ.getTinhTrang()});

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
        txt_tenkhachhang.setEditable(b);
        txt_email.setEditable(b);
        txt_sdt.setEditable(b);
        txt_songuoi.setEditable(b);
        txt_thoigian.setEditable(b);
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
//        tb_KhachHang.setEnabled(!b);
    }

    public void refresh(boolean b) {
        txt_tenkhachhang.setEditable(!b);
        txt_email.setEditable(!b);
        txt_sdt.setEditable(!b);
        txt_songuoi.setEditable(b);
        txt_thoigian.setEditable(b);
        bt_them.setEnabled(!b);
        bt_sua.setEnabled(!b);
        bt_xoa.setEnabled(!b);
        bt_ghi.setEnabled(b);
        bt_khong.setEnabled(b);
    }

    public void XoaTrang() {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txt_timkiem = new javax.swing.JTextField();
        btn_find = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JLabel();
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
        txt_tenkhachhang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_songuoi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_thoigian = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdb_cho = new javax.swing.JRadioButton();
        rdb_xacnhan = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_ngaydat = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_ngayden = new com.toedter.calendar.JDateChooser();
        rdb_hoanthanh = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        lb_manhanvien = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DatBan = new javax.swing.JTable();

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

        txt_timkiem.setBackground(new java.awt.Color(123, 156, 225));
        txt_timkiem.setBorder(null);
        txt_timkiem.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel8.add(txt_timkiem);

        btn_find.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_25px.png"))); // NOI18N
        btn_find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_findMouseClicked(evt);
            }
        });
        jPanel8.add(btn_find);

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh_26px_light.png"))); // NOI18N
        jPanel8.add(btn_refresh);

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
        jLabel2.setText("Tên Khách Hàng:");

        txt_tenkhachhang.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_tenkhachhang.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txt_tenkhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenkhachhangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel9.setText("Lượng Người:");

        txt_songuoi.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_songuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_songuoiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel10.setText("Thời Gian:");

        txt_thoigian.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_thoigian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_thoigianActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel7.setText("Tình Trạng:");

        rdb_cho.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdb_cho);
        rdb_cho.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_cho.setText("Chờ");
        rdb_cho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_choActionPerformed(evt);
            }
        });

        rdb_xacnhan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdb_xacnhan);
        rdb_xacnhan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_xacnhan.setText("Xác nhận");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setText("Ghi Chú:");

        txt_mota.setColumns(20);
        txt_mota.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_mota.setRows(5);
        jScrollPane2.setViewportView(txt_mota);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel1.setText("Số điện thoại:");

        txt_sdt.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Ngày Đến:");

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel13.setText("Ngày Đặt:");

        lb_ngaydat.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb_ngaydat.setForeground(new java.awt.Color(51, 0, 51));
        lb_ngaydat.setText("ngaydat");

        txt_email.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txt_email.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_ngayden.setBackground(new java.awt.Color(255, 255, 255));
        txt_ngayden.setDateFormatString("yyyy, MM, dd");
        txt_ngayden.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        rdb_hoanthanh.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdb_hoanthanh);
        rdb_hoanthanh.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rdb_hoanthanh.setText("Hoàn thành");

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel14.setText("Nhân Viên Thực Hiện");

        lb_manhanvien.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lb_manhanvien.setForeground(new java.awt.Color(51, 0, 51));
        lb_manhanvien.setText("manhanvien");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_sdt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_songuoi)
                    .addComponent(txt_thoigian)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(txt_email)
                    .addComponent(txt_tenkhachhang)
                    .addComponent(txt_ngayden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(rdb_cho, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_xacnhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdb_hoanthanh))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_ngaydat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_manhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txt_tenkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(txt_songuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(txt_thoigian, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ngayden, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_ngaydat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_manhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_cho)
                    .addComponent(rdb_xacnhan)
                    .addComponent(rdb_hoanthanh))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
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

        tb_DatBan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tb_DatBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Khách Hàng", "Email", "Số Điện Thoại", "Lượng Người", "Thời gian", "Ngày Đến", "Nhân Viên Thực Hiện", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_DatBan.setGridColor(new java.awt.Color(0, 0, 0));
        tb_DatBan.setRowHeight(25);
        tb_DatBan.setRowMargin(5);
        tb_DatBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DatBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_DatBan);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(jPanel10, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_findMouseClicked

    }//GEN-LAST:event_btn_findMouseClicked

    private void tb_DatBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DatBanMouseClicked
       try {
        int index = tb_DatBan.getSelectedRow();
        TableModel model = tb_DatBan.getModel();
        ID = model.getValueAt(index, 0).toString();
        TenKhachHang = model.getValueAt(index, 1).toString();
        Email =model.getValueAt(index, 2).toString();
        Sdt = model.getValueAt(index,3 ).toString();
        SoLuong= model.getValueAt(index, 4).toString();
        ThoiGian = model.getValueAt(index, 5).toString();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 6).toString());
            txt_ngayden.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(JP_DauBep.class.getName()).log(Level.SEVERE, null, ex);
        }
        MaNhanVien = model.getValueAt(index, 7).toString();
        TinhTrang = model.getValueAt(index, 8).toString();
        txt_tenkhachhang.setText(TenKhachHang);
        txt_email.setText(Email);
        txt_sdt.setText(Sdt);
        txt_songuoi.setText(SoLuong);
        txt_thoigian.setText(ThoiGian);
        lb_ngaydat.setText(QuanLyController.NguonTruyVanDuLieuDatBan("NgayDat", ID));
        lb_manhanvien.setText(MaNhanVien);
        if(TinhTrang.equalsIgnoreCase("Chờ") ){
            rdb_cho.setSelected(true);
            rdb_xacnhan.setSelected(false);
            rdb_hoanthanh.setSelected(false);
        }else if(TinhTrang.equalsIgnoreCase("Xác Nhận") ){
            rdb_cho.setSelected(false);
            rdb_xacnhan.setSelected(true);
            rdb_hoanthanh.setSelected(false);
        }else{
            rdb_cho.setSelected(false);
            rdb_xacnhan.setSelected(false);
            rdb_hoanthanh.setSelected(true);
        }
      } catch (IOException ex) {
        Logger.getLogger(JP_DatBan.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_tb_DatBanMouseClicked

    private void txt_tenkhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenkhachhangActionPerformed

    }//GEN-LAST:event_txt_tenkhachhangActionPerformed

    private void txt_songuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_songuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_songuoiActionPerformed

    private void txt_thoigianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_thoigianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_thoigianActionPerformed

    private void rdb_choActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_choActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_choActionPerformed

    private void txt_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sdtActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        ktThem = true;
        macu = "";
        KhoaMo(true);
        XoaTrang();
        txt_tenkhachhang.requestFocus();
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        if (txt_tenkhachhang.getText().length() <= 0) {
            return;
        }
        macu = txt_tenkhachhang.getText();
        ktThem = false;
        refresh(true);
        txt_tenkhachhang.requestFocus();
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
//        if (txt_tenkhachhang.getText().length() <= 0) {
//            JOptionPane.showConfirmDialog(this, "Hãy nhập thông tin cần xoá!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//        macu = txt_tenkhachhang.getText();
//        for (int i = 0; i < arrPhong.size(); i++) {
//            if (arrPhong.get(i).getMaPhong().equals(macu)) {
//                int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa Phòng này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
//                if (kq == JOptionPane.YES_OPTION) {
//                    QuanLyController.XoaPhong(macu);
//                    XoaTrang();
//                    try {
//                        LayNguon();
//                    } catch (IOException ex) {
//                        Logger.getLogger(JP_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                return;
//            }
//        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_ghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ghiActionPerformed
        if (txt_tenkhachhang.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txt_tenkhachhang.requestFocus();
            return;
        }
        if (txt_email.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txt_email.requestFocus();
            return;
        }
        if (txt_sdt.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txt_sdt.requestFocus();
            return;
        }
        if (!rdb_cho.isSelected() && !rdb_xacnhan.isSelected() && !rdb_hoanthanh.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn Tình trạng", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
//        if (QuanLyController.KiemTraTrungMa("datban", "MaKhachHang", txtid.getText(), ktThem, macu) == true) {
//            JOptionPane.showMessageDialog(this, "Mã ngành đã tồn tại trong cơ sở dữ liệu.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
//            txtid.requestFocus();
//            return;
//        }
        TenKhachHang = txt_tenkhachhang.getText();
        Email = txt_email.getText();
        Sdt = txt_sdt.getText();
        SoLuong = txt_songuoi.getText();
        ThoiGian = txt_thoigian.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(txt_ngayden.getDate());
        if (rdb_cho.isSelected()) {
            TinhTrang = "Chờ";
        } else if(rdb_xacnhan.isSelected()) {
            TinhTrang = "Xác nhận";
        }else{
            TinhTrang="Hoàn thành";
        }
        tbl_DatBan db = new tbl_DatBan(ID, MaKhachHang, TenKhachHang, Email, Sdt, SoLuong, ThoiGian, NgayDat, NgayDen, TinhTrang, MaNhanVien);
        if (ktThem == true) {
//            QuanLyController.ThemDatBan(db);
        } else {
            QuanLyController.CapNhapDatBan(db, macu);
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

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void updateDateTimeLabel() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        lb_ngaydat.setText(formattedDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ghi;
    private javax.swing.JButton bt_khong;
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JLabel btn_find;
    private javax.swing.JLabel btn_refresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel lb_manhanvien;
    private javax.swing.JLabel lb_ngaydat;
    private javax.swing.JRadioButton rdb_cho;
    private javax.swing.JRadioButton rdb_hoanthanh;
    private javax.swing.JRadioButton rdb_xacnhan;
    private javax.swing.JTable tb_DatBan;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextArea txt_mota;
    private com.toedter.calendar.JDateChooser txt_ngayden;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_songuoi;
    private javax.swing.JTextField txt_tenkhachhang;
    private javax.swing.JTextField txt_thoigian;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
