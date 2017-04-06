package NestedClasses;

// Serialization : Serilestirme
/*Java bilindi�i �zere nesneye dayal� bir dil. 
 * Neredeyse her �ey nesne. Nesneleri kullan�rken 
 * bir defa de�il istenilen zamanda ve yerde tekrar, 
 * tekrar ve tekrar kullanabilmemiz gerekebiliyor. 
 * Bu noktada ise bizim �serile�tirme� dedi�imiz yap� devreye giriyor.
 * Yukar�daki c�mlede kal�n olarak belirtti�im �istenilen yerde� c�mlesine 
 * dikkatinizi �ekmek istiyorum. De�i�kenlere ait de�erleri bir dosyaya 
 * kaydetdi�inizi d���n�n. Tekrar kullanmak istedi�inizde 
 * bu de�erlerin ne ve hangi tipte oldu�unu bilemeyiz. 
 * Nesnelerimizin i�inde bulunan de�erler ve veri tipleri ile birlikte saklayabiliyoruz. 
 * Bu g�zel y�ntem �Java Serile�tirme� sayesinde olmaktad�r.
 * Nesnelerin i�erisindeki de�i�kenlerin adlar�, tipleri de�eleri byte�lara �evrilerek 
 * kaydedilir ve bu dosyay� nereye g�t�r�rsek g�t�relim JVM bu de�erleri bir kay�p olmadan 
 * okuyup kullanabiliriz. Serile�tirme i�lemi i�in Java�n�n Serializable s�n�f�n� 
 * kullan�yoruz.*/
import java.io.Serializable;

public class Kisi implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ad;
	private String soyad;
		
	public Kisi(){}
	public Kisi(String ad,String soyad)
	{
		this.ad = ad;
		this.soyad = soyad;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String toString()
	{
		return "Ad : "+this.ad+" Soyad : "+this.soyad;
	}
		
}