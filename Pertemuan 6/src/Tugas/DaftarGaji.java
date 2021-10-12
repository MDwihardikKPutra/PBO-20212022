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
public class DaftarGaji {

    private Pegawai[] ListPegawai;

    public DaftarGaji(int ListPegawai) {
        this.ListPegawai = new Pegawai[ListPegawai];
        this.initListPegawai();
    }

    private void initListPegawai() {
        for (int i = 0; i < this.ListPegawai.length; i++) {
            this.ListPegawai[i] = new Pegawai(null, null, null);
        }
    }

    public void addPegawai(Pegawai ListPegawai) {
        for (int i = 0; i < this.ListPegawai.length; i++) {
            if (this.ListPegawai[i].getNama() == null) {
                this.ListPegawai[i] = ListPegawai;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < this.ListPegawai.length; i++) {
            if (this.ListPegawai[i].getNama() != null) {
                System.out.println("Nama : " + ListPegawai[i].getNama());
                System.out.println("Gaji : " + ListPegawai[i].getGaji());
            }

        }

    }
}
