/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Muhammad Telaga
 */
public class dbConnection {
    private static Connection MYSQLKoneksi;
    public static Connection dbConnection () throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/db_perpus";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLKoneksi = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            System.out.println ("Koneksi ke Database gagal " + e.getMessage());
        }
        
        return MYSQLKoneksi;
     
    }
 }

