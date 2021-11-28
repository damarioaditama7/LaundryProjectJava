/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class Koneksi {
    String host ="localhost";
    String port ="3306";
    String database="tokosari";
    String user="root";
    String pass="";
    
    public Connection getKoneksi(){
        Connection result = null;
        try{
            try{
                String jdbcDriver = "com.mysql.jdbc.Driver";
                Class.forName(jdbcDriver);
                System.out.println("Driver Ditemukan");
            }catch(ClassNotFoundException ex){
                System.out.println("Driver Tidak Ditemukan");
                ex.printStackTrace();
            }
            try{
                String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
                result = (Connection)DriverManager.getConnection(url,user,pass);
                System.out.println("Koneksi Berhasil");
            }catch(Exception e){
                System.out.println("Koneksi Gagal");
                System.exit(0);
            }
        }catch(Exception e){
            
        }
        return result;
    }        
}
