
package DAO;

import DTO.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;



public class SanPhamDAO {
    public ArrayList<SanPham> getListSanPham() {
        try {
            String sql = "SELECT * FROM sanpham ";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham();
                if (!rs.getBoolean(6)){
                sp.setMaSP(rs.getInt(1));
                sp.setMaLoai(rs.getInt(2));
                sp.setTenSP(rs.getString(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setGiaSP(rs.getFloat(5));
                sp.setIsDeleted(rs.getBoolean(6));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    public SanPham getSanPham(int ma) {
        try {
            String sql = "SELECT *FROM SanPham WHERE MaSP=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setMaLoai(rs.getInt(2));
                sp.setTenSP(rs.getString(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setGiaSP(rs.getFloat(5));

                return sp;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<SanPham> getSanPhamTheoLoai(int maLoai) {
        try {
            String sql = "SELECT * FROM sanpham WHERE MaLoai=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, maLoai);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setMaLoai(rs.getInt(2));
                sp.setTenSP(rs.getString(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setGiaSP(rs.getFloat(5));

                dssp.add(sp);
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }

    public void capNhatSoLuongSP(int ma, int soLuongMat) {
        SanPham sp = getSanPham(ma);
        int soLuong = sp.getSoLuong();
        sp.setSoLuong(soLuong + soLuongMat);
        try {
            String sql = "UPDATE SanPham SET SoLuong=? WHERE MaSP=" + ma;
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getSoLuong());
            pre.executeUpdate();
        } catch (SQLException e) {
        }

    }
    
    public boolean xoaAllSanPhamTu() {
        try {
            String sql = "DELETE FROM sanpham";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    public boolean nhapSanPhamTuExcel(SanPham sp) {
        try {
            String sql = "INSERT INTO sanpham(MaLoai, TenSP, SoLuong, GiaSP, IsDeleted) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getMaLoai());
            pre.setString(2, sp.getTenSP());
            pre.setInt(3, sp.getSoLuong());
            pre.setFloat(4, sp.getGiaSP());
            pre.setBoolean(5, sp.getIsDeleted());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    
    public boolean themSanPham(SanPham sp) {
        try {
            String sql;
            sql = "INSERT INTO sanpham(MaLoai, TenSP, SoLuong, GiaSP, IsDeleted) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getMaLoai());
            pre.setString(2, sp.getTenSP());
            pre.setInt(3, sp.getSoLuong());
            pre.setFloat(4, sp.getGiaSP());
            pre.setBoolean(5, sp.getIsDeleted());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean xoaSanPham(int maSP) {
        try {
            String sql = "UPDATE sanpham SET IsDeleted=1 WHERE MaSP=" + maSP;
            Statement st = Connect.cnt().createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaSanPham(SanPham sp) {
        try {
            String sql = "UPDATE sanpham SET MaLoai=?, TenSP=?, SoLuong=?, GiaSP=?, IsDeleted=? WHERE MaSP=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getMaLoai());
            pre.setString(2, sp.getTenSP());
            pre.setInt(3, sp.getSoLuong());
            pre.setFloat(4, sp.getGiaSP());
            pre.setBoolean(5, sp.getIsDeleted());
            pre.setInt(6, sp.getMaSP());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public static int getIDSP(String tensp){
        int id;
      
//        ResultSet rs = dalSanPham.GetMaSP(tensp);
        try {
              String sql = "Select MaSP from sanpham where TenSP='"+tensp+"'";
              PreparedStatement pre = Connect.cnt().prepareStatement(sql);
              ResultSet rs = pre.executeQuery();
            if(rs.next()){
                id=rs.getInt("MaSP");
                
                return id;
            }
        } catch (SQLException e) {
            
        }
        return 0;
    }
    
    public static SanPham getSanPham2(String ma) {
        try {
            String sql = "SELECT *FROM sanpham WHERE MaSP=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setString(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setMaLoai(rs.getInt(2));
                sp.setTenSP(rs.getString(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setGiaSP(rs.getFloat(5));
                sp.setIsDeleted(rs.getBoolean(6));

                return sp;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
