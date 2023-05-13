package DAO;

import BUS.SanPhamBUS;
import DTO.SanPham;
import DTO.ThongKe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ThongKeDAO {
    public ThongKe getThongKe(int nam) {
       ThongKe thongKe = new ThongKe();
       int[] tongThuQuy = new int[4];
       thongKe.setSoLuongSP(getTongSoLuongSP());
       thongKe.setSoLuongKH(getSoLuongKhachHang());
       tongThuQuy[0] = getTongThuQuy(nam, 1);
       tongThuQuy[1] = getTongThuQuy(nam, 2);
       tongThuQuy[2] = getTongThuQuy(nam, 3);
       tongThuQuy[3] = getTongThuQuy(nam, 4);
       thongKe.setTongThuQuy(tongThuQuy);
       thongKe.setTopSanPhamBanChay(getTopBanChay());
       return thongKe;
   }
    
    private ArrayList<SanPham> getTopBanChay() {
        try {
            String sql = "SELECT MaSP, DaBan FROM (" +
                    "SELECT MaSP, SUM(SoLuong) AS DaBan FROM " +
                    "cthoadon GROUP BY MaSP" +
                    ") temp " +
                    "ORDER BY DaBan " +
                    "DESC LIMIT 5";
            Statement st = Connect.cnt().createStatement();
            ResultSet rs = st.executeQuery(sql);
            ArrayList<SanPham> dssp = new ArrayList<>();
            SanPhamBUS spBUS = new SanPhamBUS();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt(1));
                sp.setSoLuong(rs.getInt(2));
                sp.setTenSP(spBUS.getTenSP(sp.getMaSP()));
                dssp.add(sp);
            }
            return dssp;
        } catch (SQLException e) {
        }
        return null;
    }
     
    public double getDoanhThuThang(int thang, int nam) {
        try {
            String thangBD = nam + "-" + thang + "-01";
            String thangKT = nam + "-" + (thang + 1) + "-01";
            String sql = "SELECT SUM(TongTien) FROM hoadon WHERE NgayLap BETWEEN CAST(? AS DATE) AND CAST(? AS DATE)";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setString(1, thangBD);
            pre.setString(2, thangKT);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return Double.parseDouble(rs.getInt(1) + "");
            }
        } catch (NumberFormatException | SQLException e) {
        }
        return nam;
    }
    
    public double getSoLuongThang(int thang, int nam) {
        try {
            String thangBD = nam + "-" + thang + "-01";
            String thangKT = nam + "-" + (thang + 1) + "-01";
            String sql = "SELECT SUM(SoLuong) FROM hoadon JOIN cthoadon on hoadon.MaHD=cthoadon.MaHD WHERE NgayLap BETWEEN CAST(? AS DATE) AND CAST(? AS DATE)";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setString(1, thangBD);
            pre.setString(2, thangKT);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return Double.parseDouble(rs.getInt(1) + "");
            }
        } catch (NumberFormatException | SQLException e) {
        }
        return nam;
    }

    private int getTongSoLuongSP() {
      try {
          Statement stmt = Connect.cnt().createStatement();
          ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM sanpham");
          while (rs.next()) {
              return rs.getInt(1);
          }
      } catch (SQLException ex) {
          return -1;
      }
      return 0;
  }
    private int getSoLuongKhachHang() {
        try {
            Statement stmt = Connect.cnt().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM khachhang");
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            return -1;
        }
        return 0;
    }
    private int getTongThuQuy(int nam, int quy) {
        String[] dateString = getDateString(nam, quy);
        try {
            PreparedStatement prep = Connect.cnt().prepareStatement("SELECT SUM(TongTien) FROM hoadon "
                    + "WHERE NgayLap >= ? AND NgayLap < ?");
            prep.setString(1, dateString[0]);
            prep.setString(2, dateString[1]);
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            return -1;
        }
        return 0;
    }
    
    private String[] getDateString(int nam, int quy) {
        int namBatDau = nam;
        int namKetThuc = nam;
        String thangBatDau = "01"; 
        String thangKetThuc = "04";
        String[] kq = new String[2];
        switch (quy) {
            case 1 -> {
                thangBatDau = "01";
                thangKetThuc = "04";
            }
            case 2 -> {
                thangBatDau = "03";
                thangKetThuc = "07";
            }
            case 3 -> {
                thangBatDau = "06";
                thangKetThuc = "10";
            }
            case 4 -> {
                thangBatDau = "09";
                thangKetThuc = "01";
                namKetThuc++;
            }
        }
        String strBatDau = Integer.toString(namBatDau) + thangBatDau + "01";
        String strKetThuc = Integer.toString(namKetThuc) + thangKetThuc + "01";
        kq[0] = strBatDau;
        kq[1] = strKetThuc;
        return kq;
    }

}
