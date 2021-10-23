/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 *
 * @author ddiko
 */
public class Main_13 {

    public static void main(String[] args) {
        Segitiga_13 putra = new Segitiga_13();
        System.out.println("Total Sudut 1 = " + putra.totalSudut(130));
        System.out.println("Total Sudut 2 = " + putra.totalSudut(60, 30));
        System.out.println("Keliling Segitiga 1 = " + putra.keliling(5, 5, 4));
        System.out.println("Keliling Segitiga 2 = " + putra.keliling(12, 5));
    }
}
