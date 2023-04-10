package GUI;

import BUS.LoaiSanPhamBUS;
import BUS.SanPhamBUS;
import DTO.LoaiSanPham;
import DTO.SanPham;
import MyCustom.XuLyFileExcel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class SanPhamGUI extends javax.swing.JPanel {
    public SanPhamGUI() {
        initComponents();
        loadDataCmbLoai();
        loadDataCmbLoai2();
        loadDataLenBangSanPham();
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
        tableSP = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbLoai2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtGiaTu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGiaDen = new javax.swing.JTextField();
        btnLoc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        cmbLoai = new javax.swing.JComboBox<>();
        txtTenSP = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtGiaSP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

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

        tableSP.setBackground(new java.awt.Color(247, 247, 247));
        tableSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Mã loại", "Tên sản phẩm", "Số lượng", "Giá "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSP);

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Loại");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Giá từ");

        txtGiaTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaTuActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Đến");

        txtGiaDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaDenActionPerformed(evt);
            }
        });

        btnLoc.setBackground(new java.awt.Color(204, 204, 204));
        btnLoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLocMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã sản phẩm");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tên loại");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tên sản phẩm");

        txtMaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPActionPerformed(evt);
            }
        });

        cmbLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbLoaiMouseClicked(evt);
            }
        });
        cmbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoaiActionPerformed(evt);
            }
        });

        txtTenSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtGiaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Giá ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGiaSP)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbLoai2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoai2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
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
    SanPhamBUS spBUS = new SanPhamBUS();
    LoaiSanPhamBUS loaiBUS = new LoaiSanPhamBUS();
    DefaultTableModel dtmSanPham;
    
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
         xuLyTimKiem();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        xuLyThemSanPham();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        xuLySuaSanPham();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        xuLyXoaSanPham();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPActionPerformed
        
    }//GEN-LAST:event_txtMaSPActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        xuLyTimKiem();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSPMouseClicked
        xuLyClickTblSanPham();
    }//GEN-LAST:event_tableSPMouseClicked

    private void btnOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutputMouseClicked
        xuLyXuatFileExcel();
    }//GEN-LAST:event_btnOutputMouseClicked

    private void btnInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputMouseClicked
        xuLyNhapFileExcel();
    }//GEN-LAST:event_btnInputMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        xuLyReset();
    }//GEN-LAST:event_btnResetMouseClicked

    private void cmbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoaiActionPerformed
        
    }//GEN-LAST:event_cmbLoaiActionPerformed

    private void cmbLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbLoaiMouseClicked
        xuLyThemLoai();
    }//GEN-LAST:event_cmbLoaiMouseClicked

    private void txtGiaDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaDenActionPerformed

    private void txtGiaTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaTuActionPerformed

    private void btnLocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLocMouseClicked
        xuLyTimKiem2();
    }//GEN-LAST:event_btnLocMouseClicked
    
   
    private void loadDataCmbLoai() {
        cmbLoai.removeAllItems();

        cmbLoai.addItem("0 - Chọn loại");
        ArrayList<LoaiSanPham> dsl = loaiBUS.getDanhSachLoai();
        for (LoaiSanPham loai : dsl) {
            cmbLoai.addItem(loai.getMaLoai() + " - " + loai.getTenLoai());
        }
        cmbLoai.addItem("Khác...");
    }
    private void loadDataCmbLoai2() {
        cmbLoai2.removeAllItems();

        ArrayList<LoaiSanPham> dsl = loaiBUS.getDanhSachLoai();
        for (LoaiSanPham loai : dsl) {
            cmbLoai2.addItem(loai.getMaLoai() + " - " + loai.getTenLoai());
        }
    }

    private void xuLyThemLoai() {
        int x = cmbLoai.getSelectedIndex();
        if (x == cmbLoai.getItemCount() - 1) {
            DlgLoaiSanPhamGUI loaiGUI = new DlgLoaiSanPhamGUI();
            loaiGUI.setVisible(true);
            loadDataCmbLoai();
            loadDataCmbLoai2();
        }
    }
    
    private void xuLyReset() {
        txtSearch.setText("");
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtGiaSP.setText("");
        txtSoLuong.setText("");
        cmbLoai.setSelectedIndex(0);
//        loadDataCmbLoai();
//        loadDataCmbLoai2();
        loadDataLenBangSanPham();
    }
    
    private void xuLyThemSanPham() {
        String maLoai = cmbLoai.getSelectedItem() + "";
        String tenSP = txtTenSP.getText();
        String soLuong = txtSoLuong.getText();
        String giaSP = txtGiaSP.getText();
        spBUS.themSanPham(tenSP,
                maLoai,
                soLuong,
                giaSP);
        spBUS.docListSanPham();
        loadDataLenBangSanPham();
    }
    
    private void xuLySuaSanPham() {
        String maSP = txtMaSP.getText();
        String maLoai = cmbLoai.getSelectedItem() + "";
        String tenSP = txtTenSP.getText();
        String soLuong = txtSoLuong.getText();
        String giaSP = txtGiaSP.getText();
        spBUS.suaSanPham(maSP,tenSP,
                maLoai,
                soLuong,
                giaSP);
        spBUS.docListSanPham();
        loadDataLenBangSanPham();
    }
    
    private void loadDataLenBangSanPham() {
        spBUS.docListSanPham();
        dtmSanPham = (DefaultTableModel) tableSP.getModel();
        dtmSanPham.setRowCount(0);
        ArrayList<SanPham> dssp = spBUS.getListSanPham();
//        DecimalFormat dcf = new DecimalFormat("###,###");

        Object obj[] = new Object[5];
        for (SanPham sp : dssp) {
            obj[0] = sp.getMaSP();
            String tenLoai = loaiBUS.getTenLoai(sp.getMaLoai());
            obj[1] = tenLoai;
            obj[2] = sp.getTenSP();
            obj[3] = sp.getSoLuong();
            obj[4] = sp.getGiaSP();
            dtmSanPham.addRow(obj);
        }
    }
    
    private void xuLyClickTblSanPham() {
        int row = tableSP.getSelectedRow();
        if (row > -1) {
            String ma = tableSP.getValueAt(row, 0) + "";
            String loai = tableSP.getValueAt(row, 1) + "";
            String ten = tableSP.getValueAt(row, 2) + "";
            String soLuong = tableSP.getValueAt(row, 3) + "";
            String donGia = tableSP.getValueAt(row, 4) + "";

            txtMaSP.setText(ma);
            txtTenSP.setText(ten);
            txtGiaSP.setText(donGia);
            txtSoLuong.setText(soLuong);
            int flag = 0;
            for (int i = 0; i < cmbLoai.getItemCount(); i++) {
                if (cmbLoai.getItemAt(i).contains(loai)) {
                    flag = i;
                    break;
                }
            }
            cmbLoai.setSelectedIndex(flag);
        }
    }
    
    private void xuLyXoaSanPham() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            boolean flag = spBUS.xoaSanPham(txtMaSP.getText());
            if (flag) {
                loadDataLenBangSanPham();
            }
        }
    }
    
    private void xuLyTimKiem() {
        String ten = txtSearch.getText().toLowerCase();
        ArrayList<SanPham> dssp = spBUS.getSanPhamTheoTen(ten);
        dtmSanPham = (DefaultTableModel) tableSP.getModel();
        dtmSanPham.setRowCount(0);
//        DecimalFormat dcf = new DecimalFormat("###,###");

        Object obj[] = new Object[5];
        for (SanPham sp : dssp) {
                obj[0] = sp.getMaSP();
                obj[1] = sp.getMaLoai();
                obj[2] = sp.getTenSP();
                obj[3] = sp.getSoLuong();
                obj[4] = sp.getGiaSP();
                dtmSanPham.addRow(obj);
        }
    }
    
    private void xuLyTimKiem2() {
        String Loai = cmbLoai2.getSelectedItem().toString();
        String[] loaiTmp = Loai.split(" - ");
        String maLoai = loaiTmp[0];
        ArrayList<SanPham> dssp = spBUS.getSanPhamTheoLoai(maLoai);
        dtmSanPham = (DefaultTableModel) tableSP.getModel();
        dtmSanPham.setRowCount(0);
//        DecimalFormat dcf = new DecimalFormat("###,###");

        Object obj[] = new Object[5];
        for (SanPham sp : dssp) {
            if (!txtGiaTu.getText().equals("") || !txtGiaDen.getText().equals("")) {
                if (sp.getGiaSP() >= Float.parseFloat(txtGiaTu.getText()) && sp.getGiaSP() <= Float.parseFloat(txtGiaDen.getText())) {
                    obj[0] = sp.getMaSP();
                    obj[1] = Loai;
                    obj[2] = sp.getTenSP();
                    obj[3] = sp.getSoLuong();
                    obj[4] = sp.getGiaSP();
                    dtmSanPham.addRow(obj);
                }
            } else {
                obj[0] = sp.getMaSP();
                obj[1] = Loai;
                obj[2] = sp.getTenSP();
                obj[3] = sp.getSoLuong();
                obj[4] = sp.getGiaSP();
                dtmSanPham.addRow(obj);
            }
        }
    }
    
     private void xuLyNhapFileExcel() {
        int  n = JOptionPane.showConfirmDialog(this, "Dữ liệu cũ sẽ bị xóa, chắc chưa?", "", JOptionPane.YES_NO_OPTION);
        if (n != JOptionPane.OK_OPTION) {
            return;
        }
        dtmSanPham = (DefaultTableModel) tableSP.getModel();
        JTable tblSanPham = new JTable(dtmSanPham);
        
        XuLyFileExcel nhapFile = new XuLyFileExcel();
        nhapFile.nhapExcel(tblSanPham);
        
        int row = tblSanPham.getRowCount();
        for (int i = 0; i < row; i++) {
            String loai = tblSanPham.getValueAt(i, 1) + "";
            String ten = tblSanPham.getValueAt(i, 2) + "";
            String soLuong = tblSanPham.getValueAt(i, 3) + "";
            String donGia = tblSanPham.getValueAt(i, 4) + "";
            String status = tblSanPham.getValueAt(i, 5) + "";

            spBUS.nhapSanPhamTuExcel(ten, loai, soLuong, donGia, status);
        }
    }
    
    private void xuLyXuatFileExcel() {
        dtmSanPham = (DefaultTableModel) tableSP.getModel();
        JTable tblSanPham = new JTable(dtmSanPham);
        XuLyFileExcel xuatFile = new XuLyFileExcel();
        xuatFile.xuatExcel(tblSanPham);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnOutput;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbLoai;
    private javax.swing.JComboBox<String> cmbLoai2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSP;
    private javax.swing.JTextField txtGiaDen;
    private javax.swing.JTextField txtGiaSP;
    private javax.swing.JTextField txtGiaTu;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
