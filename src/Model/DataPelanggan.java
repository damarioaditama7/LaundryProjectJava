/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ACER
 */
public class DataPelanggan {
    private String NAMA;
    private String ALAMAT;
    private String TELEPON;
    private String TANGGAL_MASUK;
    private double BERAT_LAUNDRY;
    private String TANGGAL_AMBIL;

    public void TambahPelanggan(DataPelanggan data,Pembayaran pembayaran) throws SQLException{
        Koneksi kon =new Koneksi();
        Connection koneksi = kon.getKoneksi();
        Statement stmt = koneksi.createStatement();
        String query =   "INSERT INTO data_pelanggan SET "
                        +"NAMA = '"+data.getNAMA()+"',"
                        +"ALAMAT = '"+data.getALAMAT()+"',"
                        +"TELEPON = '"+data.getTELEPON()+"',"
                        +"BERAT_LAUNDRY = "+data.getBERAT_LAUNDRY()+" ,"
                        +"TOTAL_BAYAR = '"+pembayaran.getTotal_bayar()+"';";
        
        if(stmt.executeUpdate(query) < 0){
            
        }else{
            
            System.out.println("Berhasil Tambah");
        }
        stmt.close();
        koneksi.close();
    }
    
    public void Pengambilan(DataPelanggan data) throws SQLException{
        Koneksi kon =new Koneksi();
        Connection koneksi = kon.getKoneksi();
        Statement stmt = koneksi.createStatement();
        String query =   "UPDATE data_pelanggan SET "
                        +"TANGGAL_AMBIL = SYSDATE() "
                        +"WHERE NAMA = '"+data.getNAMA()+"';";
        
        if(stmt.executeUpdate(query) < 0){
            
        }else{
            
            System.out.println("Berhasil Tambah");
        }
        stmt.close();
        koneksi.close();
    }
    
    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getALAMAT() {
        return ALAMAT;
    }

    public void setALAMAT(String ALAMAT) {
        this.ALAMAT = ALAMAT;
    }

    public String getTELEPON() {
        return TELEPON;
    }

    public void setTELEPON(String TELEPON) {
        this.TELEPON = TELEPON;
    }

    public String getTANGGAL_MASUK() {
        return TANGGAL_MASUK;
    }

    public void setTANGGAL_MASUK(String TANGGAL_MASUK) {
        this.TANGGAL_MASUK = TANGGAL_MASUK;
    }

    public double getBERAT_LAUNDRY() {
        return BERAT_LAUNDRY;
    }

    public void setBERAT_LAUNDRY(double BERAT_LAUNDRY) {
        this.BERAT_LAUNDRY = BERAT_LAUNDRY;
    }

    public String getTANGGAL_AMBIL() {
        return TANGGAL_AMBIL;
    }

    public void setTANGGAL_AMBIL(String TANGGAL_AMBIL) {
        this.TANGGAL_AMBIL = TANGGAL_AMBIL;
    }
   
    
}
