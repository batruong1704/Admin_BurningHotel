package view.khohang;

import controller.HangHoaController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.tbl_HangHoa;
import model.tbl_Nhaphanphoi;
import model.tbl_NhapHang;

public class JP_NhapHang extends javax.swing.JPanel {

    private static String manhap, masp, nhacungcap, dvt, loaihang, ngaynhap, gianhap,timkiem, m;
    private static int soluong ;
    private static boolean ktThem, ktxoa;
    private static String mcsp, mcncc, mcnh;
    DefaultTableModel model;
    List<tbl_NhapHang> list;
    
    public JP_NhapHang() {
        initComponents();
        KhoaMo(false);
        ppmasp.add(panelmasp);
        ppncc.add(panelncc);
        updateDateTimeLabel();
        LoadComBoBoxMaSP();
        LoadComBoBoxNCC();
        LoadArrayNhapHangListToTable();
        LoadArrayListToTable();
    }

    private DefaultComboBoxModel<String> comboBoxMaSP;
    public void LoadComBoBoxMaSP() {
        comboBoxMaSP = new DefaultComboBoxModel<>();
        cbmasp.setModel(comboBoxMaSP);
        List<tbl_HangHoa> hanghoa = HangHoaController.LoadDataHangHoaToArrayList(m);
         for (tbl_HangHoa o : hanghoa) {
            comboBoxMaSP.addElement(o.getMahang() + "-" + o.getTenhang());
         }
    }
    
    private DefaultComboBoxModel<String> comboBoxNCC;
    public void LoadComBoBoxNCC() {
        
        comboBoxNCC = new DefaultComboBoxModel<>();
        cbncc.setModel(comboBoxNCC);
         List<tbl_Nhaphanphoi> ncc = HangHoaController.LoadDatanccToArrayList();
         for (tbl_Nhaphanphoi o : ncc) {
            comboBoxNCC.addElement(o.getMact() + "-" + o.getTenct());
         }
    }

    public void KhoaMo(boolean b) {
        txtmanhap.setEditable(b);
        
        txtloaihang.setEditable(b);
        txtsoluong.setEditable(b);
        txtgianhap.setEditable(b);
        txtsoluong.setEditable(b);
    
        btnhaphang.setEnabled(!b);
        btsua.setEnabled(!b);
        btxoa.setEnabled(!b);
        btghi.setEnabled(b);
        btkhong.setEnabled(b);
//        btketthuc.setEnabled(!b);

    }
    
     public void refresh(boolean b) {
        txtmanhap.setEditable(b);
        cbmasp.setEditable(b);
        cbncc.setEditable(b);
        txtsoluong.setEditable(b);
        txtloaihang.setEditable(b);
        txtmanhap.setEditable(b);
        cbdvt.setEditable(b);
        txtgianhap.setEnabled(b);
      
        btnhaphang.setEnabled(b);
        btsua.setEnabled(b);
        btxoa.setEnabled(b);
        btghi.setEnabled(b);
        btkhong.setEnabled(b);
    }
    public void XoaTrang() {
    
        txtmanhap.setText("");
        cbmasp.setSelectedIndex(0);
        cbncc.setSelectedIndex(0);
        cbdvt.setSelectedIndex(0);
        txtgianhap.setText("");
        txtsoluong.setText("");
        txtloaihang.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppncc = new javax.swing.JPopupMenu();
        panelmasp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistmasp = new javax.swing.JList<>();
        ppmasp = new javax.swing.JPopupMenu();
        panelncc = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistncc = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btghi = new javax.swing.JButton();
        btkhong = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        btnhaphang = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        bttimkiem = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtmanhap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtloaihang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbdvt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtgianhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtngaynhap = new javax.swing.JLabel();
        cbmasp = new javax.swing.JComboBox<>();
        cbncc = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnhaphang = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbhanghoa = new javax.swing.JTable();

        jlistmasp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlistmasp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistmaspMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlistmasp);

        javax.swing.GroupLayout panelmaspLayout = new javax.swing.GroupLayout(panelmasp);
        panelmasp.setLayout(panelmaspLayout);
        panelmaspLayout.setHorizontalGroup(
            panelmaspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        panelmaspLayout.setVerticalGroup(
            panelmaspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );

        jlistncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistnccMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jlistncc);

        javax.swing.GroupLayout panelnccLayout = new javax.swing.GroupLayout(panelncc);
        panelncc.setLayout(panelnccLayout);
        panelnccLayout.setHorizontalGroup(
            panelnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnccLayout.setVerticalGroup(
            panelnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1140, 780));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(76, 41, 211));
        jPanel1.setPreferredSize(new java.awt.Dimension(1140, 70));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Service management");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(310, 710));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Điều Khiển"));
        jPanel13.setPreferredSize(new java.awt.Dimension(332, 60));

        btghi.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btghi.setText("Ghi");
        btghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btghiActionPerformed(evt);
            }
        });

        btkhong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btkhong.setText("Không");
        btkhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhongActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jButton2.setText("Làm mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btghi, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btkhong, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btghi)
                    .addComponent(btkhong)
                    .addComponent(jButton2))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Cập nhập"));
        jPanel16.setPreferredSize(new java.awt.Dimension(332, 60));

        btnhaphang.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnhaphang.setText("Nhập Hàng");
        btnhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhaphangActionPerformed(evt);
            }
        });

        btsua.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btxoa.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnhaphang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhaphang)
                    .addComponent(btxoa)
                    .addComponent(btsua))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_END);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));
        jPanel18.setPreferredSize(new java.awt.Dimension(332, 85));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Nhập từ khóa cần tìm");

        txttimkiem.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        bttimkiem.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        bttimkiem.setText("Chọn");
        bttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(bttimkiem)
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttimkiem)
                    .addComponent(txttimkiem))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(350, 415));

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel10.setText("Mã nhập:");

        txtmanhap.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel2.setText("Mã sản phẩm:");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("Nhà cung cấp:");
        jLabel4.setPreferredSize(new java.awt.Dimension(75, 14));
        jLabel4.setRequestFocusEnabled(false);

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel8.setText("Loại Hàng:");

        txtloaihang.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel5.setText("Số lượng:");

        txtsoluong.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setText("Đơn vị tính:");

        cbdvt.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbdvt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chai", "Lon", "Chiếc" }));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel7.setText("Giá Nhập:");

        txtgianhap.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel9.setText("Ngày Nhập");

        txtngaynhap.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtngaynhap.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbmasp.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbmasp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbmasp.setPreferredSize(new java.awt.Dimension(64, 21));
        cbmasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmaspActionPerformed(evt);
            }
        });

        cbncc.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cbncc.setPreferredSize(new java.awt.Dimension(64, 21));
        cbncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmanhap)
                    .addComponent(cbmasp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbncc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtloaihang)
                    .addComponent(txtsoluong)
                    .addComponent(cbdvt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtgianhap)
                    .addComponent(txtngaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtmanhap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(cbmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cbncc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(txtloaihang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(cbdvt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(txtngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(830, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(5, 700));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(5, 700));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(830, 5));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(820, 320));
        jPanel9.setLayout(new java.awt.BorderLayout());

        tbnhaphang.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tbnhaphang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhập", "Mã sản phẩm", "Nhà Cung Cấp", "Số lượng", "Loại Hàng", "Đơn vị tính", "Giá Nhập", "Ngày nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbnhaphang.setRowHeight(25);
        tbnhaphang.setRowMargin(5);
        tbnhaphang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnhaphangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbnhaphang);

        jPanel9.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setPreferredSize(new java.awt.Dimension(820, 5));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        tbhanghoa.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tbhanghoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hàng", "Tên Hàng", "Mã Công Ty", "Loại Hàng", "Số Lượng", "Đơn Vị Tính", "Giá Nhập", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbhanghoa.setRowHeight(25);
        tbhanghoa.setRowMargin(5);
        jScrollPane4.setViewportView(tbhanghoa);

        jPanel10.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jlistmaspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistmaspMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jlistmaspMouseClicked

    private void jlistnccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistnccMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jlistnccMouseClicked

    private void tbnhaphangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnhaphangMouseClicked
        // TODO add your handling code here:
        int index = tbnhaphang.getSelectedRow();
        TableModel model = tbnhaphang.getModel();
        manhap = model.getValueAt(index, 0).toString();
        masp = model.getValueAt(index, 1).toString();
        nhacungcap = model.getValueAt(index, 2).toString();
        soluong = Integer.parseInt(model.getValueAt(index, 3).toString());
        loaihang = model.getValueAt(index, 4).toString();
        dvt = model.getValueAt(index, 5).toString();
        gianhap = model.getValueAt(index, 6).toString();
        ngaynhap = model.getValueAt(index, 7).toString();

        txtmanhap.setText(manhap);
        txtloaihang.setText(loaihang);
        txtsoluong.setText(String.valueOf(soluong));
        cbdvt.setSelectedItem(dvt);
        txtgianhap.setText(gianhap);
        txtngaynhap.setText(ngaynhap);

        int itemCount = comboBoxMaSP.getSize();
        for (int i = 0; i < itemCount; i++) {
            String selectedValue = comboBoxMaSP.getElementAt(i);
            String[] values = selectedValue.split("-");
            String msp = values[0];

            if (msp.equalsIgnoreCase(masp)) {
                comboBoxMaSP.setSelectedItem(masp);
                break;
            }

            int itemNcc = comboBoxNCC.getSize();
            for (int n = 0; i < itemNcc; n++) {
                String selectedValueNCC = comboBoxNCC.getElementAt(n);
                String[] valuencc = selectedValueNCC.split("-");
                String ncc = valuencc[0];

                if (ncc.equalsIgnoreCase(nhacungcap)) {
                    comboBoxNCC.setSelectedItem(nhacungcap);
                    break;
                }
            }
        }
    }//GEN-LAST:event_tbnhaphangMouseClicked

    private void btghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btghiActionPerformed
        // TODO add your handling code here:
        if (txtmanhap.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã nhập hàng.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmanhap.requestFocus();
            return;
        }
        nhacungcap = (String) cbncc.getSelectedItem();
        masp = (String) cbmasp.getSelectedItem();
        if (HangHoaController.KiemTraTrungMa("nhaphang", "MaNhapHang", txtmanhap.getText(), ktThem, mcnh) == true) {
            JOptionPane.showMessageDialog(this, "Mã Nhập Hàng đã tồn tại ", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            txtmanhap.requestFocus();
            return;
        }

        manhap = txtmanhap.getText();
        masp = (String) cbmasp.getSelectedItem();
        nhacungcap = (String) cbncc.getSelectedItem();
        ngaynhap = txtngaynhap.getText();
        loaihang = txtloaihang.getText();
        soluong = Integer.parseInt(txtsoluong.getText());
        dvt = (String) cbdvt.getSelectedItem();
        gianhap=txtgianhap.getText() ;

        tbl_NhapHang nh = new tbl_NhapHang(manhap, masp, nhacungcap, soluong, loaihang, dvt, gianhap, ngaynhap);
        String giabanhh=HangHoaController.LayGiaBan( masp);
        int giaban = Integer.parseInt(giabanhh);
        int gianhapp = Integer.parseInt(gianhap);
        if(giaban < gianhapp){
            JOptionPane.showMessageDialog(this, "Giá Nhập lớn hơn Giá Bán  ", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        if (!HangHoaController.KiemTraSp(masp, nhacungcap)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng Mã công ty cung cấp sản phẩm ", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (ktThem == true) {
                try {
                    HangHoaController.NhapHangHoa(nh);
                    JOptionPane.showMessageDialog(this, "Nhập hàng thành công");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Lỗi ", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
            if(ktThem==false &ktxoa==false){
                try {
                    HangHoaController.SuaHangHoa(nh, mcnh, manhap, mcsp, masp, mcncc);
                    JOptionPane.showMessageDialog(this, "Sửa hàng thành công");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Lỗi ", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if ( ktxoa == true ) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaNhap().equals(mcnh)) {
                    int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đơn nhập này không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
                    if (kq == JOptionPane.YES_OPTION) {
                        HangHoaController.XoaNhapHang(nh, mcnh, mcsp, mcncc);
                        XoaTrang();

                    } else {
                        JOptionPane.showConfirmDialog(this, "Không tìm thấy kết quả!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        cbmasp.requestFocus();
                    }
                }
            }
        }
        LoadArrayNhapHangListToTable();
        LoadArrayListToTable();
        KhoaMo(false);
    }//GEN-LAST:event_btghiActionPerformed

    private void btkhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhongActionPerformed
        // TODO add your handling code here:
        XoaTrang();
        KhoaMo(false);
    }//GEN-LAST:event_btkhongActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        XoaTrang();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhaphangActionPerformed
        // TODO add your handling code here:
        ktThem = true;
        mcnh = "";
        KhoaMo(true);
        XoaTrang();
    }//GEN-LAST:event_btnhaphangActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        // TODO add your handling code here:

        ktThem = false;
        mcnh = txtmanhap.getText();
        mcsp = (String) cbmasp.getSelectedItem();
        mcncc =(String) cbncc.getSelectedItem();

        txtmanhap.setEnabled(false);
        KhoaMo(true);
    }//GEN-LAST:event_btsuaActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        // TODO add your handling code here:
        ktThem=false;
        ktxoa = true;
        mcnh = txtmanhap.getText();
        mcsp = (String) cbmasp.getSelectedItem();
        mcncc =(String) cbncc.getSelectedItem();
        KhoaMo(true);
    }//GEN-LAST:event_btxoaActionPerformed

    private void bttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimkiemActionPerformed
        // TODO add your handling code here:
        timkiem = txttimkiem.getText();
        LoadArrayNhapHangListToTable();
    }//GEN-LAST:event_bttimkiemActionPerformed

    private void cbmaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmaspActionPerformed
        // TODO add your handling code here:
        String selectedValue = (String) comboBoxMaSP.getSelectedItem(); // Lấy giá trị
        String[] values = selectedValue.split("-"); // Chia chuỗi
        String masp = values[0];
        comboBoxMaSP.setSelectedItem(masp);
    }//GEN-LAST:event_cbmaspActionPerformed

    private void cbnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnccActionPerformed
        // TODO add your handling code here:
        String selectedValue = (String) comboBoxNCC.getSelectedItem(); // Lấy giá trị
        String[] values = selectedValue.split("-"); // Chia chuỗi
        String ncc = values[0];
        comboBoxNCC.setSelectedItem(ncc);
    }//GEN-LAST:event_cbnccActionPerformed

    public void LoadArrayNhapHangListToTable() {
        list = HangHoaController.LoadDataNhapHangToArrayList(timkiem);
        model = (DefaultTableModel) tbnhaphang.getModel();
        model.setRowCount(0);
        for (tbl_NhapHang hh : list) {
            model.addRow(new Object[]{hh.getMaNhap(), hh.getMaHang(), hh.getMaCongTy(), hh.getSoluong(), hh.getLoaiHang(), hh.getDonViTinh(), hh.getGiaNhap(), hh.getNgayNhap()});
        }
    }

    public void LoadArrayListToTable() {
        List<tbl_HangHoa> list;
        list = HangHoaController.LoadDataHangHoaToArrayList(m);
        model = (DefaultTableModel) tbhanghoa.getModel();
        model.setRowCount(0);
        for (tbl_HangHoa hh : list) {
            model.addRow(new Object[]{hh.getMahang(), hh.getTenhang(), hh.getMacongty(), hh.getLoaihang(), hh.getSoluong(), hh.getDonvitinh(), hh.getGianhap(), hh.getGiaban()});
        }
    }
    
    private void updateDateTimeLabel() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        txtngaynhap.setText(formattedDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btghi;
    private javax.swing.JButton btkhong;
    private javax.swing.JButton btnhaphang;
    private javax.swing.JButton btsua;
    private javax.swing.JButton bttimkiem;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox<String> cbdvt;
    private javax.swing.JComboBox<String> cbmasp;
    private javax.swing.JComboBox<String> cbncc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jlistmasp;
    private javax.swing.JList<String> jlistncc;
    private javax.swing.JPanel panelmasp;
    private javax.swing.JPanel panelncc;
    private javax.swing.JPopupMenu ppmasp;
    private javax.swing.JPopupMenu ppncc;
    private javax.swing.JTable tbhanghoa;
    private javax.swing.JTable tbnhaphang;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtloaihang;
    private javax.swing.JTextField txtmanhap;
    private javax.swing.JLabel txtngaynhap;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
