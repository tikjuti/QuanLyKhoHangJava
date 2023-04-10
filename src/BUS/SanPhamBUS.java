
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPham;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SanPhamBUS {
    private ArrayList<SanPham> listSanPham = null;
    SanPhamDAO spDAO = new SanPhamDAO();

    public SanPhamBUS() {
        docListSanPham();
    }

    public void docListSanPham() {
        listSanPham = spDAO.getListSanPham();
    }
    
    public ArrayList<SanPham> getListSanPham() {
        if (listSanPham == null) {
            docListSanPham();
        }
        return listSanPham;
    }
    
    public ArrayList<SanPham> getSanPhamTheoTen(String ten) {
        ArrayList<SanPham> dssp = new ArrayList<>();
        for (SanPham sp : getListSanPham()) {
            String tenSP = sp.getTenSP().toLowerCase();
            if (tenSP.toLowerCase().contains(ten.toLowerCase())) {
                dssp.add(sp);
            }
        }
        return dssp;
    }
    public ArrayList<SanPham> getSanPhamTheoLoai(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<SanPham> dssp = new ArrayList<>();
            try {
                int maLoai = Integer.parseInt(ma);
                for (SanPham sp : listSanPham) {
                    if (sp.getMaLoai() == maLoai) {
                        dssp.add(sp);
                    }
                }
                return dssp;
            } catch (NumberFormatException e) {
            }
        }
        return null;
    }
    
    public boolean nhapSanPhamTuExcel(String ten,
            String loai,
            String soLuong,
            String donGia,
            String status) {

        try {
            String[] loaiTmp = loai.split(" - ");
            int maLoai = Integer.parseInt(loaiTmp[0]);
            int soLuongSP = Integer.parseInt(soLuong);
            donGia = donGia.replace(",", "");
            float donGiaSP = Float.parseFloat(donGia);
            
            boolean statusSP;
            statusSP = !status.trim().equals("") || status.trim().equals("Đã xóa") || status.trim().equals("Xóa"); 

            SanPham sp = new SanPham();
            sp.setTenSP(ten);
            sp.setMaLoai(maLoai);
            sp.setSoLuong(soLuongSP);
            sp.setGiaSP(donGiaSP);
            sp.setIsDeleted(statusSP);

            spDAO.nhapSanPhamTuExcel(sp);
        } catch (NumberFormatException e) {
        }
        return false;
    }
    
    public boolean themSanPham(String ten,
            String loai,
            String soLuong,
            String donGia) {

        if (ten.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên sản phẩm!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (soLuong.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền số lượng!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (donGia.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền giá sản phẩm!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            String[] loaiTmp = loai.split(" - ");
            int maLoai = Integer.parseInt(loaiTmp[0]);
            int soLuongSP = Integer.parseInt(soLuong);
            donGia = donGia.replace(",", "");
            float donGiaSP = Float.parseFloat(donGia);
            if (maLoai == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn loại sản phẩm!", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            boolean statusSP;
            statusSP = false; 
            for (SanPham sp : getListSanPham()) {
            String tenSP = sp.getTenSP().toLowerCase();
            if (tenSP.toLowerCase().trim().equals(ten.toLowerCase())) {
                int sl = sp.getSoLuong();
                sp.setSoLuong(soLuongSP+sl);
                if (spDAO.suaSanPham(sp)) {
                    JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công!");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại", "", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            }
            
            SanPham sp = new SanPham();
            sp.setTenSP(ten);
            sp.setMaLoai(maLoai);
            sp.setSoLuong(soLuongSP);
            sp.setGiaSP(donGiaSP);
            sp.setIsDeleted(statusSP);

            if (spDAO.themSanPham(sp)) {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Nhập số hợp lệ cho số lượng!", "", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean xoaSanPham(String ma) {
        if (ma.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần xóa", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int maSP = Integer.parseInt(ma);
        if (spDAO.xoaSanPham(maSP)) {
            JOptionPane.showMessageDialog(null, "Xóa sản phẩm thành công!");
            return true;
        }

        JOptionPane.showMessageDialog(null, "Xóa sản phẩm thất bại", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean suaSanPham(String ma,
            String ten,
            String loai,
            String soLuong,
            String donGia) {

        try {
            if (ma.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm để sửa", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            donGia = donGia.replace(",", "");
            int maSP = Integer.parseInt(ma);
            String[] loaiTmp = loai.split(" - ");
            int maLoai = Integer.parseInt(loaiTmp[0]);
            int soLuongSP = Integer.parseInt(soLuong);
            float donGiaSP = Float.parseFloat(donGia);
            boolean statusSP;
            statusSP = false;
            if (maLoai == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn Loại sản phẩm", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            if (ten.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Tên sản phẩm không được để trống", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            if (soLuong.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền số lượng!", "", JOptionPane.ERROR_MESSAGE);
            return false;
            }
            
            if (donGia.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền giá sản phẩm!", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            SanPham sp = new SanPham();
            sp.setMaSP(maSP);
            sp.setMaLoai(maLoai);
            sp.setTenSP(ten);
            sp.setSoLuong(soLuongSP);
            sp.setGiaSP(donGiaSP);
            sp.setIsDeleted(statusSP);

            if (spDAO.suaSanPham(sp)) {
                JOptionPane.showMessageDialog(null, "Sửa sản phẩm thành công!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sửa sản phẩm thất bại", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Nhập số hợp lệ cho số lượng!", "", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

}
