package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    private static String servername = "localhost:3306";
    private static String dbname = "quanlykhohang";
    private static String username = "root";
    private static String password = "";


    public static Connection cnt() {
        Connection conn = null;
        String url = "jdbc:mysql://" + servername + "/" + dbname + "?useUnicode=true&characterEncoding=utf-8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
