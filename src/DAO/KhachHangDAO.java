
package DAO;

import DTO.KhachHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;


public class KhachHangDAO {
     public ArrayList<KhachHang> getListKhachHang() {
        try {
            ArrayList<KhachHang> dsncc = new ArrayList<>();
            String sql = "SELECT * FROM khachhang";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                KhachHang ncc = new KhachHang();
                if (!rs.getBoolean(7)){
                    ncc.setMaKH(rs.getInt(1));
                    ncc.setTenKH(rs.getString(2));
                    ncc.setGioiTinh(rs.getBoolean(3));
                    ncc.setDiaChi(rs.getString(4));
                    ncc.setDienThoai(rs.getString(5));
                    ncc.setEmail(rs.getString(6));
                    dsncc.add(ncc);
                }
            }
            return dsncc;
        } catch (SQLException ex) {
            return null;
        }
    }

    public KhachHang getKhachHang(int maKH) {
        KhachHang ncc = null;
        try {
            String sql = "SELECT * FROM khachhang WHERE MaKH=" + maKH;
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery(sql);
            while (rs.next()) {
                ncc = new KhachHang();
                if (!rs.getBoolean(6)){
                    ncc.setMaKH(rs.getInt(1));
                    ncc.setTenKH(rs.getString(2));
                    ncc.setGioiTinh(rs.getBoolean(3));
                    ncc.setDiaChi(rs.getString(4));
                    ncc.setDienThoai(rs.getString(5));
                    ncc.setEmail(rs.getString(6));
                }
            }
        } catch (SQLException ex) {
            return null;
        }
        return ncc;
    }

    public boolean addKH(KhachHang ncc) {
        try {
            String sql = "INSERT INTO khachhang(TenKH, GioiTinh, DiaChi, DienThoai, Email, IsDeleted) VALUES(?,?,?,?,?,?)";
            PreparedStatement prep = Connect.cnt().prepareStatement(sql);
            
            prep.setString(1, ncc.getTenKH());
            prep.setBoolean(2, ncc.getGioiTinh());
            prep.setString(3, ncc.getDiaChi());
            prep.setString(4, ncc.getDienThoai());
            prep.setString(5, ncc.getEmail());
            prep.setBoolean(6, ncc.getIsDeleted());
            
            prep.execute();
            return true;
        } catch (SQLException ex) {
            
        }
        return false;
    }
    

    public boolean updateKH(KhachHang ncc) {
        try {
            String sql = "UPDATE khachhang SET TenKH=?, GioiTinh=?,  DiaChi=?, DienThoai=?, Email=?, IsDeleted=? WHERE MaKH=?";
           PreparedStatement prep = Connect.cnt().prepareStatement(sql);
            
            prep.setString(1, ncc.getTenKH());
            prep.setBoolean(2, ncc.getGioiTinh());
            prep.setString(3, ncc.getDiaChi());
            prep.setString(4, ncc.getDienThoai());
            prep.setString(5, ncc.getEmail());
            prep.setBoolean(6, ncc.getIsDeleted());
            prep.setInt(7, ncc.getMaKH());
            
            prep.execute();
            return true;
        } catch (SQLException ex) {
            
            
        }
        return false;
    }

    public boolean deleteKH(int maKH) {
        try {
            String sql = "UPDATE khachhang SET IsDeleted=1 WHERE MaKH=" + maKH;
            Statement st = Connect.cnt().createStatement();
            
            st.execute(sql);
            
            return true;
        } catch (SQLException ex) {
            
        }
        return false;
    }
}
