package BUS;

import DAO.TaiKhoanDAO;
import DTO.TaiKhoan;
import java.util.ArrayList;

public class TaiKhoanBUS implements IsBussAccess<TaiKhoan> {

    private final TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();

    @Override
    public TaiKhoan get(TaiKhoan taiKhoan) {
        return taiKhoanDAO.select(taiKhoan);
    }
    
    @Override
    public ArrayList<TaiKhoan> getAll() {
        return taiKhoanDAO.selectAll();
    }

    @Override
    public boolean add(TaiKhoan taiKhoan) {
        return taiKhoanDAO.insert(taiKhoan);

    }

    @Override
    public boolean edit(TaiKhoan taiKhoan) {
        return taiKhoanDAO.update(taiKhoan);
    }

    @Override
    public boolean remove(TaiKhoan taiKhoan) {
        return taiKhoanDAO.delete(taiKhoan);
    }

    @Override
    public TaiKhoan getNewest() {
        ArrayList<TaiKhoan> list = getAll();
        return list == null ? null : list.get(list.size() - 1);
    }

    public boolean getTKMK(String username, String password) {

        TaiKhoan tk = taiKhoanDAO.selectByTKMK(username, password);

        if (tk == null) {
            return false;
        }
        return true;
    }

//    public boolean addRegister(TaiKhoan taiKhoan) {
//        if (taiKhoan.getMaCV() == 1) {
//            System.out.println("admin");
//        }
//        return taiKhoanDAO.register(taiKhoan);
//    }

}
