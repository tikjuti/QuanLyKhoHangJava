
package DTO;

import java.util.ArrayList;


public class ThongKe {
    public int soLuongSP;
    public int soLuongKH;
    public int[] tongThuQuy;
    public ArrayList<SanPham> topSanPhamBanChay;

    public ThongKe() {
    }

    public ThongKe(int soLuongSP, int soLuongKH, int[] tongThuQuy, ArrayList<SanPham> topSanPhamBanChay) {
        this.soLuongSP = soLuongSP;
        this.soLuongKH = soLuongKH;
        this.tongThuQuy = tongThuQuy;
        this.topSanPhamBanChay = topSanPhamBanChay;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public int getSoLuongKH() {
        return soLuongKH;
    }

    public void setSoLuongKH(int soLuongNV) {
        this.soLuongKH = soLuongNV;
    }

    public int[] getTongThuQuy() {
        return tongThuQuy;
    }

    public int getTongThuQuy(int quy) {
        return tongThuQuy[quy - 1];
    }

    public void setTongThuQuy(int[] tongThuQuy) {
        this.tongThuQuy = tongThuQuy;
    }

    public int getTongDoanhThu() {
        int tong = 0;
        for (int i = 0; i < 4; i++) {
            tong += tongThuQuy[i];
        }
        return tong;
    }

    public ArrayList<SanPham> getTopSanPhamBanChay() {
        return topSanPhamBanChay;
    }

    public void setTopSanPhamBanChay(ArrayList<SanPham> topSanPhamBanChay) {
        this.topSanPhamBanChay = topSanPhamBanChay;
    }
}

