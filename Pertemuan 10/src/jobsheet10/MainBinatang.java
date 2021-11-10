/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author ddiko
 */
public class MainBinatang {

    public static void main(String[] args) {
        System.out.println("BINATANG");
        System.out.println("--------------------------");
        Singa singa = new Singa("Singa", 4, "Rawrrr", "Kuning/Orange");
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
        System.out.println();
        System.out.println("---------------------------");

        Keledai keledai = new Keledai("Keledai", 4, "Meringkik", "coklat");
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        System.out.println();
        System.out.println("---------------------------");

        Gorila gorila = new Gorila("Gorila", 2, "AHRGGGGGG", "Abu abu");
        gorila.displayBinatang();
        gorila.displayMakan();
        gorila.displayData();
        System.out.println("---------------------------");
    }

}
