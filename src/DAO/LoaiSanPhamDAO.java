
package DAO;

import DTO.LoaiSanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class LoaiSanPhamDAO {
    
     public ArrayList<LoaiSanPham> getDanhSachLoai() {
        try {
            String sql = "SELECT * FROM loaisanpham";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<LoaiSanPham> dsl = new ArrayList<>();
            while (rs.next()) {
                LoaiSanPham loai = new LoaiSanPham();
                if (!rs.getBoolean(3)){
                loai.setMaLoai(rs.getInt(1));
                loai.setTenLoai(rs.getString(2));
                loai.setIsDeleted(rs.getBoolean(3));
                dsl.add(loai);
                }
            }
            return dsl;
        } catch (SQLException e) {
        }
        return null;
    }

    public boolean themLoai(LoaiSanPham loai) {
        try {
            String sql = "INSERT INTO loaisanpham(TenLoai, IsDeleted) VALUES (?, ?)";
               
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setString(1, loai.getTenLoai());
            pre.setBoolean(2, loai.getIsDeleted());
            
            pre.execute();
            return true;
        } catch (SQLException ex) {
        }

        return false;
    }

    public boolean xoaLoai(int maLoai) {
        try {
            String sql = "UPDATE loaisanpham SET IsDeleted=1 WHERE MaLoai=" + maLoai;
            Statement st = Connect.cnt().createStatement();
            
            st.execute(sql);
            
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaLoai(LoaiSanPham loai) {
        try {
            String sql = "UPDATE loaisanpham SET TenLoai=?, IsDeleted=? WHERE MaLoai=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setString(1, loai.getTenLoai());
            pre.setBoolean(2, loai.getIsDeleted());
            pre.setInt(3, loai.getMaLoai());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean xoaAllSanPhamTu() {
        try {
            String sql = "DELETE FROM loaisanpham";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
