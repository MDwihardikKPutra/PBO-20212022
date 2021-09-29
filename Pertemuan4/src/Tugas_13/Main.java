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
public class Main {

    public static void main(String[] args) {

        Parent_13 ayah = new Parent_13("Minato", 30);
        Parent_13 ibu = new Parent_13("Khusina", 27);
        Child_13 anak = new Child_13("Naruto");
        Village_13 s = new Village_13(3, ayah, ibu, anak);
        s.setChild(anak, 3);
        s.setFriend("Sasuke");
        s.setFriend("Sakura");
        s.setFriend("Kakashi");
        System.out.println(s.info());

    }
}
