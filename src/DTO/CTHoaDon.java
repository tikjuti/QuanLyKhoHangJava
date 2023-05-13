
package DTO;

public class CTHoaDon {
    private int MaHD;
    private int IDSP;
    private int SL;
    private float Tongtien;
    private boolean isDeleted;

    public CTHoaDon() {
    }

    public CTHoaDon(int MaHD, int IDSP, int SL, float Tongtien) {
     
        this.MaHD = MaHD;
        this.IDSP = IDSP;
        this.SL = SL;
        this.Tongtien = Tongtien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getIDSP() {
        return IDSP;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }


    public float getTongtien() {
        return Tongtien;
    }

    public void setTongtien(float Tongtien) {
        this.Tongtien = Tongtien;
    }

   public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    
   
}
