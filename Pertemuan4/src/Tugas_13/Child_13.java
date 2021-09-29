/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_13;

/**
 *
 * @author ddiko
 */
public class Child_13 {

    public String nama, kelas;
    private Parent_13 Orangtua;

    public Child_13(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public Child_13(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getkelas() {
        return kelas;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public String info() {
        String info = "";
        info += nama + "\n";
        info += this.kelas + "\n";
    
        return info;
    }
}
