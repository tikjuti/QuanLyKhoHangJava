
package DAO;

import DTO.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;


public class NhanVienDAO {
     public ArrayList<NhanVien> getListNhanVien() {
        try {
            ArrayList<NhanVien> dsncc = new ArrayList<>();
            String sql = "SELECT * FROM nhanvien";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                NhanVien ncc = new NhanVien();
                if (!rs.getBoolean(6)){
                    ncc.setMaNV(rs.getInt(1));
                    ncc.setTenNV(rs.getString(2));
                    ncc.setDienThoai(rs.getString(3));
                    ncc.setDiaChi(rs.getString(4));
                    ncc.setEmail(rs.getString(5));
                    dsncc.add(ncc);
                }
            }
            return dsncc;
        } catch (SQLException ex) {
            return null;
        }
    }

    public NhanVien getNhanVien(int maNV) {
        NhanVien ncc = null;
        try {
            String sql = "SELECT * FROM nhanvien WHERE MaNV=" + maNV;
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery(sql);
            while (rs.next()) {
                ncc = new NhanVien();
                if (!rs.getBoolean(6)){
                    ncc.setMaNV(rs.getInt(1));
                    ncc.setTenNV(rs.getString(2));
                    ncc.setDienThoai(rs.getString(3));
                    ncc.setDiaChi(rs.getString(4));
                    ncc.setEmail(rs.getString(5));
                }
            }
        } catch (SQLException ex) {
            return null;
        }
        return ncc;
    }

    public boolean addNV(NhanVien ncc) {
        try {
            String sql = "INSERT INTO nhanvien(TenNV, SDT, DiaChi, Email, IsDeleted) VALUES(?,?,?,?,?)";
            PreparedStatement prep = Connect.cnt().prepareStatement(sql);
            
            prep.setString(1, ncc.getTenNV());
            prep.setString(2, ncc.getDiaChi());
            prep.setString(3, ncc.getDienThoai());
            prep.setString(4, ncc.getEmail());
            prep.setBoolean(5, ncc.getIsDeleted());
            
            prep.execute();
            return true;
        } catch (SQLException ex) {
            
        }
        return false;
    }
    

    public boolean updateNV(NhanVien ncc) {
        try {
            String sql = "UPDATE nhanvien SET TenNV=?, SDT=?, DiaChi=?, Email=?, IsDeleted=? WHERE MaNV=?";
           PreparedStatement prep = Connect.cnt().prepareStatement(sql);
            
            prep.setString(1, ncc.getTenNV());
            prep.setString(2, ncc.getDiaChi());
            prep.setString(3, ncc.getDienThoai());
            prep.setString(4, ncc.getEmail());
            prep.setBoolean(5, ncc.getIsDeleted());
            prep.setInt(6, ncc.getMaNV());
            
            prep.execute();
            return true;
        } catch (SQLException ex) {
            
            
        }
        return false;
    }

    public boolean deleteNV(int maNV) {
        try {
            String sql = "UPDATE nhanvien SET IsDeleted=1 WHERE MaNV=" + maNV;
            Statement st = Connect.cnt().createStatement();
            
            st.execute(sql);
            
            return true;
        } catch (SQLException ex) {
            
        }
        return false;
    }
    
    public boolean xoaAllSanPhamTu() {
        try {
            String sql = "DELETE FROM nhanvien";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
