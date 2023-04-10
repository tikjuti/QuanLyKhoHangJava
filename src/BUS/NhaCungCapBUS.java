
package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCap;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class NhaCungCapBUS {
    
    NhaCungCapDAO nhaCungCapDAO = new NhaCungCapDAO();
    private ArrayList<NhaCungCap> listNhaCungCap = null;

    public NhaCungCapBUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listNhaCungCap = nhaCungCapDAO.getListNhaCungCap();
    }

    public ArrayList<NhaCungCap> getListNhaCungCap() {
        if (this.listNhaCungCap == null) {
            docDanhSach();
        }
        return this.listNhaCungCap;
    }

    public boolean themNhaCungCap(String tenNCC, String diaChi, String dienThoai, String email, String status) {
        if (tenNCC.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên nhà cung cấp!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (diaChi.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền địa chỉ!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(dienThoai).matches()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền số điện thoại!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền email!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            boolean statusLoai;
            statusLoai = !status.trim().equals("") || status.trim().equals("Đã xóa") || status.trim().equals("Xóa");
            
            for (NhaCungCap sp : getListNhaCungCap()) {
                String tenSP = sp.getTenNCC().toLowerCase();
                if (tenSP.toLowerCase().trim().equals(tenNCC.toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Nhà cung cấp đã tồn tại!", "", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
            }
            
            NhaCungCap ncc = new NhaCungCap();
            ncc.setTenNCC(tenNCC);
            ncc.setDiaChi(diaChi);
            ncc.setDienThoai(dienThoai);
            ncc.setEmail(email);
            ncc.setIsDeleted(statusLoai);
            boolean flag = nhaCungCapDAO.addNCC(ncc);
            if (flag) {
                JOptionPane.showMessageDialog(null, "Thêm mới thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm mới thất bại!", "", JOptionPane.ERROR_MESSAGE);
            }
            }catch (HeadlessException | NumberFormatException e) {
                
        }
        return false;
    }

    public boolean suaNhaCungCap(String maNCC, String tenNCC, String diaChi, String dienThoai, String email, String status) {
        if (tenNCC.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên nhà cung cấp!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (diaChi.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền địa chỉ!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(dienThoai).matches()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền số điện thoại!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền email!", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int ma = Integer.parseInt(maNCC);
        boolean statusSP;
        statusSP = status.trim().equals("") || status.trim().equals("Đã xóa") || status.trim().equals("Xóa");
        
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNCC(ma);
        ncc.setTenNCC(tenNCC);
        ncc.setDiaChi(diaChi);
        ncc.setDienThoai(dienThoai);
        ncc.setEmail(email);
        ncc.setIsDeleted(statusSP);
        
        boolean flag = nhaCungCapDAO.updateNCC(ncc);

        if (flag) {
            JOptionPane.showMessageDialog(null, "Sửa nhà cung cấp thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Sửa nhà cung cấp thất bại!", "", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
}
