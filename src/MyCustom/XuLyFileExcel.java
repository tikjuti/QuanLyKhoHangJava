
package MyCustom;


import java.awt.HeadlessException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XuLyFileExcel {
     public void xuatExcel(JTable tbl) {
        try {
            TableModel dtm = tbl.getModel();

            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Lưu vào");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            chooser.setFileFilter(fnef);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                // Lấy đường dẫn vừa chọn + tên tệp
                String path = chooser.getSelectedFile().getPath();
                if (!path.contains(".xlsx")) {
                    path += ".xlsx";
                }

                try (XSSFWorkbook workbook = new XSSFWorkbook()) {
                    Sheet sheet = workbook.createSheet("Sheet 1");
                    
                    Font headerFont = workbook.createFont();
                    headerFont.setBold(true);
                    headerFont.setFontHeightInPoints((short) 14);
                    headerFont.setColor(IndexedColors.WHITE.getIndex());
                    CellStyle headerCellStyle = workbook.createCellStyle();
                    headerCellStyle.setFont(headerFont);
                    headerCellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
                    headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    headerCellStyle.setBorderTop(BorderStyle.THIN);
                    headerCellStyle.setBorderBottom(BorderStyle.THIN);
                    headerCellStyle.setBorderLeft(BorderStyle.THIN);
                    headerCellStyle.setBorderRight(BorderStyle.THIN);
                    headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
                    
                    Row headerRow = sheet.createRow(0);
                    
                    // Tạo header
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        Cell cell = headerRow.createCell(i);
                        cell.setCellValue(dtm.getColumnName(i));
                        cell.setCellStyle(headerCellStyle);
                    }
                    
                    Font contentFont = workbook.createFont();
                    contentFont.setBold(false);
                    contentFont.setFontHeightInPoints((short) 13);
                    contentFont.setColor(IndexedColors.BLACK.getIndex());
                    CellStyle contentCellStyle = workbook.createCellStyle();
                    contentCellStyle.setFont(contentFont);
                    contentCellStyle.setBorderTop(BorderStyle.THIN);
                    contentCellStyle.setBorderBottom(BorderStyle.THIN);
                    contentCellStyle.setBorderLeft(BorderStyle.THIN);
                    contentCellStyle.setBorderRight(BorderStyle.THIN);
                    
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        Row row = sheet.createRow(i + 1);
                        for (int j = 0; j < dtm.getColumnCount(); j++) {
                            Cell cell = row.createCell(j);
                            cell.setCellValue(dtm.getValueAt(i, j) + "");
                            cell.setCellStyle(contentCellStyle);
                            sheet.autoSizeColumn(j);
                        }
                    }
                    
                    try ( // Ghi file
                            FileOutputStream fileOut = new FileOutputStream(path)) {
                        workbook.write(fileOut);
                        workbook.close();
                    }
                }

                JOptionPane.showMessageDialog(null, "Xuất file thành công!");
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Xuất file  thất bại!");
        }
    }
     
     public void nhapExcel(JTable tbl) {
        try {
            TableModel dtm = tbl.getModel();

            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Chọn file");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            chooser.setFileFilter(fnef);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File fileSelected = chooser.getSelectedFile();
                try (FileInputStream fis = new FileInputStream(fileSelected)) {
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    
                    XSSFWorkbook wb = new XSSFWorkbook(bis);
                    XSSFSheet sheet = wb.getSheetAt(0);
                    
                DefaultTableModel dtmtbl = (DefaultTableModel) dtm;
                dtmtbl.setRowCount(0);
                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    Vector vec = new Vector();
                    for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING -> vec.add(cell.getStringCellValue());
                        case NUMERIC -> vec.add(cell.getNumericCellValue());
                        case BOOLEAN -> vec.add(cell.getBooleanCellValue());
                        default -> vec.add("");
                    }
                    }
                    dtmtbl.addRow(vec);
                    }
                }
                JOptionPane.showMessageDialog(null, "Nhập file thành công!");
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Nhập file thất bại", "", JOptionPane.ERROR_MESSAGE);
        }
    }

}
