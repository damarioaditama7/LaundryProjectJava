/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ACER
 */
public class Pembayaran {
    private final double reguler = 9000;
    private final double express = 12000;
    private double total_bayar;
    
    public double getReguler() {
        return reguler;
    }

    public double getExpress() {
        return express;
    }

    public double getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(double total_bayar) {
        this.total_bayar = total_bayar;
    }
    
    
}
