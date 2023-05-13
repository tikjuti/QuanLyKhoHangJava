
package DAO;

import DTO.CTPhieuNhap;
import DTO.NhapHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;



public class PhieuNhapDAO {
    public ArrayList<NhapHang> getListPhieuNhap() {
        try {
            String sql = "SELECT * FROM phieunhap ";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<NhapHang> dssp = new ArrayList<>();
            while (rs.next()) {
                NhapHang sp = new NhapHang();
                if (!rs.getBoolean(6)){
                sp.setMaPN(rs.getInt(1));
                sp.setMaNCC(rs.getInt(2));
                sp.setMaNV(rs.getInt(3));
                sp.setNgayLap(rs.getDate(4));
                sp.setTongTien(rs.getFloat(5));
                sp.setIsDeleted(rs.getBoolean(6));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    public ArrayList<CTPhieuNhap> getListCTPhieuNhap(int ma) {
        try {
            String sql = "SELECT * FROM ctphieunhap where MaPN=?";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            ArrayList<CTPhieuNhap> dssp = new ArrayList<>();
            while (rs.next()) {
                CTPhieuNhap sp = new CTPhieuNhap();
                if (!rs.getBoolean(5)){
                sp.setMaPN(rs.getInt(1));
                sp.setMaSP(rs.getInt(2));
                sp.setSoLuong(rs.getInt(3));
                sp.setThanhTien(rs.getFloat(4));
                sp.setIsDeleted(rs.getBoolean(5));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    
    public ArrayList<CTPhieuNhap> getListCTPhieuNhap(int ma, int masp) {
        try {
            String sql = "SELECT * FROM ctphieunhap where MaPN=? AND MaSP=?";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, ma);
            pre.setInt(2, masp);
            ResultSet rs = pre.executeQuery();
            ArrayList<CTPhieuNhap> dssp = new ArrayList<>();
            while (rs.next()) {
                CTPhieuNhap sp = new CTPhieuNhap();
                if (!rs.getBoolean(5)){
                sp.setMaPN(rs.getInt(1));
                sp.setMaSP(rs.getInt(2));
                sp.setSoLuong(rs.getInt(3));
                sp.setThanhTien(rs.getFloat(4));
                sp.setIsDeleted(rs.getBoolean(5));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    public ArrayList<CTPhieuNhap> getListCTPhieuNhap() {
        try {
            String sql = "SELECT * FROM ctphieunhap";

            PreparedStatement pre;
            pre = Connect.cnt().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<CTPhieuNhap> dssp = new ArrayList<>();
            while (rs.next()) {
                CTPhieuNhap sp = new CTPhieuNhap();
                if (!rs.getBoolean(5)){
                sp.setMaPN(rs.getInt(1));
                sp.setMaSP(rs.getInt(2));
                sp.setSoLuong(rs.getInt(3));
                sp.setThanhTien(rs.getFloat(4));
                sp.setIsDeleted(rs.getBoolean(5));
                dssp.add(sp);
                }
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }
    public NhapHang getPhieuNhap(int ma) {
        try {
            String sql = "SELECT *FROM phieunhap WHERE MaPN=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                NhapHang sp = new NhapHang();

                sp.setMaPN(rs.getInt(1));
                sp.setMaNCC(rs.getInt(2));
                sp.setMaNV(rs.getInt(3));
                sp.setNgayLap(rs.getDate(4));
                sp.setTongTien(rs.getFloat(5));
                
                return sp;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    
    public boolean xoaPhieuNhap(int maPN) {
        try {
            String sql = "UPDATE phieunhap SET IsDeleted=1 WHERE MaPN=" + maPN;
            Statement st = Connect.cnt().createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    
    public boolean xoaCTPhieuNhap(int maPN, int maSP) {
        try {
            String sql = "UPDATE ctphieunhap SET IsDeleted=1 WHERE MaPN=? AND MaSP=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, maPN);
            pre.setInt(2, maSP);
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaPhieuNhap(NhapHang sp){
        try {
            String sql = "UPDATE phieunhap SET MaNCC=?, MaNV=?, TongTien=?, IsDeleted=? WHERE MaPN=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getMaNCC());
            pre.setInt(2, sp.getMaNV());
            pre.setFloat(3, sp.getTongTien());
            pre.setBoolean(4, sp.getIsDeleted());
            pre.setInt(5, sp.getMaPN());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
    public boolean suaCTPhieuNhap(CTPhieuNhap sp){
        try {
            String sql = "UPDATE ctphieunhap SET SoLuong=?, TongTien=?, IsDeleted=? WHERE MaPN=? AND MaSP=?";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setInt(1, sp.getSoLuong());
            pre.setFloat(2, sp.getThanhTien());
            pre.setBoolean(3, sp.getIsDeleted());
            pre.setInt(4, sp.getMaPN());
            pre.setInt(5, sp.getMaSP());
            
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
