/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.app.setting;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private static String DB = "jdbc:mysql://localhost/penjualan_app";
    
    //function untuk konek ke database
    
    public static Connection getKoneksi(){
        Connection conn = null;
        MysqlDataSource data = new MysqlDataSource();
        data.setUser("root");
        data.setPassword("");
        data.setUrl(DB);
        try {
            conn = data.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
