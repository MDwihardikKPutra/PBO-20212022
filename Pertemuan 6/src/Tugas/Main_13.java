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
public class Main_13 {

    public static void main(String[] args) {
        Pegawai putra = new Pegawai("23", "Dwihardik", "Kediri");
        Dosen Putraa = new Dosen("13", "Putra", "Malang");
        Putraa.setSKS(10);
        DaftarGaji gaji = new DaftarGaji(2);
        gaji.addPegawai(putra);
        gaji.addPegawai(Putraa);
        gaji.printSemuaGaji();

    }

}
