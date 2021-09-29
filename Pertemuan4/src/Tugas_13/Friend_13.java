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
public class Friend_13 {

    private String nama, Tingkatan;
    public Child_13 anak;

    public Friend_13() {
    }

    public Friend_13(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Child_13 getChild() {
        return anak;
    }

    public void setChild(Child_13 child) {
        this.anak = anak;
    }

    public String info() {
        String info = "";
        info += "Nama Teman : " + nama + "\n";
        if (this.anak != null) {
            info += "Nama Anak : " + anak.info() + "\n";
        }
        return info;
    }
}

