package PolyMorphism;

public class Muhendis extends Insan {
	int maas;
	//constructor ile de overload edilebilir.
	public Muhendis()
	{
		maas = 7000;
		//this(7000); yazarsak
		//icerisine integer 7000 degerini alabilen
		//Muhendis isimli constructor methodunu arar.
	}
	
	public Muhendis(int maas)
	{
		this.maas = maas;
	}
	// super class methodu kullanimi asagidaki gibidir
	public Muhendis(int maas,int boy,int kilo)
	{
		super(boy,kilo);//insan sinifi icersindenki
		                //constructor cagrildi.
		this.maas = maas;
	}
	
	// Zam methodunu overload ediyoruz.
	// overload icin ya parametre tipi degismeli
	// ya da parametre sayisi degismelidir.
	int Zam()
	{
		maas++;
		return maas;
	}
	
	int Zam(int zamMiktari)
	{
		maas += zamMiktari;
		return maas;
	}
	
	int Zam(float zamOrani)
	{
		float artis = zamOrani*maas;
		Zam((int)artis);// overload methodun icinden ayni isimli
		                // overload edilmis methoduda cagirabiliriz.
		return maas;
	}
	
	// overriding insan sinifinin yemek methodu
	void yemek()
	{
		kilo += 5;
	}
	
	
	// toString() java.lang methodu override edildi
	public String toString()
	{
		return this.maas+"-> "+this.boy+"-> "+this.kilo;
	}
}
