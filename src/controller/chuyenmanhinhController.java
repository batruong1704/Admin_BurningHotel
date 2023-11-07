package controller;

import model.chuyenmanhinhModel;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.Home_BackUp;
import view.quanly.JP_DauBep;
import view.quanly.JP_ChucVu;
import view.hoatdong.JP_DatPhong;
import view.hoatdong.JP_HoaDon;
import view.hoatdong.JP_QuanLyTienIch;
import view.quanly.JP_DauBep;
import view.quanly.JP_DichVu;
import view.khohang.JP_DoAn;
import view.khohang.JP_HangHoa;
import view.quanly.JP_KhachHang;
import view.khohang.JP_NhapHang;
import view.quanly.JP_Phong;
import view.quanly.JP_MaGiamGia;
import view.khohang.JP_NhaPhanPhoi;
import view.quanly.JP_NhanVien;
import view.thongkedoanhthu.JP_ThongKe;

public class chuyenmanhinhController {

    private JPanel root;
    private String kindSelected = "";
    private List<chuyenmanhinhModel> listItem = null;

    public chuyenmanhinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem) throws IOException, SQLException {
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new JP_ChucVu());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<chuyenmanhinhModel> listItem) {
        this.listItem = listItem;

        for (chuyenmanhinhModel item : listItem) {
            item.getPanel_chuyen().addMouseListener(new LabelEvent(item.getCheck_chuyen(), item.getPanel_chuyen(), item.getLabel_chuyen()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String check;
        private JPanel btnItem;
        private JLabel jlbItem;

        public LabelEvent(String check, JPanel btnItem, JLabel jlbItem) {
            this.check = check;
            this.btnItem = btnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (check) {
                case "QuanLyChucVu": {
                    try {
                        node = new JP_ChucVu();
                    } catch (IOException | SQLException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "QuanLyPhong": {
                    try {
                        node = new JP_Phong();
                    } catch (IOException | SQLException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "QuanLyDichVu": {
                    try {
                        node = new JP_DichVu();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "QuanLyNhanVien": {
                    try {
                        node = new JP_NhanVien();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "QuanLyKhachHang": {
                    try {
                        node = new JP_KhachHang();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "PhieuDatPhong": {
                    try {
                        node = new JP_DatPhong();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "Home": {
                    node = new Home_BackUp();
                }
                break;

                case "ThongKeDoanhThu": {
                    try {
                        node = new JP_ThongKe();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
                case "NhapHang": {
                    node = new JP_NhapHang();
                }
                break;

                case "KhoHang": {
                    node = new JP_HangHoa();
                }
                break;

                case "HoaDon": {
                    try {
                        node = new JP_HoaDon();
                    } catch (IOException | SQLException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "NhaPhanPhoi": {
                    node = new JP_NhaPhanPhoi();
                }
                break;
                case "DauBep": {
                    try {
                        node = new JP_DauBep();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                    Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                break;
                case "PhieuGiamGia": {
                    try {
                        node = new JP_MaGiamGia();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
                case "DoAn": {
                    try {
                        node = new JP_DoAn();
                    } catch (IOException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
                case "QLTienIch": {
                    try {
                        node = new JP_QuanLyTienIch();
                    } catch (IOException | SQLException ex) {
                        Logger.getLogger(chuyenmanhinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }
}
