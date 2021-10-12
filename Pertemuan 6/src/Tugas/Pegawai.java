/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ddiko
 */
public class Pegawai {
    String NIP;
    String Nama;
    String Alamat;

    public Pegawai(String NIP, String Nama, String Alamat) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public int getGaji(){
        return 20000000;
    }
    
    
}
