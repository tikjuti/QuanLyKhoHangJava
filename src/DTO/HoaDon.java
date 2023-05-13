
package DTO;

import java.util.Date;

public class HoaDon {
    private int MaHD;
    private Date NgayDate;
    private int MaNV;
    private int MaKH;
    private float TongTien;
    private boolean IsDeleted;

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

  
    public HoaDon() {
    }

    public HoaDon(int MaHD, Date NgayDate, int MaNV, int MaKH, float TongTien,boolean IsDeleted) {
        this.MaHD = MaHD;
        this.NgayDate = NgayDate;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.TongTien = TongTien;
        this.IsDeleted = IsDeleted;
    }
    
    

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }


    public Date getNgayDate() {
        return NgayDate;
    }

    public void setNgayDate(Date NgayDate) {
        this.NgayDate = NgayDate;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    
    
}
