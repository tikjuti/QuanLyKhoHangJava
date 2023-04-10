package GUI;

import BUS.KhachHangBUS;
import DTO.KhachHang;
import MyCustom.XuLyFileExcel;
//import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class KhachHangGUI extends javax.swing.JPanel {
    public KhachHangGUI() {
        initComponents();
        loadDataGioiTinh();
        loadDataLenBangKhachHang();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        btnOutput = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKH = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        cmbGioiTinh = new javax.swing.JComboBox<>();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Từ khóa tìm");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-icon.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(204, 204, 204));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pencil-icon.png"))); // NOI18N
        btnEdit.setText("Lưu");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInput.setBackground(new java.awt.Color(204, 204, 204));
        btnInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/excel-icon.png"))); // NOI18N
        btnInput.setText("Nhập");
        btnInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInputMouseClicked(evt);
            }
        });
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnOutput.setBackground(new java.awt.Color(204, 204, 204));
        btnOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/excel-icon.png"))); // NOI18N
        btnOutput.setText("Xuất");
        btnOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOutputMouseClicked(evt);
            }
        });

        tableKH.setBackground(new java.awt.Color(247, 247, 247));
        tableKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Giới tính", "SĐT", "Địa chỉ", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableKH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKH);

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search-icon.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(204, 204, 204));
        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã khách hàng");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tên khách hàng");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        cmbGioiTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbGioiTinhMouseClicked(evt);
            }
        });
        cmbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGioiTinhActionPerformed(evt);
            }
        });

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(123, 123, 123)
                            .addComponent(jLabel3)
                            .addGap(56, 56, 56))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(126, 126, 126)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT)
                    .addComponent(txtDiaChi)
                    .addComponent(txtEmail))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnSearch))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnInput)
                    .addComponent(btnOutput)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents
    KhachHangBUS spBUS = new KhachHangBUS();
    DefaultTableModel dtmKhachHang;
    
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
       xuLyTimKiem();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        xuLyThemKhachHang();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        xuLySuaKhachHang();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        xuLyXoaKhachHang();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       xuLyTimKiem();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKHMouseClicked
        xuLyClickTblKhachHang();
    }//GEN-LAST:event_tableKHMouseClicked

    private void btnOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutputMouseClicked
        xuLyXuatFileExcel();
    }//GEN-LAST:event_btnOutputMouseClicked

    private void btnInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputMouseClicked
//        xuLyNhapFileExcel();
    }//GEN-LAST:event_btnInputMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        xyLyReset();
    }//GEN-LAST:event_btnResetMouseClicked

    private void cmbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGioiTinhActionPerformed
        
    }//GEN-LAST:event_cmbGioiTinhActionPerformed

    private void cmbGioiTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbGioiTinhMouseClicked

    }//GEN-LAST:event_cmbGioiTinhMouseClicked

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed
    
   
    private void loadDataGioiTinh() {
        cmbGioiTinh.removeAllItems();
        cmbGioiTinh.addItem("Nam");
        cmbGioiTinh.addItem("Nữ");
    }
    
    private void xyLyReset() {
        txtSearch.setText("");
        txtMaKH.setText("");
        txtTenKH.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        cmbGioiTinh.setSelectedIndex(0);
        loadDataLenBangKhachHang();
    }
    
    private void xuLyThemKhachHang() {
        String tenKH = txtTenKH.getText();
        String gt = cmbGioiTinh.getSelectedItem() + "";
        String gioiTinh;
        if (gt.equals("Nam")){
            gioiTinh = "1";
        }
        else
            gioiTinh = "0";
        String diaChi = txtDiaChi.getText();
        String dienThoai = txtSDT.getText();
        String email = txtEmail.getText();
        spBUS.themKhachHang(tenKH,gioiTinh,
                diaChi,
                dienThoai,
                email);
        spBUS.docDanhSach();
        loadDataLenBangKhachHang();
    }
    
    private void xuLySuaKhachHang() {
        String maKH = txtMaKH.getText();
        String tenKH = txtTenKH.getText();
        String gt = cmbGioiTinh.getSelectedItem() + "";
        String gioiTinh;
        if (gt.equals("Nam")){
            gioiTinh = "1";
        }
        else
            gioiTinh = "0";
        String diaChi = txtDiaChi.getText();
        String dienThoai = txtSDT.getText();
        String email = txtEmail.getText();
        spBUS.suaKhachHang(maKH,tenKH,gioiTinh,
                diaChi,
                dienThoai,
                email);
        spBUS.docDanhSach();
        loadDataLenBangKhachHang();
    }
    
    private void loadDataLenBangKhachHang() {
        spBUS.docDanhSach();
        dtmKhachHang = (DefaultTableModel) tableKH.getModel();
        dtmKhachHang.setRowCount(0);
        ArrayList<KhachHang> dssp = spBUS.getListKhachHang();

        Object obj[] = new Object[6];
        for (KhachHang sp : dssp) {
            obj[0] = sp.getMaKH();
            obj[1] = sp.getTenKH();
            if (sp.getGioiTinh()) {
                obj[2] = "Nam";
            }
            else obj[2] = "Nữ";
            obj[3] = sp.getDiaChi();
            obj[4] = sp.getDienThoai();
            obj[5] = sp.getEmail();
            dtmKhachHang.addRow(obj);
        }
    }
    
    private void xuLyClickTblKhachHang() {
        int row = tableKH.getSelectedRow();
        if (row > -1) {
            String ma = tableKH.getValueAt(row, 0) + "";
            String ten = tableKH.getValueAt(row, 1) + "";
            String gioiTinh = tableKH.getValueAt(row, 2) + "";
            String dienThoai = tableKH.getValueAt(row, 3) + "";
            String diaChi = tableKH.getValueAt(row, 4) + "";
            String email = tableKH.getValueAt(row, 5) + "";

            txtMaKH.setText(ma);
            txtTenKH.setText(ten);
            txtDiaChi.setText(diaChi);
            txtSDT.setText(dienThoai);
            txtEmail.setText(email);
            int flag = 0;
            for (int i = 0; i < cmbGioiTinh.getItemCount(); i++) {
                if (cmbGioiTinh.getItemAt(i).equals(gioiTinh)) {
                    flag = i;
                    break;
                }
            }
            cmbGioiTinh.setSelectedIndex(flag);
        }
    }
    
    private void xuLyXoaKhachHang() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            boolean flag = spBUS.xoaKhachHang(txtMaKH.getText());
            if (flag) {
                loadDataLenBangKhachHang();
            }
        }
    }
    
    private void xuLyTimKiem() {
        String ten = txtSearch.getText().toLowerCase();
        ArrayList<KhachHang> dssp = spBUS.getKhachHangTheoTen(ten);
        dtmKhachHang = (DefaultTableModel) tableKH.getModel();
        dtmKhachHang.setRowCount(0);

        Object obj[] = new Object[6];
        for (KhachHang sp : dssp) {
                obj[0] = sp.getMaKH();
                obj[1] = sp.getTenKH();
                if (sp.getGioiTinh()) {
                    obj[2] = "Nam";
                }
                else obj[2] = "Nữ";
                obj[3] = sp.getDienThoai();
                obj[4] = sp.getDiaChi();
                obj[5] = sp.getEmail();
                dtmKhachHang.addRow(obj);
        }
    }
    
    
//     private void xuLyNhapFileExcel() {
//        int  n = JOptionPane.showConfirmDialog(this, "Dữ liệu cũ sẽ bị xóa, chắc chưa?", "", JOptionPane.YES_NO_OPTION);
//        if (n != JOptionPane.OK_OPTION) {
//            return;
//        }
//        dtmKhachHang = (DefaultTableModel) tableKH.getModel();
//        JTable tblSanPham = new JTable(dtmKhachHang);
//        
//        XuLyFileExcel nhapFile = new XuLyFileExcel();
//        nhapFile.nhapExcel(tblSanPham);
//        
//        int row = tblSanPham.getRowCount();
//        for (int i = 0; i < row; i++) {
//            String loai = tblSanPham.getValueAt(i, 1) + "";
//            String ten = tblSanPham.getValueAt(i, 2) + "";
//            String soLuong = tblSanPham.getValueAt(i, 3) + "";
//            String donGia = tblSanPham.getValueAt(i, 4) + "";
//            String status = tblSanPham.getValueAt(i, 5) + "";
//
//            spBUS.nhapSanPhamTuExcel(ten, loai, soLuong, donGia, status);
//        }
//    }
    
    private void xuLyXuatFileExcel() {
        dtmKhachHang = (DefaultTableModel) tableKH.getModel();
        JTable tblSanPham = new JTable(dtmKhachHang);
        XuLyFileExcel xuatFile = new XuLyFileExcel();
        xuatFile.xuatExcel(tblSanPham);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnOutput;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKH;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
