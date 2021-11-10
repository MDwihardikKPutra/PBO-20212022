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
public class Keledai extends Binatang_13 implements IHerbivora{
    private String suara,warnaBulu;

    public Keledai(String nama,int jmlKaki,String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Ini adalah hewan "+super.getNama());
        System.out.println("Mempunyai kaki berjumlah "+super.getKaki());
    }

    @Override
    public void displayMakan() {
        System.out.println("Pemakan Tumbuhan");
    }
    
    public void displayData(){
        System.out.println("Punya suara '"+this.suara+"'");
        System.out.println("Memiliki bulu berwarna "+this.warnaBulu);
    }
}