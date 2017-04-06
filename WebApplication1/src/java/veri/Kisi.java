/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

/**
 *
 * @author HP
 */
public class Kisi {
    String isim;
    String sifre;

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public Kisi() // Constructor
    {
        System.out.println("Kisi objesi olusturuldu");
    }
    public boolean sifreKontrol()
    {
        DBKatmani dbk = new DBKatmani();
        return dbk.kullanicikontrol(isim, sifre);
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public static void main(String args[])
    {
        Kisi k = new Kisi();
        k.setIsim("Melih");
        k.setSifre("");
        System.out.println(k.sifreKontrol());
    }
    
    
}
