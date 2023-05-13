package DAO;

//import DTO.ChucVu;
import DTO.NhanVien;
import DTO.TaiKhoan;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;

public class TaiKhoanDAO {

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;
    private final NhanVien nhanVienDTO = new NhanVien();
//    private final ChucVu chucVuDTO = new ChucVu();

    public static TaiKhoanDAO getTaiKhoan() {
        return new TaiKhoanDAO();
    }

    public boolean insert(TaiKhoan taiKhoan) {

        try {

            String query = "INSERT INTO TAIKHOAN(ID, USERNAME, PASSWORD, NGAYTAO, IDNHANVIEN, CHUCVU, IS_DELETED) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement pst = Connect.cnt().prepareStatement(query);

            pst.setInt(1, taiKhoan.getSoTK());
            pst.setString(2, taiKhoan.getUserName());
            pst.setString(3, taiKhoan.getPassWord());
            pst.setDate(4, new Date(taiKhoan.getNgayTao().getTime()));
            pst.setInt(5, taiKhoan.getMaNV());
            pst.setString(6, taiKhoan.getChucVu());
            pst.setBoolean(7, false);

            pst.execute();
            return true;

        } catch (SQLException e) {
            
        }
        return false;
    }

    public boolean delete(TaiKhoan taiKhoan) {

        Connection con = null;
        int result = 0;

        try {

            con = Connect.cnt();

            String query = "DELETE FROM TAIKHOAN WHERE ID = ? AND IS_DELETED = 0";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, taiKhoan.getSoTK());

            result = pst.executeUpdate();

            return result > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            ConnectManager.closeConnection(con);

        }
        return false;
    }

    public boolean update(TaiKhoan taiKhoan) {

        Connection con = null;
        int result = 0;

        try {

            con = Connect.cnt();

            String query = "UPDATE TAIKHOAN SET USERNAME = ?, PASSWORD = ?, NGAYTAO = ?, IDNHANVIEN = ?, CHUCVU = ?, IS_DELETED = ? WHERE ID = ?";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, taiKhoan.getUserName());
            pst.setString(2, taiKhoan.getPassWord());
            pst.setDate(3, new Date(taiKhoan.getNgayTao().getTime()));
            pst.setInt(4, taiKhoan.getMaNV());
            pst.setString(5, taiKhoan.getChucVu());
            pst.setBoolean(6, false);
            pst.setInt(7, taiKhoan.getSoTK());

            result = pst.executeUpdate();

            return result > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("can't update!");
        } finally {
//            ConnectManager.closeConnection(con);
        }
        return false;
    }

    public TaiKhoan select(TaiKhoan taiKhoan) {

        TaiKhoan result = null;
        Connection con = null;

        try {

            con = Connect.cnt();

            String query = "SELECT * FROM TAIKHOAN WHERE ID = ? AND IS_DELETED = 0";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, taiKhoan.getSoTK());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                int ID = rs.getInt("ID");
                String USERNAME = rs.getString("USERNAME");
                String PASSWORD = rs.getString("PASSWORD");
                Date NGAYTAO = rs.getDate("NGAYTAO");
                int IDNHANVIEN = rs.getInt("IDNHANVIEN");
                String CHUCVU = rs.getString("CHUCVU");
                boolean IS_DELETED = rs.getBoolean("IS_DELETED");

                result = new TaiKhoan(ID, USERNAME, PASSWORD, NGAYTAO, IDNHANVIEN, CHUCVU, IS_DELETED);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            ConnectManager.closeConnection(con);
        }
        return result;
    }

    public ArrayList<TaiKhoan> selectAll() {

        ArrayList<TaiKhoan> taiKhoanList = new ArrayList<TaiKhoan>();
        Connection con = null;

        try {

            con = Connect.cnt();

            String query = "SELECT * FROM TAIKHOAN WHERE IS_DELETED = 0";

            PreparedStatement pst = con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                int ID = rs.getInt("ID");
                String USERNAME = rs.getString("USERNAME");
                String PASSWORD = rs.getString("PASSWORD");
                Date NGAYTAO = rs.getDate("NGAYTAO");
                int IDNHANVIEN = rs.getInt("IDNHANVIEN");
                String CHUCVU = rs.getString("CHUCVU");
                boolean IS_DELETED = rs.getBoolean("IS_DELETED");

                TaiKhoan taiKhoan = new TaiKhoan(ID, USERNAME, PASSWORD, NGAYTAO, IDNHANVIEN, CHUCVU,
                        IS_DELETED);

                taiKhoanList.add(taiKhoan);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            ConnectManager.closeConnection(con);
        }
        return taiKhoanList;
    }

    public TaiKhoan selectByTKMK(String username, String password) {

        TaiKhoan taiKhoanDTO;
        Connection con = null;

        try {

            con = Connect.cnt();

            String query = "SELECT * FROM TAIKHOAN WHERE USERNAME = ? AND PASSWORD = ? AND IS_DELETED = 0";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                taiKhoanDTO = new TaiKhoan();

                taiKhoanDTO.setSoTK(rs.getInt("ID"));
                taiKhoanDTO.setUserName(username);
                taiKhoanDTO.setPassWord(password);
                taiKhoanDTO.setNgayTao(rs.getDate("NGAYTAO"));
                taiKhoanDTO.setMaNV(rs.getInt("IDNHANVIEN"));
                taiKhoanDTO.setChucVu(rs.getString("CHUCVU"));
                taiKhoanDTO.setIsDeleted(rs.getBoolean("IS_DELETED"));

                return taiKhoanDTO;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return null;
    }

    public boolean register(TaiKhoan taiKhoan) {

        Connection con = null;
        int result = 0;

        try {

            con = Connect.cnt();

            String query = "INSERT INTO TAIKHOAN(USERNAME, PASSWORD, IS_DELETED) VALUES(?,?,?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, taiKhoan.getUserName());
            pst.setString(2, taiKhoan.getPassWord());
            pst.setBoolean(3, false);

            result = pst.executeUpdate();

            return result > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            ConnectManager.closeConnection(con);
        }
        return false;
    }

    public boolean checkLogin(String username, String password, String userType) {
        String query = "SELECT * FROM TAIKHOAN WHERE USERNAME='"
                + username
                + "' AND PASSWORD='"
                + password
                + "' AND CHUCVU='"
                + userType
                + "' LIMIT 1";

        try {
            PreparedStatement pst = Connect.cnt().prepareStatement(query);
            resultSet = pst.executeQuery(query);
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }
    
    public TaiKhoan getTaiKhoan(TaiKhoan tk) {
        try {
            String sql = "SELECT * FROM taikhoan WHERE USERNAME=? AND PASSWORD=? AND IS_DELETED=0";
            PreparedStatement pre = Connect.cnt().prepareStatement(sql);
            pre.setString(1, tk.getUserName());
            pre.setString(2, tk.getPassWord());
            ResultSet rs = pre.executeQuery();
            TaiKhoan tkLogin = null;
            if (rs.next()) {
                tkLogin = tk;
                tkLogin.setMaNV(rs.getInt("IDNHANVIEN"));
                tkLogin.setChucVu(rs.getString("CHUCVU"));
            }
            return tkLogin;
        } catch (SQLException e) {
        }
        return tk;
    }

}
