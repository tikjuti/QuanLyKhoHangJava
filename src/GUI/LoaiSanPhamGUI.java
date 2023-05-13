
package GUI;

import BUS.LoaiSanPhamBUS;
import DTO.LoaiSanPham;
import MyCustom.XuLyFileExcel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class LoaiSanPhamGUI extends javax.swing.JPanel {

    public LoaiSanPhamGUI() {
        initComponents();
        loadDataLenBangSanPham();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtMaLoai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        btnOutput = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLoai = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LOẠI SẢN PHẨM");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Từ khóa tìm");

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search-icon.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));

        txtMaLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLoaiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Mã loại");

        txtTenLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Tên loại");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(71, Short.MAX_VALUE))
        );

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

        btnReset.setBackground(new java.awt.Color(204, 204, 204));
        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Refresh-icon.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        tableLoai.setBackground(new java.awt.Color(247, 247, 247));
        tableLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại sản phẩm", "Tên loại sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLoai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnReset)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnInput)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOutput))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        xuLyTimKiem();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        xuLyTimKiem();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtMaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLoaiActionPerformed

    }//GEN-LAST:event_txtMaLoaiActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

    }//GEN-LAST:event_btnAddMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        xuLyThemSanPham();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        xuLySuaSanPham();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        xuLyXoaSanPham();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputMouseClicked
        xuLyNhapFileExcel();
    }//GEN-LAST:event_btnInputMouseClicked

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutputMouseClicked
        xuLyXuatFileExcel();
    }//GEN-LAST:event_btnOutputMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        xuLyReset();
    }//GEN-LAST:event_btnResetMouseClicked

    private void tableLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLoaiMouseClicked
        xuLyClickTblSanPham();
    }//GEN-LAST:event_tableLoaiMouseClicked

       
    LoaiSanPhamBUS lspBUS = new LoaiSanPhamBUS();
    DefaultTableModel dtmLoaiSanPham;
    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
    private JTable setMyTable() {
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        tableLoai.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        tableLoai.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tableLoai.setRowHeight(20);
        JTableHeader header = tableLoai.getTableHeader();
        header.setBackground(new Color(242, 153, 74));
        return tableLoai;
    }
    
               
    
    private void loadDataLenBangSanPham() {
        lspBUS.docDanhSachLoai();
        dtmLoaiSanPham = (DefaultTableModel) setMyTable().getModel();
        dtmLoaiSanPham.setRowCount(0);
        ArrayList<LoaiSanPham> dssp = lspBUS.getDanhSachLoai();

        Object obj[] = new Object[2];
        for (LoaiSanPham sp : dssp) {
            obj[0] = sp.getMaLoai();
            obj[1] = sp.getTenLoai();
            dtmLoaiSanPham.addRow(obj);
        }
    }
    
    private void xuLyClickTblSanPham() {
        int row = tableLoai.getSelectedRow();
        if (row > -1) {
            String ma = tableLoai.getValueAt(row, 0) + "";
            String ten = tableLoai.getValueAt(row, 1) + "";

            txtMaLoai.setText(ma);
            txtTenLoai.setText(ten);
        }
    }
    private void xuLyThemSanPham() {
        String tenLoai = txtTenLoai.getText();
        lspBUS.themLoai(tenLoai);

        lspBUS.docDanhSachLoai();
        loadDataLenBangSanPham();
    }
    private void xuLySuaSanPham() {
        String maLoai = txtMaLoai.getText();
        String tenLoai = txtTenLoai.getText();
        lspBUS.suaLoai(maLoai,tenLoai);
        lspBUS.docDanhSachLoai();
        loadDataLenBangSanPham();
    }
    private void xuLyReset() {
        txtMaLoai.setText("");
        txtSearch.setText("");
        txtTenLoai.setText("");
        loadDataLenBangSanPham();
    }
    
    private void xuLyXoaSanPham() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            boolean flag = lspBUS.xoaLoai(txtMaLoai.getText());
            if (flag) {
                loadDataLenBangSanPham();
            }
        }
    }
    
    private void xuLyTimKiem() {
        String ten = txtSearch.getText().toLowerCase();
        ArrayList<LoaiSanPham> dssp = lspBUS.getLoaiSanPhamTheoTen(ten);
        dtmLoaiSanPham = (DefaultTableModel) tableLoai.getModel();
        dtmLoaiSanPham.setRowCount(0);

        Object obj[] = new Object[2];
        for (LoaiSanPham sp : dssp) {
            obj[0] = sp.getMaLoai();
            obj[1] = sp.getTenLoai();
            dtmLoaiSanPham.addRow(obj);
        }
    }
    
     private void xuLyNhapFileExcel() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn có muốn nhập mới hết không?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            lspBUS.xoaAllSanPham();
        } else 
        if (n == JOptionPane.NO_OPTION) {
            dtmLoaiSanPham = (DefaultTableModel) tableLoai.getModel();
            JTable tblSanPham = new JTable(dtmLoaiSanPham);

            XuLyFileExcel nhapFile = new XuLyFileExcel();
            nhapFile.nhapExcel(tblSanPham);
            LoaiSanPhamBUS spBUSNew = new LoaiSanPhamBUS();
            int row = dtmLoaiSanPham.getRowCount();
            for (int i = 0; i < row; i++) {
                String ten = dtmLoaiSanPham.getValueAt(i, 1) + "";

                spBUSNew.nhapSanPhamTuExcel(ten);
            }
        }
    }
    
    private void xuLyXuatFileExcel() {
        dtmLoaiSanPham = (DefaultTableModel) tableLoai.getModel();
        JTable tblSanPham = new JTable(dtmLoaiSanPham);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLoai;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
