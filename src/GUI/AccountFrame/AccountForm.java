package GUI.AccountFrame;

//import BUS.ChucVuBUS;
import BUS.NhanVienBUS;
import BUS.TaiKhoanBUS;
//import DTO.ChucVu;
import DTO.NhanVien;
import DTO.TaiKhoan;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

public class AccountForm extends javax.swing.JPanel {

    private TaiKhoan taiKhoanDTO = new TaiKhoan();
    private TaiKhoanBUS taiKhoanBUS = new TaiKhoanBUS();
    private NhanVienBUS nhanVienBUS = new NhanVienBUS();
//    private ChucVuBUS chucVuBUS = new ChucVuBUS();

    public AccountForm() {
        initComponents();
        jScrollPane2.setVerticalScrollBar(new JScrollBar());
        jScrollPane2.getVerticalScrollBar().setBackground(Color.WHITE);
        jScrollPane2.getViewport().setBackground(Color.white);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.white);
        jScrollPane2.setCorner(jScrollPane2.UPPER_RIGHT_CORNER, jPanel);
        loadIDNVToComboBox();
//        loadIDCVToComboBox();
        loadDataToTable();
    }

    public void loadDataToTable() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Mã tài khoản");
        dtm.addColumn("Username");
        dtm.addColumn("Password");
        dtm.addColumn("Ngày tạo");
        dtm.addColumn("Mã nhân viên");
        dtm.addColumn("Chức vụ");
        table1.setModel(dtm);
        ArrayList<TaiKhoan> taiKhoanList = new ArrayList<TaiKhoan>();
        taiKhoanList = taiKhoanBUS.getAll();
        for (int i = 0; i < taiKhoanList.size(); i++) {
            TaiKhoan tk = taiKhoanList.get(i);
            int id = tk.getSoTK();
            String username = tk.getUserName();
            String password = tk.getPassWord();
            Date ngayTao = tk.getNgayTao();

            int idNV = tk.getMaNV();
            String chucVu = tk.getChucVu();

            Object[] row = {id, username, password, ngayTao, idNV, chucVu};
            dtm.addRow(row);
        }
    }

    private void loadIDNVToComboBox() {
        boxIDNV.removeAllItems();
        boxIDNV.addItem("Chọn mã nhân viên");
        ArrayList<NhanVien> list = nhanVienBUS.getListNhanVien();
        for (NhanVien nhanVien : list) {
            boxIDNV.addItem(Integer.toString(nhanVien.getMaNV()));
        }
    }

//    private void loadIDCVToComboBox() {
//        boxCV.removeAllItems();
//        boxCV.addItem("Chọn mã nhân viên");
//        ArrayList<ChucVu> list = chucVuBUS.getAll();
//        for (ChucVu chucVu : list) {
//            boxCV.addItem(Integer.toString(chucVu.getMaCV()));
//        }
//    }

    public void clearText() {
        txtID.setText("");
        txtUsername.setText("");
        txtPass.setText("");
        txtDate.setText("");
        boxIDNV.setSelectedIndex(0);
        boxCV.setSelectedIndex(0);
        txtID.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panelGUI1 = new GUI.MainFrame.PanelGUI();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new GUI.AccountFrame.Table();
        jPanel1 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        shape1 = new GUI.AccountFrame.Shape();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnAdd = new GUI.component.Button();
        btnDelete = new GUI.component.Button();
        btnClear = new GUI.component.Button();
        btnRefesh = new GUI.component.Button();
        txtDate = new GUI.component.DateText();
        boxIDNV = new javax.swing.JComboBox<>();
        boxCV = new javax.swing.JComboBox<>();
        btnUpdate = new GUI.component.Button();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(67, 67, 67));

        panelGUI1.setBackground(new java.awt.Color(67, 67, 67));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 181, 224));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list-icon.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH TÀI KHOẢNG");

        jScrollPane2.setBorder(null);

        table1.setBackground(new java.awt.Color(33, 33, 33));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tài khoản", "Username", "Password", "Ngày tạo", "Mã nhân viên", "Chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        javax.swing.GroupLayout panelGUI1Layout = new javax.swing.GroupLayout(panelGUI1);
        panelGUI1.setLayout(panelGUI1Layout);
        panelGUI1Layout.setHorizontalGroup(
            panelGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGUI1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGUI1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGUI1Layout.setVerticalGroup(
            panelGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGUI1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setOpaque(false);

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(42, 148, 208));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info.png"))); // NOI18N
        jLabel82.setText("Thông tin chi tiết");

        shape1.setBackground(new java.awt.Color(33, 33, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã tài khoản:");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPass.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ngày tạo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chức vụ:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mã nhân viên:");

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID.setBorder(null);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRefesh.setText("Refesh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        boxIDNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRATOR", "EMPLOYEE" }));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shape1Layout = new javax.swing.GroupLayout(shape1);
        shape1.setLayout(shape1Layout);
        shape1Layout.setHorizontalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shape1Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(shape1Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(shape1Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9))))
                    .addGroup(shape1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxIDNV, 0, 178, Short.MAX_VALUE)
                            .addComponent(boxCV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(shape1Layout.createSequentialGroup()
                                .addComponent(btnRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(shape1Layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addGap(107, 107, 107))))))
        );
        shape1Layout.setVerticalGroup(
            shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxIDNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(shape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 644, Short.MAX_VALUE))
                    .addComponent(shape1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel82)
                .addGap(18, 18, 18)
                .addComponent(shape1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelGUI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelGUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int row = table1.getSelectedRow();
        txtID.setText(table1.getValueAt(row, 0).toString());
        txtUsername.setText(table1.getValueAt(row, 1).toString());
        txtPass.setText(table1.getValueAt(row, 2).toString());
        txtDate.setText(table1.getValueAt(row, 3).toString());
        txtDate.setText(table1.getValueAt(row, 3).toString());
        boxIDNV.setSelectedItem(table1.getValueAt(row, 4).toString());
        boxCV.setSelectedItem(table1.getValueAt(row, 5).toString());

    }//GEN-LAST:event_table1MouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        add();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearText();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        loadDataToTable();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void add() {
        String id = txtID.getText();
        String username = txtUsername.getText();
        String password = txtPass.getText();
        String ngayTao = txtDate.getText();

        String idNV = (String) boxIDNV.getSelectedItem();
        String chucVu = (String) boxCV.getSelectedItem();

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            taiKhoanDTO.setSoTK(Integer.parseInt(id));
            taiKhoanDTO.setUserName(username);
            taiKhoanDTO.setPassWord(password);
            taiKhoanDTO.setNgayTao(formatter.parse(ngayTao));

            taiKhoanDTO.setMaNV(Integer.parseInt(idNV));
            taiKhoanDTO.setChucVu(chucVu);

            taiKhoanBUS.add(taiKhoanDTO);
            clearText();
            loadDataToTable();
            JOptionPane.showMessageDialog(this, "Add success!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void update() {
        String id = txtID.getText();
        String username = txtUsername.getText();
        String password = txtPass.getText();
        String ngayTao = txtDate.getText();

        String idNV = (String) boxIDNV.getSelectedItem();
        String chucVu = (String) boxCV.getSelectedItem();

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            taiKhoanDTO.setSoTK(Integer.parseInt(id));
            taiKhoanDTO.setUserName(username);
            taiKhoanDTO.setPassWord(password);
            taiKhoanDTO.setNgayTao(formatter.parse(ngayTao));

            taiKhoanDTO.setMaNV(Integer.parseInt(idNV));
            taiKhoanDTO.setChucVu(chucVu);

            taiKhoanBUS.edit(taiKhoanDTO);
            clearText();
            loadDataToTable();
            JOptionPane.showMessageDialog(this, "Update success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void delete() {
        if (table1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "vui lòng chọn đối tượng để xóa!");
        } else {
            int n = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa!", "", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                try {

                    taiKhoanDTO.setSoTK(Integer.parseInt(txtID.getText()));
                    taiKhoanBUS.remove(taiKhoanDTO);
                    clearText();
                    txtID.requestFocus();
                    loadDataToTable();
                    JOptionPane.showMessageDialog(this, "Deleted success!");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCV;
    private javax.swing.JComboBox<String> boxIDNV;
    private GUI.component.Button btnAdd;
    private GUI.component.Button btnClear;
    private GUI.component.Button btnDelete;
    private GUI.component.Button btnRefesh;
    private GUI.component.Button btnUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private GUI.MainFrame.PanelGUI panelGUI1;
    private GUI.AccountFrame.Shape shape1;
    private GUI.AccountFrame.Table table1;
    private GUI.component.DateText txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
