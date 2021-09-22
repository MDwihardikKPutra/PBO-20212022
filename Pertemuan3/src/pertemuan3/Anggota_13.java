/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author ddiko
 */
public class Anggota_13 {

    private String nomorKTP, nama;
    private int limitPinjaman, jumlahPinjaman;

    public Anggota_13(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPeminjaman(int limitPeminjaman) {
        this.limitPinjaman = limitPeminjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(int jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    public int pinjam(int jumlahPinjam) {
        jumlahPinjaman += jumlahPinjam;
        if (jumlahPinjaman > getLimitPinjaman()) {
            System.out.println("Peminjaman Melebihi Batas");
            jumlahPinjaman -= jumlahPinjam;
        }
        return jumlahPinjaman;
    }

    public int angsur(int jumlahAngsur) {
        jumlahPinjaman -= jumlahAngsur;
        if (jumlahAngsur < (0.1 * jumlahPinjaman)) {
            System.out.println("angsuran harus 10% dari jumlah pinjaman");
            jumlahPinjaman += jumlahAngsur;
            
        }
        return jumlahPinjaman;

    }
}