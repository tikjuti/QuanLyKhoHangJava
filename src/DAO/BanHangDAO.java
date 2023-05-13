
package DAO;

import DTO.CTHoaDon;
import DTO.HoaDon;
import DTO.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class BanHangDAO {
    
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
    
    public boolean themPhieuNhap(HoaDon sp) {
        try {
            String sql;
            sql = "INSERT INTO hoadon(MaNV, MaKH, NgayLap, TongTien, TinhTrang, IsDeleted) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getMaNV());
            pre.setInt(2, sp.getMaKH());
            pre.setTimestamp(3, new java.sql.Timestamp(new java.util.Date().getTime()));
            pre.setFloat(4, sp.getTongTien());
            pre.setBoolean(5, true);
            pre.setBoolean(6, sp.getIsDeleted());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    public boolean themCTPhieuNhap(CTHoaDon sp) {
        try {
            String sql;
            sql = "INSERT INTO cthoadon(MaSP, MaHD, SoLuong, TongTien, IsDeleted) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getIDSP());
            pre.setInt(2, sp.getMaHD());
            pre.setInt(3, sp.getSL());
            pre.setFloat(4, sp.getTongtien());
            pre.setBoolean(5, sp.getIsDeleted());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public int getLastID() {
        try {
            String sql = "SELECT MAX(MaHD) FROM hoadon";
            Statement st = Connect.cnt().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
                return rs.getInt(1);
        } catch (SQLException e) {
        }
        return -1;
    }
}
