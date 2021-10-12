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
public class Dosen extends Pegawai {

    private int jumlahSKS;
    private int TarifSKS = 50000;
    
    

    public Dosen(String NIP, String Nama, String Alamat) {
        super(NIP, Nama, Alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;

    }

    @Override
    public int getGaji() {
        int BiayaSKS = jumlahSKS*TarifSKS;

        return super.getGaji()+ BiayaSKS;
    }
   

}
