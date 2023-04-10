
package Test;

import GUI.DlgLoaiSanPhamGUI;
import GUI.KhachHangGUI;
import GUI.SanPhamGUI;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class text {
    public static void main(String[] args) {
        JFrame f = new JFrame("Quản lý kho hàng");
        f.setLayout(new BorderLayout());
// Phần code chạy Form sản phẩm
//        SanPhamGUI n = new SanPhamGUI();
//-----------------------------------------

// Phần code chạy Form khách hàng
        KhachHangGUI n = new KhachHangGUI();
//-----------------------------------------

//        DlgLoaiSanPhamGUI n = new DlgLoaiSanPhamGUI();
//        n.setVisible(true);
// Phần code chạy cái Dialog Loại sản phầm
//        
//------------------------------------------
////        p.add(new JLabel("A Panel"));
        f.add(n, BorderLayout.CENTER);


        f.add(n,BorderLayout.SOUTH);
        
        f.pack();
        f.setVisible(true);
        }
}
