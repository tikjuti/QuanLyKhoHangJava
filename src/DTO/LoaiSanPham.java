
package DTO;


public class LoaiSanPham {
    private int maLoai;
    private String tenLoai;
    private boolean isDeleted;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int maLoai, String tenLoai,boolean isDeleted) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.isDeleted = isDeleted;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    
    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
