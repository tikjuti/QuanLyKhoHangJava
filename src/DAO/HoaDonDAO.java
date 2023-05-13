
package DAO;

import DTO.CTHoaDon;
import DTO.CTPhieuNhap;
import DTO.HoaDon;
import DTO.NhapHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;



public class HoaDonDAO {
    public ArrayList<HoaDon> getListPhieuNhap() {
        try {
            String sql = "SELECT * FROM hoadon ";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<HoaDon> dssp = new ArrayList<>();
            while (rs.next()) {
                HoaDon sp = new HoaDon();
                if (!rs.getBoolean(7)){
                sp.setMaHD(rs.getInt(1));
                sp.setMaNV(rs.getInt(2));
                sp.setMaKH(rs.getInt(3));
                sp.setNgayDate(rs.getDate(4));
                sp.setTongTien(rs.getFloat(5));
                sp.setIsDeleted(rs.getBoolean(7));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    public ArrayList<CTHoaDon> getListCTPhieuNhap(int ma) {
        try {
            String sql = "SELECT * FROM cthoadon where MaHD=?";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            ArrayList<CTHoaDon> dssp = new ArrayList<>();
            while (rs.next()) {
                CTHoaDon sp = new CTHoaDon();
                if (!rs.getBoolean(5)){
                sp.setIDSP(rs.getInt(1));
                sp.setMaHD(rs.getInt(2));
                sp.setSL(rs.getInt(3));
                sp.setTongtien(rs.getFloat(4));
                sp.setIsDeleted(rs.getBoolean(5));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    
    public ArrayList<CTHoaDon> getListCTPhieuNhap(int ma, int masp) {
        try {
            String sql = "SELECT * FROM cthoadon where MaHD=? AND MaSP=?";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, ma);
            pre.setInt(2, masp);
            ResultSet rs = pre.executeQuery();
            ArrayList<CTHoaDon> dssp = new ArrayList<>();
            while (rs.next()) {
                CTHoaDon sp = new CTHoaDon();
                if (!rs.getBoolean(5)){
                sp.setIDSP(rs.getInt(1));
                sp.setMaHD(rs.getInt(2));
                sp.setSL(rs.getInt(3));
                sp.setTongtien(rs.getFloat(4));
                sp.setIsDeleted(rs.getBoolean(5));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    public ArrayList<CTHoaDon> getListCTPhieuNhap() {
        try {
            String sql = "SELECT * FROM cthoadon";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<CTHoaDon> dssp = new ArrayList<>();
            while (rs.next()) {
                CTHoaDon sp = new CTHoaDon();
                if (!rs.getBoolean(5)){
                sp.setIDSP(rs.getInt(1));
                sp.setMaHD(rs.getInt(2));
                sp.setSL(rs.getInt(3));
                sp.setTongtien(rs.getFloat(4));
                sp.setIsDeleted(rs.getBoolean(5));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    public HoaDon getPhieuNhap(int ma) {
        try {
            String sql = "SELECT *FROM hoadon WHERE MaHD=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                HoaDon sp = new HoaDon();

                sp.setMaNV(rs.getInt(1));
                sp.setMaKH(rs.getInt(2));
                sp.setNgayDate(rs.getDate(3));
                sp.setTongTien(rs.getFloat(4));
                
                return sp;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    
    public boolean xoaPhieuNhap(int maPN) {
        try {
            String sql = "UPDATE hoadon SET IsDeleted=1 WHERE MaHD=" + maPN;
            Statement st = Connect.cnt().createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean xoaCTPhieuNhap(int maPN, int maSP) {
        try {
            String sql = "UPDATE cthoadon SET IsDeleted=1 WHERE MaHD=? AND MaSP=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, maPN);
            pre.setInt(2, maSP);
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaPhieuNhap(HoaDon sp){
        try {
            String sql = "UPDATE hoadon SET MaNV=?, MaKH=?, TongTien=?, IsDeleted=? WHERE MaHD=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getMaNV());
            pre.setInt(2, sp.getMaKH());
            pre.setFloat(3, sp.getTongTien());
            pre.setBoolean(4, sp.getIsDeleted());
            pre.setInt(5, sp.getMaHD());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    public boolean suaCTPhieuNhap(CTHoaDon sp){
        try {
            String sql = "UPDATE cthoadon SET SoLuong=?, TongTien=?, IsDeleted=? WHERE MaHD=? AND MaSP=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getSL());
            pre.setFloat(2, sp.getTongtien());
            pre.setBoolean(3, sp.getIsDeleted());
            pre.setInt(4, sp.getMaHD());
            pre.setInt(5, sp.getIDSP());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
