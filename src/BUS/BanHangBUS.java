
package BUS;

import DAO.BanHangDAO;
import DTO.CTHoaDon;
import DTO.HoaDon;
import DTO.SanPham;
import java.util.ArrayList;

public class BanHangBUS {
 
    private ArrayList<SanPham> listSanPham = null;
    BanHangDAO spDAO = new BanHangDAO();

    public BanHangBUS() {
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
    
    public boolean themPhieuNhap(String nhanvien, String khachhang, float tongTien) {
        String[] NCC = khachhang.split(" - ");
        
        boolean ST = false;
        
        int maNCC = Integer.parseInt(NCC[0]);
        int maNV = Integer.parseInt(nhanvien);

        HoaDon pn = new HoaDon();
        pn.setMaKH(maNCC);
        pn.setMaNV(maNV);
        pn.setTongTien(tongTien);
        pn.setIsDeleted(ST);

        return spDAO.themPhieuNhap(pn);
    }
    public boolean themCTPhieuNhap(String masp, int mapn,  String sl, String thanhtien) {
        int maSP = Integer.parseInt(masp);
        int soLuong = Integer.parseInt(sl);
        float tongTien = Float.parseFloat(thanhtien);
        boolean status = false;
        CTHoaDon pn = new CTHoaDon();
        pn.setIDSP(maSP);
        pn.setMaHD(mapn);
        pn.setSL(soLuong);
        pn.setTongtien(tongTien);
        pn.setIsDeleted(status);

        return spDAO.themCTPhieuNhap(pn);
    }
    
    public int getLastID() {
        return spDAO.getLastID();
    }
}
