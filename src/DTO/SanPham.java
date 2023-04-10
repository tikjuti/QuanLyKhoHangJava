
package DTO;


public class SanPham {
    private int maSP;
    private String tenSP;
    private int maLoai;
    private int soLuong;
    private float giaSP;
    private boolean isDeleted;

    public SanPham() {

    }

    public SanPham(int maSP, String tenSP, int maLoai, int soLuong, int giaSP, boolean isDeleted) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maLoai = maLoai;
        this.soLuong = soLuong;
        this.giaSP = giaSP;
        this.isDeleted = isDeleted;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Float giaSP) {
        this.giaSP = giaSP;
    }

    public void xuat() {
        System.out.println(maSP);
        System.out.println(tenSP);
        System.out.println(soLuong);
        System.out.println(giaSP);
        System.out.println(maLoai);
        System.out.println(isDeleted);
    }
}
