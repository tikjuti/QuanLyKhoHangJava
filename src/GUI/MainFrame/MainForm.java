package GUI.MainFrame;

import DTO.TaiKhoan;
import GUI.AccountFrame.AccountForm;
import GUI.BanHangGUI;
import GUI.HoaDonGUI;
//import GUI.HoaDonGUI;
import GUI.KhachHangGUI;
import GUI.LoaiSanPhamGUI;
import GUI.LoginFrame.LoginGUI;
import GUI.NhaCungCapGUI;
import GUI.NhanVienGUI;
import GUI.NhapHangGUI;
import GUI.PhieuNhapGUI;
import GUI.SanPhamGUI;
//import GUI.SoLuongGUI;
import GUI.ThongKeGUI;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class MainForm extends javax.swing.JFrame {
//    public static SoLuongGUI jdl;
    private TaiKhoan taiKhoanDTO = new TaiKhoan();
    
    public MainForm(String username, String userType, TaiKhoan taiKhoanDTO) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        
        this.taiKhoanDTO = taiKhoanDTO;
        if ("EMPLOYEE".equalsIgnoreCase(userType)) {
            notForEmployee();
        }
        setVisible(true);
    }
    
    private void setForm(JComponent com) {
        panelLoad.removeAll();
        panelLoad.add(com);
        panelLoad.repaint();
        panelLoad.revalidate();
    }
    
    public void notForEmployee() {
        btnAccount.setEnabled(false);
        btnThongKe.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGUI1 = new GUI.MainFrame.PanelGUI();
        panelLoad = new javax.swing.JPanel();
        background1 = new GUI.MainFrame.Background();
        jLabel1 = new javax.swing.JLabel();
        btnSanPham = new GUI.component.Button();
        btnNhapHang = new GUI.component.Button();
        btnNCC = new GUI.component.Button();
        btnNhanVien = new GUI.component.Button();
        btnHoaDon = new GUI.component.Button();
        btnKhachHang = new GUI.component.Button();
        btnLogout = new GUI.component.Button();
        btnAccount = new GUI.component.Button();
        btnPN = new GUI.component.Button();
        btnLoaiSanPham = new GUI.component.Button();
        btnThongKe = new GUI.component.Button();
        btnPN1 = new GUI.component.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGUI1.setBackground(new java.awt.Color(67, 67, 67));

        panelLoad.setOpaque(false);
        panelLoad.setLayout(new java.awt.BorderLayout());

        background1.setBackground(new java.awt.Color(33, 33, 33));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        jLabel1.setText("Application");

        btnSanPham.setText("Sản phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnNhapHang.setText("Nhập hàng");
        btnNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhapHangMouseClicked(evt);
            }
        });
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });

        btnNCC.setText("Nhà cung cấp");
        btnNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNCCMouseClicked(evt);
            }
        });
        btnNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNCCActionPerformed(evt);
            }
        });

        btnNhanVien.setText("Nhân viên");
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
        });
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnHoaDon.setText("Bán hàng");
        btnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseClicked(evt);
            }
        });
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnKhachHang.setText("Khách hàng");
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseClicked(evt);
            }
        });
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAccount.setText("Account");
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnPN.setText("Phiếu nhập");
        btnPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPNMouseClicked(evt);
            }
        });
        btnPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPNActionPerformed(evt);
            }
        });

        btnLoaiSanPham.setText("Loại sản phẩm");
        btnLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoaiSanPhamMouseClicked(evt);
            }
        });
        btnLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaiSanPhamActionPerformed(evt);
            }
        });

        btnThongKe.setText("Thống kê");
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnPN1.setText("Hóa đơn");
        btnPN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPN1MouseClicked(evt);
            }
        });
        btnPN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(btnPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnPN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelGUI1Layout = new javax.swing.GroupLayout(panelGUI1);
        panelGUI1.setLayout(panelGUI1Layout);
        panelGUI1Layout.setHorizontalGroup(
            panelGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGUI1Layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGUI1Layout.setVerticalGroup(
            panelGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGUI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        SanPhamGUI sp = new SanPhamGUI();
        setForm(sp);
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
//        PhieuNhapForm phieuNhapForm = new PhieuNhapForm();
//        setForm(phieuNhapForm);
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNCCActionPerformed
    }//GEN-LAST:event_btnNCCActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        try {
            int chosse = JOptionPane.showOptionDialog(null, "Do you want logout!", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, EXIT_ON_CLOSE);
            if (chosse == 0) {
                dispose();
                new LoginGUI().setVisible(true);
            } else {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        AccountForm accountForm = new AccountForm();
        setForm(accountForm);
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPNActionPerformed

    private void btnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseClicked
        KhachHangGUI kh = new KhachHangGUI();
        setForm(kh);
    }//GEN-LAST:event_btnKhachHangMouseClicked

    private void btnNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNCCMouseClicked
        NhaCungCapGUI ncc = new NhaCungCapGUI();
        setForm(ncc);
    }//GEN-LAST:event_btnNCCMouseClicked

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
         NhanVienGUI nv = new NhanVienGUI();
        setForm(nv);
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseClicked
        ThongKeGUI tk = new ThongKeGUI();
        setForm(tk);
    }//GEN-LAST:event_btnThongKeMouseClicked

    private void btnLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoaiSanPhamMouseClicked
        LoaiSanPhamGUI tk = new LoaiSanPhamGUI();
        setForm(tk);
    }//GEN-LAST:event_btnLoaiSanPhamMouseClicked

    private void btnLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaiSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoaiSanPhamActionPerformed

    private void btnNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapHangMouseClicked
        NhapHangGUI nh = new NhapHangGUI();
        setForm(nh);
    }//GEN-LAST:event_btnNhapHangMouseClicked

    private void btnPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPNMouseClicked
        PhieuNhapGUI nh = new PhieuNhapGUI();
        setForm(nh);
    }//GEN-LAST:event_btnPNMouseClicked

    private void btnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseClicked
        setForm(new BanHangGUI());
    }//GEN-LAST:event_btnHoaDonMouseClicked

    private void btnPN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPN1MouseClicked
        setForm(new HoaDonGUI());
    }//GEN-LAST:event_btnPN1MouseClicked

    private void btnPN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPN1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.MainFrame.Background background1;
    private GUI.component.Button btnAccount;
    private GUI.component.Button btnHoaDon;
    private GUI.component.Button btnKhachHang;
    private GUI.component.Button btnLoaiSanPham;
    private GUI.component.Button btnLogout;
    private GUI.component.Button btnNCC;
    private GUI.component.Button btnNhanVien;
    private GUI.component.Button btnNhapHang;
    private GUI.component.Button btnPN;
    private GUI.component.Button btnPN1;
    private GUI.component.Button btnSanPham;
    private GUI.component.Button btnThongKe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private GUI.MainFrame.PanelGUI panelGUI1;
    public javax.swing.JPanel panelLoad;
    // End of variables declaration//GEN-END:variables
}
