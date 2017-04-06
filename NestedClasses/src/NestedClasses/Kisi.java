package NestedClasses;

// Serialization : Serilestirme
/*Java bilindiði üzere nesneye dayalý bir dil. 
 * Neredeyse her þey nesne. Nesneleri kullanýrken 
 * bir defa deðil istenilen zamanda ve yerde tekrar, 
 * tekrar ve tekrar kullanabilmemiz gerekebiliyor. 
 * Bu noktada ise bizim “serileþtirme” dediðimiz yapý devreye giriyor.
 * Yukarýdaki cümlede kalýn olarak belirttiðim “istenilen yerde” cümlesine 
 * dikkatinizi çekmek istiyorum. Deðiþkenlere ait deðerleri bir dosyaya 
 * kaydetdiðinizi düþünün. Tekrar kullanmak istediðinizde 
 * bu deðerlerin ne ve hangi tipte olduðunu bilemeyiz. 
 * Nesnelerimizin içinde bulunan deðerler ve veri tipleri ile birlikte saklayabiliyoruz. 
 * Bu güzel yöntem “Java Serileþtirme” sayesinde olmaktadýr.
 * Nesnelerin içerisindeki deðiþkenlerin adlarý, tipleri deðeleri byte’lara çevrilerek 
 * kaydedilir ve bu dosyayý nereye götürürsek götürelim JVM bu deðerleri bir kayýp olmadan 
 * okuyup kullanabiliriz. Serileþtirme iþlemi için Java’nýn Serializable sýnýfýný 
 * kullanýyoruz.*/
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