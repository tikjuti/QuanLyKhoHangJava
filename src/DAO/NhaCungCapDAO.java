
package DAO;

import DTO.NhaCungCap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;


public class NhaCungCapDAO {
     public ArrayList<NhaCungCap> getListNhaCungCap() {
        try {
            ArrayList<NhaCungCap> dsncc = new ArrayList<>();
            String sql = "SELECT * FROM nhacungcap";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                NhaCungCap ncc = new NhaCungCap();
                if (!rs.getBoolean(6)){
                    ncc.setMaNCC(rs.getInt(1));
                    ncc.setTenNCC(rs.getString(2));
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

    public NhaCungCap getNhaCungCap(int maNCC) {
        NhaCungCap ncc = null;
        try {
            String sql = "SELECT * FROM nhacungcap WHERE MaNCC=" + maNCC;
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery(sql);
            while (rs.next()) {
                ncc = new NhaCungCap();
                if (!rs.getBoolean(6)){
                    ncc.setMaNCC(rs.getInt(1));
                    ncc.setTenNCC(rs.getString(2));
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

    public boolean addNCC(NhaCungCap ncc) {
        try {
            String sql = "INSERT INTO nhacungcap(TenNCC, SDT, DiaChi, Email, IsDeleted) VALUES(?,?,?,?,?)";
            PreparedStatement prep = Connect.cnt().prepareStatement(sql);
            
            prep.setString(1, ncc.getTenNCC());
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
    

    public boolean updateNCC(NhaCungCap ncc) {
        try {
            String sql = "UPDATE nhacungcap SET TenNCC=?, SDT=?, DiaChi=?, Email=?, IsDeleted=? WHERE MaNCC=?";
           PreparedStatement prep = Connect.cnt().prepareStatement(sql);
            
            prep.setString(1, ncc.getTenNCC());
            prep.setString(2, ncc.getDiaChi());
            prep.setString(3, ncc.getDienThoai());
            prep.setString(4, ncc.getEmail());
            prep.setBoolean(5, ncc.getIsDeleted());
            prep.setInt(6, ncc.getMaNCC());
            
            prep.execute();
            return true;
        } catch (SQLException ex) {
            
            
        }
        return false;
    }

    public boolean deleteNCC(int maNCC) {
        try {
            String sql = "UPDATE nhacungcap SET IsDeleted=1 WHERE MaNCC=" + maNCC;
            Statement st = Connect.cnt().createStatement();
            
            st.execute(sql);
            
            return true;
        } catch (SQLException ex) {
            
        }
        return false;
    }
    
    public boolean xoaAllNhaCungCap() {
        try {
            String sql = "DELETE FROM nhacungcap";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
