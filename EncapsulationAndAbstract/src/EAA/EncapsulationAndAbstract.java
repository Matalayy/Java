

// Abstraction soyutlama
/*
 * Buyuk programlarda arka planda hangi parcalarin calistigi 
 * detayini bilemeyebiliriz. Bunlari bilmek bazen gereksiz olabilir.
 * sadece girdi ve ciktiya odaklanmak daha verimlidir. Ornegin
 * akilli telefonlar bircok fonksiyon calistirir ancak biz ekran ile ilgileniriz.	
 */

// Soyutlama Tipleri
/*
 * Veri Soyutlamasi (Data Abstraction)
 * Fonksiyonel Soyutlama (Functional Abstraction)
 * Nesne Soyutlamasi (Object Abstraction)
 */
 // Bir sinif tanimlanirken soyut bir kavram tanimi yapilmaktadir.

/* * * * * * */

//Access Modifier : Erisim Belirleyici -> public, private , protected , belirtilmeyenler
//Non-Access Modifier : abstract(soyut) -> abstract bir siniftan nesne uretilemez.(instantiation) 
//                      final -> kalitim ile gecirilemez.
//Encapsulation : Metodlarin Dis Dunyaya acik olmasi, uyelerin kapali olmasidir.
package EAA; // bir paketin siniflarina disardan erismek icin :
             // packageAdi.sinifAdi instance = new packageAdi.sinifAdi();
             // seklinde yapilmalidir.
public class EncapsulationAndAbstract {
	public static void main(String[] args)
	{
		secretary Marie = new secretary();
		secretary Marta = new secretary();
		System.out.println(secretary.numberOfSecretary);
		
		Kapsul kapsul = new Kapsul();
		kapsul.setKapsulboyu(5);
		System.out.println(kapsul.getKapsulboyu());
		
	}
}
