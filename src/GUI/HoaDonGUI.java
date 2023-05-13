
package GUI;


import BUS.HoaDonBUS;
import BUS.PhieuNhapBUS;
import DTO.CTHoaDon;
import DTO.CTPhieuNhap;
import DTO.HoaDon;
import DTO.NhapHang;
import MyCustom.XuLyFileExcel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class HoaDonGUI extends javax.swing.JPanel {

    public HoaDonGUI() {
        initComponents();
        loadDataLenBangPhieuNhap();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEditCTPN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTPN = new javax.swing.JTable();
        btnDeleteCTPN = new javax.swing.JButton();
        btnExcelCTPN = new javax.swing.JButton();
        btnResetCTPN = new javax.swing.JButton();
        btnPDPCTPN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEditPN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePN = new javax.swing.JTable();
        btnExcelPN = new javax.swing.JButton();
        btnResetPN = new javax.swing.JButton();
        btnPDFPN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNCCPN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JTextField();
        txtNVPN = new javax.swing.JTextField();
        txtNLPN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotlePN = new javax.swing.JTextField();
        btnDeletePN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaPNCT = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotleCT = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(900, 746));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CT HÓA ĐƠN");

        btnEditCTPN.setBackground(new java.awt.Color(204, 204, 204));
        btnEditCTPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditCTPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pencil-icon.png"))); // NOI18N
        btnEditCTPN.setText("Lưu");
        btnEditCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditCTPNMouseClicked(evt);
            }
        });
        btnEditCTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCTPNActionPerformed(evt);
            }
        });

        tableCTPN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PN", "Mã SP", "Số lượng", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTPNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCTPN);

        btnDeleteCTPN.setBackground(new java.awt.Color(204, 204, 204));
        btnDeleteCTPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteCTPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        btnDeleteCTPN.setText("Xóa");
        btnDeleteCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCTPNMouseClicked(evt);
            }
        });
        btnDeleteCTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCTPNActionPerformed(evt);
            }
        });

        btnExcelCTPN.setBackground(new java.awt.Color(204, 204, 204));
        btnExcelCTPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcelCTPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/excel-icon.png"))); // NOI18N
        btnExcelCTPN.setText("Excel");
        btnExcelCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcelCTPNMouseClicked(evt);
            }
        });

        btnResetCTPN.setBackground(new java.awt.Color(204, 204, 204));
        btnResetCTPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResetCTPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Refresh-icon.png"))); // NOI18N
        btnResetCTPN.setText("Reset");
        btnResetCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetCTPNMouseClicked(evt);
            }
        });

        btnPDPCTPN.setBackground(new java.awt.Color(204, 204, 204));
        btnPDPCTPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPDPCTPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/excel-icon.png"))); // NOI18N
        btnPDPCTPN.setText("PDF");
        btnPDPCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPDPCTPNMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HÓA ĐƠN");

        btnEditPN.setBackground(new java.awt.Color(204, 204, 204));
        btnEditPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pencil-icon.png"))); // NOI18N
        btnEditPN.setText("Lưu");
        btnEditPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditPNMouseClicked(evt);
            }
        });
        btnEditPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPNActionPerformed(evt);
            }
        });

        tablePN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Mã KH", "Mã NV", "Ngày Lập", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
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

        btnExcelPN.setBackground(new java.awt.Color(204, 204, 204));
        btnExcelPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcelPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/excel-icon.png"))); // NOI18N
        btnExcelPN.setText("Excel");
        btnExcelPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcelPNMouseClicked(evt);
            }
        });

        btnResetPN.setBackground(new java.awt.Color(204, 204, 204));
        btnResetPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResetPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Refresh-icon.png"))); // NOI18N
        btnResetPN.setText("Reset");
        btnResetPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetPNMouseClicked(evt);
            }
        });

        btnPDFPN.setBackground(new java.awt.Color(204, 204, 204));
        btnPDFPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPDFPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/excel-icon.png"))); // NOI18N
        btnPDFPN.setText("PDF");
        btnPDFPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPDFPNMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Mã HD:");

        txtNCCPN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Mã KH: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NgayLap:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Mã NV: ");

        txtMaPN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNVPN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNLPN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Tổng tiền:");

        txtTotlePN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDeletePN.setBackground(new java.awt.Color(204, 204, 204));
        btnDeletePN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletePN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        btnDeletePN.setText("Xóa");
        btnDeletePN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletePNMouseClicked(evt);
            }
        });
        btnDeletePN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnResetPN))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExcelPN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditPN, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDeletePN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPDFPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNCCPN)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNVPN)
                            .addComponent(txtNLPN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotlePN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNVPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNCCPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNLPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotlePN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditPN)
                            .addComponent(btnDeletePN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcelPN)
                            .addComponent(btnPDFPN))
                        .addGap(46, 46, 46)
                        .addComponent(btnResetPN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Mã HD: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Mã SP: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Tổng tiền:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Số lượng:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSP))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaPNCT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotleCT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(btnResetCTPN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnExcelCTPN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPDPCTPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEditCTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDeleteCTPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(19, 19, 19))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPNCT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotleCT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditCTPN)
                            .addComponent(btnDeleteCTPN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcelCTPN)
                            .addComponent(btnPDPCTPN))
                        .addGap(43, 43, 43)
                        .addComponent(btnResetCTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCTPNMouseClicked
        xuLySuaCTPhieuNhap();
    }//GEN-LAST:event_btnEditCTPNMouseClicked

    private void btnEditCTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCTPNActionPerformed

    }//GEN-LAST:event_btnEditCTPNActionPerformed

    private void btnDeleteCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCTPNMouseClicked
        xuLyXoaCTPhieuNhap();
    }//GEN-LAST:event_btnDeleteCTPNMouseClicked

    private void btnDeleteCTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCTPNActionPerformed

    }//GEN-LAST:event_btnDeleteCTPNActionPerformed

    private void btnExcelCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelCTPNMouseClicked
        xuLyXuatFileCTExcel();
    }//GEN-LAST:event_btnExcelCTPNMouseClicked

    private void btnResetCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetCTPNMouseClicked
        xuLyResetCT();
    }//GEN-LAST:event_btnResetCTPNMouseClicked

    private void btnPDPCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDPCTPNMouseClicked
        try {
            xuLyXuatFileCTPDF();
        } catch (DocumentException ex) {
            Logger.getLogger(HoaDonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPDPCTPNMouseClicked

    private void btnEditPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPNMouseClicked
        xuLySuaPhieuNhap();
    }//GEN-LAST:event_btnEditPNMouseClicked

    private void btnEditPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditPNActionPerformed

    private void btnExcelPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelPNMouseClicked
        xuLyXuatFileExcel();
    }//GEN-LAST:event_btnExcelPNMouseClicked

    private void btnResetPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPNMouseClicked
        xuLyReset();
    }//GEN-LAST:event_btnResetPNMouseClicked

    private void btnPDFPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFPNMouseClicked
        try {
            xuLyXuatFilePDF();
        } catch (DocumentException ex) {
            Logger.getLogger(HoaDonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPDFPNMouseClicked

    private void btnDeletePNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePNMouseClicked
        xuLyXoaPhieuNhap();
    }//GEN-LAST:event_btnDeletePNMouseClicked

    private void btnDeletePNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletePNActionPerformed

    private void tablePNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePNMouseClicked
        xuLyClickTblPhieuNhap();
    }//GEN-LAST:event_tablePNMouseClicked

    private void tableCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTPNMouseClicked
        xuLyClickTblCTPhieuNhap();
    }//GEN-LAST:event_tableCTPNMouseClicked
    
    HoaDonBUS spBUS = new HoaDonBUS();
    DefaultTableModel dtmSanPham;

    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
    private JTable setMyTable() {
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        tablePN.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        tablePN.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tablePN.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tablePN.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tablePN.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tablePN.setRowHeight(20);
        JTableHeader header = tablePN.getTableHeader();
        header.setBackground(new Color(242, 153, 74));
        return tablePN;
    }
    private JTable setMyTable1() {
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        tableCTPN.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        tableCTPN.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tableCTPN.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tableCTPN.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tableCTPN.setRowHeight(20);
        JTableHeader header = tableCTPN.getTableHeader();
        header.setBackground(new Color(235, 86, 236));
        return tableCTPN;
    }
    
    private void xuLyReset() {
        txtMaPN.setText("");
        txtNVPN.setText("");
        txtNCCPN.setText("");
        txtNLPN.setText("");
        txtTotlePN.setText("");
        loadDataLenBangPhieuNhap();
    }
    
    private void loadDataLenBangPhieuNhap() {
        spBUS.docListPhieuNhap();
        dtmSanPham = (DefaultTableModel) setMyTable().getModel();
        dtmSanPham.setRowCount(0);
        ArrayList<HoaDon> dssp = spBUS.getListPhieuNhap();
        DecimalFormat dcf = new DecimalFormat("###,###");

        Object obj[] = new Object[5];
        for (HoaDon sp : dssp) {
            obj[0] = sp.getMaHD();
            obj[1] = sp.getMaKH();
            obj[2] = sp.getMaNV();
            obj[3] = sp.getNgayDate();
            obj[4] = dcf.format(sp.getTongTien());
            dtmSanPham.addRow(obj);
        }
    }
    
    private void loadDataLenBangCTPhieuNhap() {
        spBUS.docListCTPhieuNhap();
        dtmSanPham = (DefaultTableModel) setMyTable1().getModel();
        dtmSanPham.setRowCount(0);
        ArrayList<CTHoaDon> dssp = spBUS.getListCTPhieuNhapTheoMa(txtMaPNCT.getText(), txtMaSP.getText());
        DecimalFormat dcf = new DecimalFormat("###,###");

        Object obj[] = new Object[5];
        for (CTHoaDon sp : dssp) {
            obj[0] = sp.getMaHD();
            obj[1] = sp.getIDSP();
            obj[2] = sp.getSL();
            obj[3] = dcf.format(sp.getTongtien());
            dtmSanPham.addRow(obj);
        }
    }
     
     private void xuLyClickTblPhieuNhap() {
        int row = tablePN.getSelectedRow();
        if (row > -1) {
            String maPN = tablePN.getValueAt(row, 0) + "";
            String maNCC = tablePN.getValueAt(row, 1) + "";
            String maNV = tablePN.getValueAt(row, 2) + "";
            String ngayLap = tablePN.getValueAt(row, 3) + "";
            String tongTien = tablePN.getValueAt(row, 4) + "";

            txtMaPN.setText(maPN);
            txtNCCPN.setText(maNCC);
            txtNVPN.setText(maNV);
            txtNLPN.setText(ngayLap);
            txtTotlePN.setText(tongTien);
            
            dtmSanPham = (DefaultTableModel) setMyTable1().getModel();
            dtmSanPham.setRowCount(0);
            ArrayList<CTHoaDon> dssp = spBUS.getListCTPhieuNhapTheoMa(maPN);
            DecimalFormat dcf = new DecimalFormat("###,###");

            Object obj[] = new Object[4];
            for (CTHoaDon sp : dssp) {
                obj[0] = sp.getMaHD();
                obj[1] = sp.getIDSP();
                obj[2] = sp.getSL();
                obj[3] = dcf.format(sp.getTongtien());
                dtmSanPham.addRow(obj);
            }
        }
    }
     
     private void xuLyClickTblCTPhieuNhap() {
        int row = tableCTPN.getSelectedRow();
        if (row > -1) {
            String maPN = tableCTPN.getValueAt(row, 0) + "";
            String maSP = tableCTPN.getValueAt(row, 1) + "";
            String soluong = tableCTPN.getValueAt(row, 2) + "";
            String tongTien = tableCTPN.getValueAt(row, 3) + "";

            txtMaPNCT.setText(maPN);
            txtMaSP.setText(maSP);
            txtSoLuong.setText(soluong);
            txtTotleCT.setText(tongTien);
        }
     }
     
     private void xuLyResetCT() {
        txtMaPNCT.setText("");
        txtMaSP.setText("");
        txtSoLuong.setText("");
        txtTotleCT.setText("");
        loadDataLenBangCTPhieuNhap();
    }
     
     private void xuLySuaPhieuNhap() {
        String maPN = txtMaPN.getText();
        String maNCC = txtNCCPN.getText();
        String maNV = txtNVPN.getText();
        String tongTien = txtTotlePN.getText();
        spBUS.suaPhieuNhap(maPN,maNCC,
                maNV,
                tongTien);
        spBUS.docListPhieuNhap();
        loadDataLenBangPhieuNhap();
    }
     
     private void xuLySuaCTPhieuNhap() {
        String maPN = txtMaPNCT.getText();
        String maSP = txtMaSP.getText();
        String soluong = txtSoLuong.getText();
        String tongTien = txtTotleCT.getText();
        spBUS.suaCTPhieuNhap(maPN,maSP,
                soluong,
                tongTien);
        spBUS.docListCTPhieuNhap();
        loadDataLenBangCTPhieuNhap();
    }
     
     private void xuLyXoaPhieuNhap() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            boolean flag = spBUS.xoaPhieuNhap(txtMaPN.getText());
            if (flag) {
                loadDataLenBangPhieuNhap();
            }
        }
    }
     
     private void xuLyXoaCTPhieuNhap() {
        int  n = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.OK_OPTION) {
            boolean flag = spBUS.xoaCTPhieuNhap(txtMaPN.getText(), txtMaSP.getText());
            if (flag) {
                loadDataLenBangCTPhieuNhap();
            }
        }
    }
     
    private void xuLyXuatFileExcel() {
        dtmSanPham = (DefaultTableModel) tablePN.getModel();
        JTable tblSanPham = new JTable(dtmSanPham);
        XuLyFileExcel xuatFile = new XuLyFileExcel();
        xuatFile.xuatExcel(tblSanPham);
    }
    private void xuLyXuatFileCTExcel() {
        dtmSanPham = (DefaultTableModel) tableCTPN.getModel();
        JTable tblSanPham = new JTable(dtmSanPham);
        XuLyFileExcel xuatFile = new XuLyFileExcel();
        xuatFile.xuatExcel(tblSanPham);
    }
    private void xuLyXuatFilePDF() throws DocumentException {
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }
        if (!path.contains(".pdf")) {
                    path += ".pdf";
                }
        Document doc = new Document();
        doc.addTitle("Thông tin phiếu nhập");
        try {
            PdfWriter instance = PdfWriter.getInstance(doc, new FileOutputStream(path));
            doc.open();
            
            PdfPTable tbpn = new PdfPTable(5);
            tbpn.addCell("Mã HD");
            tbpn.addCell("Mã NV");
            tbpn.addCell("Mã KH");
            tbpn.addCell("Ngày tạo");
            tbpn.addCell("Tổng tiền");
            
            for (int i = 0 ; i< tablePN.getRowCount(); i++) {
                String mapn = tablePN.getValueAt(i, 0).toString();
                String mancc = tablePN.getValueAt(i, 1).toString();
                String manv = tablePN.getValueAt(i, 2).toString();
                String ngay = tablePN.getValueAt(i,3).toString();
                String tien = tablePN.getValueAt(i, 4).toString();
                
                tbpn.addCell(mapn);
                tbpn.addCell(mancc);
                tbpn.addCell(manv);
                tbpn.addCell(ngay);
                tbpn.addCell(tien);
            }
            
            doc.add(tbpn);
            JOptionPane.showMessageDialog(null, "Xuất file thành công!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HoaDonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.close();
    }
    
    private void xuLyXuatFileCTPDF() throws DocumentException {
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }
        if (!path.contains(".pdf")) {
                    path += ".pdf";
                }
        Document doc = new Document();
        doc.addTitle("Thông tin CT phiếu nhập");
        try {
            PdfWriter instance = PdfWriter.getInstance(doc, new FileOutputStream(path));
            doc.open();
            
            PdfPTable tbpn = new PdfPTable(4);
            tbpn.addCell("Mã HD");
            tbpn.addCell("Mã SP");
            tbpn.addCell("Số lượng");
            tbpn.addCell("Tổng tiền");
            
            for (int i = 0 ; i< tableCTPN.getRowCount(); i++) {
                String mapn = tableCTPN.getValueAt(i, 0).toString();
                String masp = tableCTPN.getValueAt(i, 1).toString();
                String soluong = tableCTPN.getValueAt(i, 2).toString();
                String tongtien = tableCTPN.getValueAt(i,3).toString();
                
                tbpn.addCell(mapn);
                tbpn.addCell(masp);
                tbpn.addCell(soluong);
                tbpn.addCell(tongtien);
            }
            
            doc.add(tbpn);
            JOptionPane.showMessageDialog(null, "Xuất file thành công!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HoaDonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCTPN;
    private javax.swing.JButton btnDeletePN;
    private javax.swing.JButton btnEditCTPN;
    private javax.swing.JButton btnEditPN;
    private javax.swing.JButton btnExcelCTPN;
    private javax.swing.JButton btnExcelPN;
    private javax.swing.JButton btnPDFPN;
    private javax.swing.JButton btnPDPCTPN;
    private javax.swing.JButton btnResetCTPN;
    private javax.swing.JButton btnResetPN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCTPN;
    private javax.swing.JTable tablePN;
    private javax.swing.JTextField txtMaPN;
    private javax.swing.JTextField txtMaPNCT;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNCCPN;
    private javax.swing.JTextField txtNLPN;
    private javax.swing.JTextField txtNVPN;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTotleCT;
    private javax.swing.JTextField txtTotlePN;
    // End of variables declaration//GEN-END:variables
}
