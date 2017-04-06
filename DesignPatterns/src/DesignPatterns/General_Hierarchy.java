package DesignPatterns;

import java.util.ArrayList;

class calisan{
	calisan yonetici;
	String isim;
	
	public calisan(){}
	public calisan(String isim)
	{
		this.isim = isim;
	}
	
}
// bu iliskiye alt ust iliskisi denir.
// supervises and subordinate
class yonetici extends calisan{
	ArrayList<calisan> altCalisanlar = new ArrayList<calisan>();
	public yonetici(String isim)
	{
		super(isim);
	}
	
	void calisanEkle(calisan clsn)
	{
		altCalisanlar.add(clsn);
		clsn.yonetici = this;
	}
}

//General Hierarchy Pattern
public class General_Hierarchy {
	public static void main(String args[])
	{
		yonetici melih = new yonetici("Melih");
		calisan ali = new calisan("Ali");
		calisan veli = new calisan("Veli");
		
		melih.calisanEkle(ali);
		melih.calisanEkle(veli);
		
		System.out.println("Ali nin yoneticisi : "+ ali.yonetici.isim);
		System.out.println("Veli nin yoneticisi : "+ veli.yonetici.isim);
		System.out.print("Melih in calisanlari : "+ melih.altCalisanlar.get(0).isim);
		System.out.println(" ve "+ melih.altCalisanlar.get(1).isim);
		System.out.println("Melih in calisan sayisi : "+ melih.altCalisanlar.size());
		
	}

}
