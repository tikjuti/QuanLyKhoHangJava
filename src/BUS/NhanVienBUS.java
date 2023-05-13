
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVien;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class NhanVienBUS {
    
    NhanVienDAO nhanVienDAO = new NhanVienDAO();
    private ArrayList<NhanVien> listNhanVien = null;

    public NhanVienBUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listNhanVien = nhanVienDAO.getListNhanVien();
    }

    public ArrayList<NhanVien> getListNhanVien() {
        if (this.listNhanVien == null) {
            docDanhSach();
        }
        return this.listNhanVien;
    }
    
    public ArrayList<NhanVien> getNhanVienTheoTen(String ten) {
        ArrayList<NhanVien> dssp = new ArrayList<>();
        for (NhanVien sp : getListNhanVien()) {
            String tenSP = sp.getTenNV().toLowerCase();
            if (tenSP.toLowerCase().contains(ten.toLowerCase())) {
                dssp.add(sp);
            }
        }
        return dssp;
    }
    
    public boolean themNhanVien(String tenNV, String diaChi, String dienThoai, String email) {
        if (tenNV.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên nhân viên!", "", JOptionPane.ERROR_MESSAGE);
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
            statusLoai = false;
            
            for (NhanVien sp : getListNhanVien()) {
                String tenSP = sp.getTenNV().toLowerCase();
                if (tenSP.toLowerCase().trim().equals(tenNV.toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Nhân viên đã tồn tại!", "", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
            }
            
            NhanVien ncc = new NhanVien();
            ncc.setTenNV(tenNV);
            ncc.setDiaChi(diaChi);
            ncc.setDienThoai(dienThoai);
            ncc.setEmail(email);
            ncc.setIsDeleted(statusLoai);
            boolean flag = nhanVienDAO.addNV(ncc);
            if (flag) {
                JOptionPane.showMessageDialog(null, "Thêm mới thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm mới thất bại!", "", JOptionPane.ERROR_MESSAGE);
            }
            }catch (HeadlessException | NumberFormatException e) {
                
        }
        return false;
    }

    public boolean suaNhanVien(String maNV, String tenNV, String diaChi, String dienThoai, String email) {
        if (tenNV.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên nhân viên!", "", JOptionPane.ERROR_MESSAGE);
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

        int ma = Integer.parseInt(maNV);
        boolean statusSP;
        statusSP = false;
        
        NhanVien ncc = new NhanVien();
        ncc.setMaNV(ma);
        ncc.setTenNV(tenNV);
        ncc.setDiaChi(diaChi);
        ncc.setDienThoai(dienThoai);
        ncc.setEmail(email);
        ncc.setIsDeleted(statusSP);
        
        boolean flag = nhanVienDAO.updateNV(ncc);

        if (flag) {
            JOptionPane.showMessageDialog(null, "Sửa nhân viên thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Sửa nhân viên thất bại!", "", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    
    public boolean xoaNhanVien(String ma) {
        if (ma.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int maKH = Integer.parseInt(ma);
        if (nhanVienDAO.deleteNV(maKH)) {
            JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công!");
            return true;
        }

        JOptionPane.showMessageDialog(null, "Xóa nhân viên thất bại", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean xoaAllSanPham() {
        try {
            nhanVienDAO.xoaAllSanPhamTu();
        } catch (NumberFormatException e) {
        }
        return false;
    }
    
    public boolean nhapSanPhamTuExcel(String ten,
            String sdt,
            String diachi,
            String email) {

        try {
            boolean statusSP;
            statusSP = false; 
            NhanVien sp = new NhanVien();
            sp.setTenNV(ten);
            sp.setDienThoai(sdt);
            sp.setDiaChi(diachi);
            sp.setEmail(email);
            sp.setIsDeleted(statusSP);

            nhanVienDAO.addNV(sp);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
