package GUI;

import BUS.NhaCungCapBUS;
import DTO.NhaCungCap;
import MyCustom.XuLyFileExcel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class NhaCungCapGUI extends javax.swing.JPanel {
    public NhaCungCapGUI() {
        initComponents();
        loadDataLenBangNhaCungCap();
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
        tableNCC = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÀ CUNG CẤP");

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
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(204, 204, 204));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pencil-icon.png"))); // NOI18N
        btnEdit.setText("Lưu");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
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

        tableNCC.setBackground(new java.awt.Color(247, 247, 247));
        tableNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "SĐT", "Địa chỉ", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNCC);

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
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Refresh-icon.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhà cung cấp");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tên nhà cung cấp");

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        txtTenNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch))
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
                                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnInput)
                    .addComponent(btnOutput)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents
    NhaCungCapBUS spBUS = new NhaCungCapBUS();
    DefaultTableModel dtmNhaCungCap;
    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
    
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
       xuLyTimKiem();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
//        xuLyNhapFileExcel();
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       xuLyTimKiem();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNCCMouseClicked
        xuLyClickTblNhaCungCap();
    }//GEN-LAST:event_tableNCCMouseClicked

    private void btnOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutputMouseClicked
        xuLyXuatFileExcel();
    }//GEN-LAST:event_btnOutputMouseClicked

    private void btnInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputMouseClicked
        xuLyNhapFileExcel();
    }//GEN-LAST:event_btnInputMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        xyLyReset();
    }//GEN-LAST:event_btnResetMouseClicked

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        xuLyThemNhaCungCap();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        xuLySuaNhaCungCap();
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        xuLyXoaNhaCungCap();
    }//GEN-LAST:event_btnDeleteMouseClicked
    
    private JTable setMyTable() {
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        tableNCC.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        tableNCC.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tableNCC.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tableNCC.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tableNCC.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tableNCC.setRowHeight(20);
        JTableHeader header = tableNCC.getTableHeader();
        header.setBackground(new Color(242, 153, 74));
        return tableNCC;
    }
    
    
    private void xyLyReset() {
        txtSearch.setText("");
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        loadDataLenBangNhaCungCap();
    }
    
    private void xuLyThemNhaCungCap() {
        String tenKH = txtTenNV.getText();
        String diaChi = txtDiaChi.getText();
        String dienThoai = txtSDT.getText();
        String email = txtEmail.getText();
        spBUS.themNhaCungCap(tenKH,
                diaChi,
                dienThoai,
                email);
        spBUS.docDanhSach();
        loadDataLenBangNhaCungCap();
    }
    
    private void xuLySuaNhaCungCap() {
        String maKH = txtMaNV.getText();
        String tenKH = txtTenNV.getText();
        String diaChi = txtDiaChi.getText();
        String dienThoai = txtSDT.getText();
        String email = txtEmail.getText();
        spBUS.suaNhaCungCap(maKH,tenKH,
                diaChi,
                dienThoai,
                email);
        spBUS.docDanhSach();
        loadDataLenBangNhaCungCap();
    }
    
    private void loadDataLenBangNhaCungCap() {
        spBUS.docDanhSach();
        dtmNhaCungCap = (DefaultTableModel) setMyTable().getModel();
        dtmNhaCungCap.setRowCount(0);
        ArrayList<NhaCungCap> dssp = spBUS.getListNhaCungCap();

        Object obj[] = new Object[5];
        for (NhaCungCap sp : dssp) {
            obj[0] = sp.getMaNCC();
            obj[1] = sp.getTenNCC();
            obj[2] = sp.getDienThoai();
            obj[3] = sp.getDiaChi();
            obj[4] = sp.getEmail();
            dtmNhaCungCap.addRow(obj);
        }
    }
    
    private void xuLyClickTblNhaCungCap() {
        int row = tableNCC.getSelectedRow();
        if (row > -1) {
            String ma = tableNCC.getValueAt(row, 0) + "";
            String ten = tableNCC.getValueAt(row, 1) + "";
            String diaChi = tableNCC.getValueAt(row, 2) + "";
            String dienThoai = tableNCC.getValueAt(row, 3) + "";
            String email = tableNCC.getValueAt(row, 4) + "";

            txtMaNV.setText(ma);
            txtTenNV.setText(ten);
            txtDiaChi.setText(diaChi);
            txtSDT.setText(dienThoai);
            txtEmail.setText(email);
        }
    }
    
    private void xuLyXoaNhaCungCap() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            boolean flag = spBUS.xoaNhaCungCap(txtMaNV.getText());
            if (flag) {
                loadDataLenBangNhaCungCap();
            }
        }
    }
    
    private void xuLyTimKiem() {
        String ten = txtSearch.getText().toLowerCase();
        ArrayList<NhaCungCap> dssp = spBUS.getNhaCungCapTheoTen(ten);
        dtmNhaCungCap = (DefaultTableModel) tableNCC.getModel();
        dtmNhaCungCap.setRowCount(0);
        Object obj[] = new Object[5];
        for (NhaCungCap sp : dssp) {
                obj[0] = sp.getMaNCC();
                obj[1] = sp.getTenNCC();
                obj[2] = sp.getDienThoai();
                obj[3] = sp.getDiaChi();
                obj[4] = sp.getEmail();
                dtmNhaCungCap.addRow(obj);
        }
    }
    
    
      private void xuLyNhapFileExcel() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn có muốn nhập mới hết không?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            spBUS.xoaAllNhaCungCap();
        } else 
        if (n == JOptionPane.NO_OPTION) {
            dtmNhaCungCap = (DefaultTableModel) tableNCC.getModel();
            JTable tblSanPham = new JTable(dtmNhaCungCap);

            XuLyFileExcel nhapFile = new XuLyFileExcel();
            nhapFile.nhapExcel(tblSanPham);
            NhaCungCapBUS spBUSNew = new NhaCungCapBUS();
            int row = dtmNhaCungCap.getRowCount();
            for (int i = 0; i < row; i++) {
                String ten = dtmNhaCungCap.getValueAt(i, 1) + "";
                String sdt = dtmNhaCungCap.getValueAt(i, 2) + "";
                String diachi = dtmNhaCungCap.getValueAt(i, 3) + "";
                String email = dtmNhaCungCap.getValueAt(i, 4) + "";

                spBUSNew.nhapNhaCungCapTuExcel(ten, sdt, diachi, email);
             }
        }
    }
    
    private void xuLyXuatFileExcel() {
        dtmNhaCungCap = (DefaultTableModel) tableNCC.getModel();
        JTable tblSanPham = new JTable(dtmNhaCungCap);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNCC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
