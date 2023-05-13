package DTO;

import java.util.Date;

public class TaiKhoan {

    private int soTK;
    private String userName;
    private String passWord;
    private Date ngayTao;
    private int maNV;
    private String chucVu;
    private boolean is_deleted;

    public TaiKhoan() {

    }

    public TaiKhoan(int soTK, String userName, String passWord, Date ngayTao, int maNV, String chucVu, boolean is_deleted) {
        this.soTK = soTK;
        this.userName = userName;
        this.passWord = passWord;
        this.ngayTao = ngayTao;
        this.maNV = maNV;
        this.chucVu = chucVu;
        this.is_deleted = is_deleted;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public boolean getIsDeleted() {
        return is_deleted;
    }

    public void setIsDeleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "soTK=" + soTK + ", userName=" + userName + ", passWord=" + passWord + ", ngayTao=" + ngayTao + ", maNV=" + maNV + ", maCV=" + chucVu + ", is_deleted=" + is_deleted + '}';
    }

}
