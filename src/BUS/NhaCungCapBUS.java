
package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCap;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class NhaCungCapBUS {
    
    NhaCungCapDAO nccDAO = new NhaCungCapDAO();
    private ArrayList<NhaCungCap> listNhaCungCap = null;

    public NhaCungCapBUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listNhaCungCap = nccDAO.getListNhaCungCap();
    }

    public ArrayList<NhaCungCap> getListNhaCungCap() {
        if (this.listNhaCungCap == null) {
            docDanhSach();
        }
        return this.listNhaCungCap;
    }
    
    public ArrayList<NhaCungCap> getNhaCungCapTheoTen(String ten) {
        ArrayList<NhaCungCap> dssp = new ArrayList<>();
        for (NhaCungCap sp : getListNhaCungCap()) {
            String tenSP = sp.getTenNCC().toLowerCase();
            if (tenSP.toLowerCase().contains(ten.toLowerCase())) {
                dssp.add(sp);
            }
        }
        return dssp;
    }
    
    public boolean themNhaCungCap(String tenNV, String diaChi, String dienThoai, String email) {
        if (tenNV.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên nhà cung cấp!", "", JOptionPane.ERROR_MESSAGE);
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
            
            for (NhaCungCap sp : getListNhaCungCap()) {
                String tenSP = sp.getTenNCC().toLowerCase();
                if (tenSP.toLowerCase().trim().equals(tenNV.toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Nhà cung cấp đã tồn tại!", "", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
            }
            
            NhaCungCap ncc = new NhaCungCap();
            ncc.setTenNCC(tenNV);
            ncc.setDiaChi(diaChi);
            ncc.setDienThoai(dienThoai);
            ncc.setEmail(email);
            ncc.setIsDeleted(statusLoai);
            boolean flag = nccDAO.addNCC(ncc);
            if (flag) {
                JOptionPane.showMessageDialog(null, "Thêm mới thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm mới thất bại!", "", JOptionPane.ERROR_MESSAGE);
            }
            }catch (HeadlessException | NumberFormatException e) {
                
        }
        return false;
    }

    public boolean suaNhaCungCap(String maNV, String tenNV, String diaChi, String dienThoai, String email) {
        if (tenNV.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên nhà cung cấp!", "", JOptionPane.ERROR_MESSAGE);
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
        
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNCC(ma);
        ncc.setTenNCC(tenNV);
        ncc.setDiaChi(diaChi);
        ncc.setDienThoai(dienThoai);
        ncc.setEmail(email);
        ncc.setIsDeleted(statusSP);
        
        boolean flag = nccDAO.updateNCC(ncc);

        if (flag) {
            JOptionPane.showMessageDialog(null, "Sửa nhà cung cấp thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Sửa nhà cung cấp thất bại!", "", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    
    public boolean xoaNhaCungCap(String ma) {
        if (ma.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int maKH = Integer.parseInt(ma);
        if (nccDAO.deleteNCC(maKH)) {
            JOptionPane.showMessageDialog(null, "Xóa nhà cung cấp thành công!");
            return true;
        }

        JOptionPane.showMessageDialog(null, "Xóa nhà cung cấp thất bại", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean xoaAllNhaCungCap() {
        try {
            nccDAO.xoaAllNhaCungCap();
        } catch (NumberFormatException e) {
        }
        return false;
    }
    
    public boolean nhapNhaCungCapTuExcel(String ten,
            String sdt,
            String diachi,
            String email) {

        try {
            boolean statusSP;
            statusSP = false; 
            NhaCungCap sp = new NhaCungCap();
            sp.setTenNCC(ten);
            sp.setDienThoai(sdt);
            sp.setDiaChi(diachi);
            sp.setEmail(email);
            sp.setIsDeleted(statusSP);

            nccDAO.addNCC(sp);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
