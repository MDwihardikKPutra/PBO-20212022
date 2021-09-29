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
public class Village_13 {

    public Friend_13[] arrayFriend;
    private Parent_13 ayah, ibu;
    private Child_13 anak;

    public Village_13(int jumlah, Parent_13 ayah, Parent_13 ibu, Child_13 anak) {
        this.arrayFriend = new Friend_13[jumlah];
        this.ayah = ayah;
        this.ibu = ibu;
        this.anak = anak;
        this.iniFriend();
    }

    public Friend_13[] getArrayFriend() {
        return arrayFriend;
    }

    public void setFriend(String nama) {
        for (int i = 0; i < arrayFriend.length; i++) {
            if (arrayFriend[i].getNama() == null) {
                arrayFriend[i].setNama(nama);
                break;
            }
        }
    }

    private void iniFriend() {
        for (int i = 0; i < arrayFriend.length; i++) {
            this.arrayFriend[i] = new Friend_13();
        }
    }

    public void setChild(Child_13 anak, int umur) {
        Child_13 Child = null;
        this.arrayFriend[umur - 1].setChild(Child);
    }

    public String info() {
        String info = "";
        info += "Ayah   : " + this.ayah.info();
        info += "Ibu    : " + this.ibu.info();
        info += "Anak : " + this.anak.info();
        for (Friend_13 teman : arrayFriend) {
            info += teman.info();
        }
        return info;
    }
    
}
