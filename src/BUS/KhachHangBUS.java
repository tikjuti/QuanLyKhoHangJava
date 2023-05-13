
package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHang;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class KhachHangBUS {
    
    KhachHangDAO khachHangDAO = new KhachHangDAO();
    private ArrayList<KhachHang> listKhachHang = null;

    public KhachHangBUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listKhachHang = khachHangDAO.getListKhachHang();
    }

    public ArrayList<KhachHang> getListKhachHang() {
        if (this.listKhachHang == null) {
            docDanhSach();
        }
        return this.listKhachHang;
    }
    
    public ArrayList<KhachHang> getKhachHangTheoTen(String ten) {
        ArrayList<KhachHang> dssp = new ArrayList<>();
        for (KhachHang sp : getListKhachHang()) {
            String tenSP = sp.getTenKH().toLowerCase();
            if (tenSP.toLowerCase().contains(ten.toLowerCase())) {
                dssp.add(sp);
            }
        }
        return dssp;
    }
    
    public boolean themKhachHang(String tenKH, String gioiTinh, String diaChi, String dienThoai, String email) {
        if (tenKH.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên khách hàng!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (gioiTinh.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền giới tính!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (diaChi.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền địa chỉ!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(dienThoai).matches()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền số điện thoại!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền email!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            boolean statusLoai;
            boolean gioiTinhLoai;
            statusLoai = false;
            gioiTinhLoai = Integer.parseInt(gioiTinh) == 1;
            
            for (KhachHang sp : getListKhachHang()) {
                String tenSP = sp.getTenKH().toLowerCase();
                if (tenSP.toLowerCase().trim().equals(tenKH.toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Khách hàng đã tồn tại!", "", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
            }
            
            KhachHang ncc = new KhachHang();
            ncc.setTenKH(tenKH);
            ncc.setGioiTinh(gioiTinhLoai);
            ncc.setDiaChi(diaChi);
            ncc.setDienThoai(dienThoai);
            ncc.setEmail(email);
            ncc.setIsDeleted(statusLoai);
            boolean flag = khachHangDAO.addKH(ncc);
            if (flag) {
                JOptionPane.showMessageDialog(null, "Thêm mới thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm mới thất bại!", "", JOptionPane.ERROR_MESSAGE);
            }
            }catch (HeadlessException | NumberFormatException e) {
                
        }
        return false;
    }

    public boolean suaKhachHang(String maKH, String tenKH, String gioiTinh, String diaChi, String dienThoai, String email) {
        if (tenKH.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên khách hàng!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (gioiTinh.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền giới tính!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (diaChi.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền địa chỉ!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(dienThoai).matches()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đúng số điện thoại!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền email!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int ma = Integer.parseInt(maKH);
        boolean statusSP;
        statusSP = false;
        boolean gioiTinhLoai;
        gioiTinhLoai = Integer.parseInt(gioiTinh) == 1;
        
        KhachHang ncc = new KhachHang();
        ncc.setMaKH(ma);
        ncc.setTenKH(tenKH);
        ncc.setGioiTinh(gioiTinhLoai);
        ncc.setDiaChi(diaChi);
        ncc.setDienThoai(dienThoai);
        ncc.setEmail(email);
        ncc.setIsDeleted(statusSP);
        
        boolean flag = khachHangDAO.updateKH(ncc);

        if (flag) {
            JOptionPane.showMessageDialog(null, "Sửa khách hàng thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Sửa khách hàng thất bại!", "", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    
    public boolean xoaKhachHang(String ma) {
        if (ma.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int maKH = Integer.parseInt(ma);
        if (khachHangDAO.deleteKH(maKH)) {
            JOptionPane.showMessageDialog(null, "Xóa khách hàng thành công!");
            return true;
        }

        JOptionPane.showMessageDialog(null, "Xóa khách hàng thất bại", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean xoaAllKhachHang() {
        try {
            khachHangDAO.xoaAllKhachHang();
        } catch (NumberFormatException e) {
        }
        return false;
    }
    
    public boolean nhapKhachHangTuExcel(String ten, String gioitinh,
            String sdt,
            String diachi,
            String email) {

        try {
            boolean statusSP;
            statusSP = false; 
            boolean gt ;
            gt = gioitinh.trim().equals("Nam");
            KhachHang sp = new KhachHang();
            sp.setTenKH(ten);
            sp.setGioiTinh(gt);
            sp.setDienThoai(sdt);
            sp.setDiaChi(diachi);
            sp.setEmail(email);
            sp.setIsDeleted(statusSP);

            khachHangDAO.addKH(sp);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
