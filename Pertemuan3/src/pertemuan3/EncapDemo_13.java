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
public class EncapDemo_13 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            age = newAge;
            System.out.println("Belum cukup umur");
        } else if (newAge < 18) {
            age = newAge;
            System.out.println("Masih di Bawah Umur");
        } else {
            age = newAge;
        }
    }
}
