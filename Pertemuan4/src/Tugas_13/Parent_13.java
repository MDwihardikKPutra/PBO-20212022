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
public class Parent_13 {

    private String nama, jabatan;
    private int Jabatan;

    public Parent_13() {
    }

    public Parent_13(String Nama, int Jabatan) {
        this.nama = Nama;
        this.Jabatan = Jabatan;
    }

    public void Parent_13(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public int getJabatan() {
        return Jabatan;
    }

    public void setJabatan(int Jabatan) {
        this.Jabatan = Jabatan;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
