
package BUS;

import DAO.PhieuNhapDAO;
import DTO.CTPhieuNhap;
import DTO.NhapHang;
import java.awt.HeadlessException;
import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PhieuNhapBUS {
    private ArrayList<NhapHang> listPhieuNhap = null;
    private ArrayList<CTPhieuNhap> listCTPhieuNhap = null;
    private ArrayList<CTPhieuNhap> listCTPhieuNhapMa;
    PhieuNhapDAO spDAO = new PhieuNhapDAO();

    public PhieuNhapBUS() {
        docListPhieuNhap();
        docListCTPhieuNhap();
    }

    public void docListPhieuNhap() {
        listPhieuNhap = spDAO.getListPhieuNhap();
    }
    
    public ArrayList<NhapHang> getListPhieuNhap() {
        if (listPhieuNhap == null) {
            docListPhieuNhap();
        }
        return listPhieuNhap;
    }
    
    public ArrayList<CTPhieuNhap> getListCTPhieuNhapTheoMa(String ma) {
         int maPn = Integer.parseInt(ma);
         listCTPhieuNhapMa = spDAO.getListCTPhieuNhap(maPn);
        return listCTPhieuNhapMa;
    }
    public ArrayList<CTPhieuNhap> getListCTPhieuNhapTheoMa(String ma, String sp) {
         int maPn = Integer.parseInt(ma);
         int maSP = Integer.parseInt(sp);
         listCTPhieuNhapMa = spDAO.getListCTPhieuNhap(maPn, maSP);
        return listCTPhieuNhapMa;
    }
    
     public void docListCTPhieuNhap() {
        listCTPhieuNhap = spDAO.getListCTPhieuNhap();
    }
    
    public ArrayList<CTPhieuNhap> getListCTPhieuNhap() {
        if (listCTPhieuNhap == null) {
            docListPhieuNhap();
        }
        return listCTPhieuNhap;
    }
    
    
    public boolean xoaPhieuNhap(String ma) {
        if (ma.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phiếu nhập cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int maSP = Integer.parseInt(ma);
        if (spDAO.xoaPhieuNhap(maSP)) {
            JOptionPane.showMessageDialog(null, "Xóa phiếu nhập thành công!");
            return true;
        }

        JOptionPane.showMessageDialog(null, "Xóa phiếu nhập thất bại", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean xoaCTPhieuNhap(String mapn, String masp) {
        if (mapn.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn CT phiếu nhập cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (masp.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn CT phiếu nhập cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int maPN = Integer.parseInt(mapn);
        int maSP = Integer.parseInt(masp);
        if (spDAO.xoaCTPhieuNhap(maPN, maSP)) {
            JOptionPane.showMessageDialog(null, "Xóa CT phiếu nhập thành công!");
            return true;
        }

        JOptionPane.showMessageDialog(null, "Xóa CT phiếu nhập thất bại", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean suaPhieuNhap(String mapn,
            String mancc,
            String manv,
            String tongtien){

        try {
            if (mapn.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Chưa chọn phiếu nhập để sửa", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            tongtien = tongtien.replace(",", "");
            int maPN = Integer.parseInt(mapn);
            int maNCC = Integer.parseInt(mancc);
            int maNV = Integer.parseInt(manv);
            float total = Float.parseFloat(tongtien);
            boolean statusSP;
            statusSP = false;

            if (mancc.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Mã nhà cung cấp không được để trống", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            if (manv.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền mã nhân viên!", "", JOptionPane.ERROR_MESSAGE);
            return false;
            }
            
            if (tongtien.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền tổng tiền!", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        
            NhapHang sp = new NhapHang();
            sp.setMaPN(maPN);
            sp.setMaNCC(maNCC);
            sp.setMaNV(maNV);
            sp.setTongTien(total);
            sp.setIsDeleted(statusSP);

            if (spDAO.suaPhieuNhap(sp)) {
                JOptionPane.showMessageDialog(null, "Sửa phiếu nhập thành công!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sửa phiếu nhập thất bại", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
        }
        return false;
    }
    
    public boolean suaCTPhieuNhap(String mapn,
            String masp,
            String soluong,
            String tongtien){

        try {
            if (mapn.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Chưa chọn CT phiếu nhập để sửa", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            tongtien = tongtien.replace(",", "");
            int maPN = Integer.parseInt(mapn);
            int maSP = Integer.parseInt(masp);
            int soLuong = Integer.parseInt(soluong);
            float total = Float.parseFloat(tongtien);
            boolean statusSP;
            statusSP = false;

            if (mapn.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Mã phiếu nhập không được để trống", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            if (masp.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền mã sản phẩm!", "", JOptionPane.ERROR_MESSAGE);
            return false;
            }
            
            if (tongtien.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền tổng tiền!", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            if (soluong.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền số lượng!", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        
            CTPhieuNhap sp = new CTPhieuNhap();
            sp.setMaPN(maPN);
            sp.setMaSP(maSP);
            sp.setSoLuong(soLuong);
            sp.setThanhTien(total);
            sp.setIsDeleted(statusSP);

            if (spDAO.suaCTPhieuNhap(sp)) {
                JOptionPane.showMessageDialog(null, "Sửa phiếu nhập thành công!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sửa phiếu nhập thất bại", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
        }
        return false;
    }

}
