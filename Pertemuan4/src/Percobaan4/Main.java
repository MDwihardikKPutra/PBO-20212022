/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author ddiko
 */
public class Main {

    public static void main(String[] args) {
        Penumpang andi = new Penumpang("99999", "Andi");
        Penumpang budi = new Penumpang("67890", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(andi, 10);
        gerbong.setPenumpang(budi, 10);
        System.out.println(gerbong.info());
    }
}
