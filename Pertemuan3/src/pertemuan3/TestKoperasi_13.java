/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author ddiko
 */
public class TestKoperasi_13 {

    public static void main(String[] args) {
        Scanner Putra = new Scanner(System.in);
        Anggota_13 donny = new Anggota_13("111333444", "Donny", 500000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        System.out.print("Masukkan Jumlah Pinjaman : ");
        donny.pinjam(Putra.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        System.out.print("Masukkan Jumlah Pinjaman : ");
        donny.pinjam(Putra.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        System.out.print("Masukkan Jumlah Angsuran : ");
        donny.angsur(Putra.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        System.out.print("Masukkan Jumlah Angsuran : ");
        donny.angsur(Putra.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
