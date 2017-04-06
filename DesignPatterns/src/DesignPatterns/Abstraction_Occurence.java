package DesignPatterns;
/*
 * Bir Soyutlama ve onun karsiligi olan olusumu ifade eden modeldir
 * ornek olarak dusunursek
 * 
 * Beklenen                        Gerceklesen
 * Abstraction                     Occurence
 * -----------                     ---------
 * Bir televizyon dizisi   --->>   Dizi Bolumleri
 * ---------------------           --------------
 * Serinin Adi                     Bolum Numarasi
 * Yapimcisi                       Bolum Basligi
 *                                 BolumOzeti
 *                                 
 * Eger Abstraction ve Occurence kullanilmasa veri tekrari yapmak zorunda kalirdik.
 */

import java.util.ArrayList;

class dizi{
	String diziAdi;
	String diziYapimcisi;
	ArrayList<bolum> bolumler = new ArrayList<bolum>();
	
	void bolumEkle(bolum b)
	{
		bolumler.add(b);
	}
}

class bolum{
	String bolumAdi;
	int bolumNumarasi;
	public bolum(String bolumAdi,int bolumNumarasi)
	{
		this.bolumAdi = bolumAdi;
		this.bolumNumarasi = bolumNumarasi;
	}
}
public class Abstraction_Occurence {
	public static void main(String args[])
	{
		dizi Dirilis = new dizi();
		Dirilis.diziAdi = "Dirilis Ertugrul";
		Dirilis.bolumEkle(new bolum("Yeniden Dogus",1));
		Dirilis.bolumEkle(new bolum("Yeniden Kurulus",2));
		
	}
}
