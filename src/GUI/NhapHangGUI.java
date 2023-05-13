
package GUI;


import BUS.LoaiSanPhamBUS;
import BUS.NhaCungCapBUS;
import BUS.NhapHangBUS;
import DTO.LoaiSanPham;
import DTO.NhaCungCap;
import DTO.SanPham;
import GUI.LoginFrame.LoginGUI;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



public class NhapHangGUI extends javax.swing.JPanel {

    public NhapHangGUI() {
        initComponents();
        loadDataCmbLoai();
        loadDataCmbNCC();
        loadDataLenBangSanPham();
        txtMaNV.setText(String.valueOf(LoginGUI.taiKhoanLogin.getMaNV()));
    }
    
    DefaultTableModel dtmSanPham;
    NhapHangBUS pnBUS = new NhapHangBUS();
    LoaiSanPhamBUS loaiBUS = new LoaiSanPhamBUS();
    NhaCungCapBUS nccBUS = new NhaCungCapBUS();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        pnPhieuNhap = new javax.swing.JPanel();
        pnListSanPham = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbLoaiSP = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new javax.swing.JTable();
        pnListPhieuNhap = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePN = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbTNCC = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        pnPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));

        pnListSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tên sản phẩm");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        cmbLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoaiSPActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search-icon.png"))); // NOI18N
        jButton1.setText("Tìm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSP);

        javax.swing.GroupLayout pnListSanPhamLayout = new javax.swing.GroupLayout(pnListSanPham);
        pnListSanPham.setLayout(pnListSanPhamLayout);
        pnListSanPhamLayout.setHorizontalGroup(
            pnListSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(pnListSanPhamLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnListSanPhamLayout.setVerticalGroup(
            pnListSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListSanPhamLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnListSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnListPhieuNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablePN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Thành tiền", "Xóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePNMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePN);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NHẬP HÀNG");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mã nhân viên:");

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMaNV.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nhà cung cấp:");

        cmbTNCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Tổng tiền      :");

        txtTotalPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnThanhToan.setBackground(new java.awt.Color(51, 255, 51));
        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnListPhieuNhapLayout = new javax.swing.GroupLayout(pnListPhieuNhap);
        pnListPhieuNhap.setLayout(pnListPhieuNhapLayout);
        pnListPhieuNhapLayout.setHorizontalGroup(
            pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnListPhieuNhapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNV)
                            .addComponent(cmbTNCC, 0, 155, Short.MAX_VALUE)
                            .addComponent(txtTotalPrice))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListPhieuNhapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
            .addGroup(pnListPhieuNhapLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnListPhieuNhapLayout.setVerticalGroup(
            pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnListPhieuNhapLayout.createSequentialGroup()
                        .addGroup(pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnListPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnPhieuNhapLayout = new javax.swing.GroupLayout(pnPhieuNhap);
        pnPhieuNhap.setLayout(pnPhieuNhapLayout);
        pnPhieuNhapLayout.setHorizontalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnListSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnListPhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnPhieuNhapLayout.setVerticalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPhieuNhapLayout.createSequentialGroup()
                .addComponent(pnListPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnListSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        add(pnPhieuNhap, "1");
    }// </editor-fold>//GEN-END:initComponents

    private void cmbLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoaiSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLoaiSPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        xuLyTimKiem();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        xuLyTimKiem();
    }//GEN-LAST:event_jButton1MouseClicked

    private void tableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSPMouseClicked
        xuLyClickTblSanPham();
    }//GEN-LAST:event_tableSPMouseClicked

    private void btnThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseClicked
        xuLyThanhToan();
    }//GEN-LAST:event_btnThanhToanMouseClicked

    private void tablePNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePNMouseClicked

        JTable target = (JTable)evt.getSource();
        int row = target.getSelectedRow();
        int column = target.getSelectedColumn();
        DecimalFormat dcf = new DecimalFormat("###,###");
        DefaultTableModel model = (DefaultTableModel) tablePN.getModel();
        if (column == 5) {
             int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "", JOptionPane.YES_NO_OPTION);
             if (n == JOptionPane.OK_OPTION) {
             String tt = tablePN.getValueAt(row, 4) + "";
             float thanhtien = Float.parseFloat(tt);
             tongtien -= thanhtien;
             txtTotalPrice.setText(dcf.format(tongtien));
             model.removeRow(row);
             }
        }
    }//GEN-LAST:event_tablePNMouseClicked
    
    
    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
    
    private JTable setMyTable() {
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        tableSP.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        tableSP.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tableSP.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tableSP.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tableSP.setRowHeight(20);
        JTableHeader header = tableSP.getTableHeader();
        header.setBackground(new Color(242, 153, 74));
        return tableSP;
    }
    private JTable setMyTable1() {
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        tablePN.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        tablePN.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tablePN.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tablePN.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tablePN.getColumn("Xóa").setCellRenderer(new ButtonRenderer());
        tablePN.setRowHeight(20);
        JTableHeader header = tablePN.getTableHeader();
        header.setBackground(new Color(235, 86, 236));
        return tablePN;
    }
    
    private void loadDataCmbLoai() {
        cmbLoaiSP.removeAllItems();
        
        cmbLoaiSP.addItem("0 - Tất cả");
        ArrayList<LoaiSanPham> dsl = loaiBUS.getDanhSachLoai();
        for (LoaiSanPham loai : dsl) {
            cmbLoaiSP.addItem(loai.getMaLoai() + " - " + loai.getTenLoai());
        }
    }
    
    private void loadDataCmbNCC() {
        cmbTNCC.removeAllItems();
        
        ArrayList<NhaCungCap> dsl = nccBUS.getListNhaCungCap();
        for (NhaCungCap loai : dsl) {
            cmbTNCC.addItem(loai.getMaNCC() + " - " + loai.getTenNCC());
        }
    }
    
    private void loadDataLenBangSanPham() {
        pnBUS.docListSanPham();
        dtmSanPham = (DefaultTableModel) setMyTable().getModel();
        dtmSanPham.setRowCount(0);
        ArrayList<SanPham> dssp = pnBUS.getListSanPham();
        DecimalFormat dcf = new DecimalFormat("###,###");

        Object obj[] = new Object[4];
        for (SanPham sp : dssp) {
            obj[0] = sp.getMaSP();
            obj[1] = sp.getTenSP();
            obj[2] = sp.getSoLuong();
            obj[3] = dcf.format(sp.getGiaSP());
            dtmSanPham.addRow(obj);
        }
    }
    private void xuLyTimKiem() {
        String ten = txtSearch.getText().toLowerCase();
        String Loai = cmbLoaiSP.getSelectedItem().toString();
        String[] loaiTmp = Loai.split(" - ");
        String maLoai = loaiTmp[0];
        ArrayList<SanPham> dssp;
        dtmSanPham = (DefaultTableModel) tableSP.getModel();
        dtmSanPham.setRowCount(0);
        DecimalFormat dcf = new DecimalFormat("###,###");

        Object obj[] = new Object[4];
        if (Integer.parseInt(maLoai) != 0 && !ten.equals("")) {
            dssp = pnBUS.getSanPhamTheoLoai(maLoai);
            ArrayList<SanPham> dsspTENLoai = new ArrayList<>();
            for (SanPham sp : dssp) {
                String tenSP = sp.getTenSP().toLowerCase();
                if (tenSP.toLowerCase().contains(ten.toLowerCase())) {
                    dsspTENLoai.add(sp);
                }
            }
            for (SanPham sp : dsspTENLoai) {
                    obj[0] = sp.getMaSP();
                    obj[1] = sp.getTenSP();
                    obj[2] = sp.getSoLuong();
                    obj[3] = dcf.format(sp.getGiaSP());
                    dtmSanPham.addRow(obj);
                }
        }
        else if (Integer.parseInt(maLoai) != 0 && ten.equals(""))  {
        dssp = pnBUS.getSanPhamTheoLoai(maLoai);
            for (SanPham sp : dssp) {
                    obj[0] = sp.getMaSP();
                    obj[1] = sp.getTenSP();
                    obj[2] = sp.getSoLuong();
                    obj[3] = dcf.format(sp.getGiaSP());
                    dtmSanPham.addRow(obj);
            }
        }
        else {
            dssp = pnBUS.getSanPhamTheoTen(ten);
            for (SanPham sp : dssp) {
                    obj[0] = sp.getMaSP();
                    obj[1] = sp.getTenSP();
                    obj[2] = sp.getSoLuong();
                    obj[3] = dcf.format(sp.getGiaSP());
                    dtmSanPham.addRow(obj);
            }
        }
        
        }
    public static boolean isNumeric(String str) { 
        try {  
          Integer.valueOf(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
    float tongtien = 0;
    DefaultTableModel dtmLoaiSanPham ;
    private void xuLyClickTblSanPham(){
        int row = tableSP.getSelectedRow();
        dtmLoaiSanPham = (DefaultTableModel) setMyTable1().getModel();
        DecimalFormat dcf = new DecimalFormat("###,###");
        if (row > -1) {
            String ma = tableSP.getValueAt(row, 0) + "";
            String ten = tableSP.getValueAt(row, 1) + "";
            String donGia = tableSP.getValueAt(row, 3) + "";
 
            String value = JOptionPane.showInputDialog("Nhập số lượng");
            if (value.equals(""))  {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập gì!", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!isNumeric(value))  {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số!", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int soLuong = Integer.parseInt(value);
            if (soLuong <= 0)  {
                JOptionPane.showMessageDialog(null, "Số lượng phải dương!", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            donGia = donGia.replace(",", "");
            int rowPN = tablePN.getRowCount();
            System.out.println(rowPN);
            if (rowPN == 0) {
                    float thanhtien = (float) (Float.parseFloat(donGia) * soLuong * 1.0);
                    tongtien += thanhtien;
                    Object obj[] = new Object[6];
                    obj[0] = Integer.valueOf(ma);
                    obj[1] = ten;
                    obj[2] = soLuong;
                    obj[3] = Float.valueOf(donGia);
                    obj[4] = thanhtien;
                    obj[5] = "Xóa";
                    dtmLoaiSanPham.addRow(obj);
            } 
             for (int i = 0 ; i < rowPN ;i ++) {
                String maPN = tablePN.getValueAt(i, 0) + "";    
                if (Integer.parseInt(maPN) != Integer.parseInt(ma)) {
                    float thanhtien = (float) (Float.parseFloat(donGia) * soLuong * 1.0);
                    tongtien += thanhtien;
                    Object obj[] = new Object[6];
                    obj[0] = Integer.valueOf(ma);
                    obj[1] = ten;
                    obj[2] = soLuong;
                    obj[3] = Float.valueOf(donGia);
                    obj[4] = thanhtien;
                    obj[5] = "Xóa";
                    dtmLoaiSanPham.addRow(obj);
                    break;
                } else {
                        String slPN = tablePN.getValueAt(i, 2) + "";
                        int sl = Integer.parseInt(slPN);
                        float thanhtienBD = (float) (Float.parseFloat(donGia) * sl * 1.0);
                        float thanhtienNEW = (float) (Float.parseFloat(donGia) * (sl+soLuong) * 1.0);
                        tongtien += (thanhtienNEW-thanhtienBD);
                        dtmLoaiSanPham.removeRow(i);
                        Object obj[] = new Object[6];
                        obj[0] = Integer.valueOf(ma);
                        obj[1] = ten;
                        obj[2] = soLuong+sl;
                        obj[3] = Float.valueOf(donGia);
                        obj[4] = thanhtienNEW;
                        obj[5] = "Xóa";
                        dtmLoaiSanPham.addRow(obj);
                        dtmLoaiSanPham.fireTableDataChanged();
                        break;
                }
                }
                    
                
            txtTotalPrice.setText(dcf.format(tongtien));
        }
    }
    
    

    
    private void xuLyThanhToan() {
        String total = txtTotalPrice.getText();
        DecimalFormat dcf = new DecimalFormat("###,###");
        if (total.equals(""))  {
                JOptionPane.showMessageDialog(this, "Bạn chưa mua gì!", "", JOptionPane.ERROR_MESSAGE);
                return;
        }
        total = total.replace(",", "");
        String manv = txtMaNV.getText();
        String ncc = cmbTNCC.getSelectedItem() + "";
        float tongtien = Float.parseFloat(total);
        int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thanh toán?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            boolean pn = pnBUS.themPhieuNhap(ncc, manv, tongtien);
            int idPN = pnBUS.getLastID();
            int rowPN = tablePN.getRowCount();
            for (int i = 0 ; i < rowPN ;i ++) {
                String maSP = tablePN.getValueAt(i, 0) + "";
                String sl = tablePN.getValueAt(i, 2) + ""; 
                String tt = tablePN.getValueAt(i, 4) + ""; 
                pnBUS.themCTPhieuNhap(idPN, maSP, sl, tt);
            }
            if (pn) {
                JOptionPane.showMessageDialog(this, "Thanh toán thành công!");
            }
            txtTotalPrice.setText(dcf.format(0));
            dtmLoaiSanPham = (DefaultTableModel) setMyTable1().getModel();
            dtmLoaiSanPham.setRowCount(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JComboBox<String> cmbLoaiSP;
    private javax.swing.JComboBox<String> cmbTNCC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnListPhieuNhap;
    private javax.swing.JPanel pnListSanPham;
    private javax.swing.JPanel pnPhieuNhap;
    private javax.swing.JTable tablePN;
    private javax.swing.JTable tableSP;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables

}
