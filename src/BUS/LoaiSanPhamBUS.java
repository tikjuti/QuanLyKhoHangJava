
package BUS;

import DAO.LoaiSanPhamDAO;
import DTO.LoaiSanPham;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class LoaiSanPhamBUS {
    
    LoaiSanPhamDAO loaiDAO = new LoaiSanPhamDAO();
    private ArrayList<LoaiSanPham> listLoai = null;
    
    public LoaiSanPhamBUS() {
        docDanhSachLoai();
    }

    public void docDanhSachLoai() {
        this.listLoai = loaiDAO.getDanhSachLoai();
    }

    public ArrayList<LoaiSanPham> getDanhSachLoai() {
        if (listLoai == null) {
            docDanhSachLoai();
        }
        return this.listLoai;
    }

    public ArrayList<LoaiSanPham> getLoaiSanPhamTheoTen(String ten) {
        ArrayList<LoaiSanPham> dssp = new ArrayList<>();
        for (LoaiSanPham sp : getDanhSachLoai()) {
            String tenSP = sp.getTenLoai().toLowerCase();
            if (tenSP.toLowerCase().contains(ten.toLowerCase())) {
                dssp.add(sp);
            }
        }
        return dssp;
    }
    public String getTenLoai(int ma) {
        for (LoaiSanPham loai : listLoai) {
            if (loai.getMaLoai() == ma) {
                return loai.getMaLoai() + " - " + loai.getTenLoai();
            }
        }
        return "";
    }

    public boolean themLoai(String tenLoai) {
        if (tenLoai.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên loại sản phẩm!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            
            boolean statusLoai;
            statusLoai = false; 
            for (LoaiSanPham sp : getDanhSachLoai()) {
                String tenSP = sp.getTenLoai().toLowerCase();
                if (tenSP.toLowerCase().trim().equals(tenLoai.toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Loại sản phẩm đã tồn tại!", "", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
            }
            LoaiSanPham sp = new LoaiSanPham();
            sp.setTenLoai(tenLoai);
            sp.setIsDeleted(statusLoai);

            if (loaiDAO.themLoai(sp)) {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
        }
        return false;
    }

    public boolean xoaLoai(String ma) {
        if (ma.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn loại cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int maSP = Integer.parseInt(ma);
        if (loaiDAO.xoaLoai(maSP)) {
            JOptionPane.showMessageDialog(null, "Xóa loại sản phẩm thành công!");
            return true;
        }

        JOptionPane.showMessageDialog(null, "Xóa loại sản phẩm thất bại", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public boolean suaLoai(String ma, String ten) {
        try {
            if (ma.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Chưa chọn loại sản phẩm để sửa", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            int maSP = Integer.parseInt(ma);
            boolean statusSP;
            statusSP = false;

            if (ten.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Tên sản phẩm không được để trống", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            LoaiSanPham sp = new LoaiSanPham();
            sp.setMaLoai(maSP);
            sp.setTenLoai(ten);
            sp.setIsDeleted(statusSP);

            if (loaiDAO.suaLoai(sp)) {
                JOptionPane.showMessageDialog(null, "Sửa sản phẩm thành công!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sửa sản phẩm thất bại", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
        }
        return false;
    }
    
     public boolean xoaAllSanPham() {
        try {
            loaiDAO.xoaAllSanPhamTu();
        } catch (NumberFormatException e) {
        }
        return false;
    }
     public boolean nhapSanPhamTuExcel(String ten) {

        try {
            boolean statusSP;
            statusSP = false; 
            LoaiSanPham sp = new LoaiSanPham();
            sp.setTenLoai(ten);
            sp.setIsDeleted(statusSP);

            loaiDAO.themLoai(sp);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
    
}
