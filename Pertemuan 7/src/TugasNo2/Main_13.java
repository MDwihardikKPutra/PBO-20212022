/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

/**
 *
 * @author ddiko
 */
public class Main_13 {

    public static void main(String[] args) {
        Manusia_13 ptr = new Manusia_13();

        ptr.bernafas();
        ptr.makan();
        System.out.println();

        ptr = new Dosen_13();

        ptr.makan();
        Dosen_13 ptr2 = new Dosen_13();
        ptr2.lembur();
        System.out.println();

        ptr = new Mahasiswa_13();

        ptr.makan();
        Mahasiswa_13 ptr3 = new Mahasiswa_13();
        ptr3.tidur();
    }
}
