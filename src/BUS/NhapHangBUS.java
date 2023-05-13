
package BUS;

import DAO.NhapHangDAO;
import DTO.CTPhieuNhap;
import DTO.NhapHang;
import DTO.SanPham;
import java.util.ArrayList;

public class NhapHangBUS {
 
    private ArrayList<SanPham> listSanPham = null;
    NhapHangDAO spDAO = new NhapHangDAO();

    public NhapHangBUS() {
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
    
    public boolean themPhieuNhap(String nhaCungCap, String nhanVien, float tongTien) {
        String[] NCC = nhaCungCap.split(" - ");
        
        boolean ST = false;
        
        int maNCC = Integer.parseInt(NCC[0]);
        int maNV = Integer.parseInt(nhanVien);

        NhapHang pn = new NhapHang();
        pn.setMaNCC(maNCC);
        pn.setMaNV(maNV);
        pn.setTongTien(tongTien);
        pn.setIsDeleted(ST);

        return spDAO.themPhieuNhap(pn);
    }
    public boolean themCTPhieuNhap(int mapn, String masp, String sl, String thanhtien) {
        int maSP = Integer.parseInt(masp);
        int soLuong = Integer.parseInt(sl);
        float tongTien = Float.parseFloat(thanhtien);
        boolean status = false;
        CTPhieuNhap pn = new CTPhieuNhap();
        pn.setMaPN(mapn);
        pn.setMaSP(maSP);
        pn.setSoLuong(soLuong);
        pn.setThanhTien(tongTien);
        pn.setIsDeleted(status);

        return spDAO.themCTPhieuNhap(pn);
    }
    
    public int getLastID() {
        return spDAO.getLastID();
    }
}
