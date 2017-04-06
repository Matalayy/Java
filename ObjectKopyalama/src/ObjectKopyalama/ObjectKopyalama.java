package ObjectKopyalama;

class insan{
	int boy;
}

class ogrenci extends insan implements Cloneable{
	Object kopyala() throws CloneNotSupportedException
	{
		return this.clone();
	}
	
	Object kopyala2() // buda derin kopyalamadir. ancak bu kopyalama her
	                  // ozellik icin ayri ayri yapilmalidir.
	{
		ogrenci temp = new ogrenci();
		temp.boy = this.boy;
		return temp;
	}
	
	// simdi java.lang kutuphanesinden otomatik olarak gelen
	// equals metodunu override edelim.
	
	boolean equals(ogrenci rhs)
	{
		return this.boy == rhs.boy;
	}
	
	// toString fonksiyonu objeleri alabilmek icin override edilir.
	
	public String toString()
	{
		return "kisinin boyu "+this.boy;
	}
}

public class ObjectKopyalama {

	public static void main(String[] args) throws CloneNotSupportedException{
		insan ali = new insan();
		ali.boy = 180;
		insan veli = ali; //ali de veli de ayni objeyi gosteriyorlar
		                  // buna  @ shallow copy - sýð kopyalama denir. @
		
		if(ali == veli)	
			System.out.println("ali objesi veli ile esit midir : "+true);
		if(ali.equals(veli))
			System.out.println("ali objesi veli ile denk midir : "+true);
		
		ogrenci ayse = new ogrenci();
		ayse.boy = 170;
		ogrenci fatma = (ogrenci)ayse.kopyala(); // Deep Copy @ Derin kopyalama @
		if(ayse == fatma)
			System.out.println("ayse objesi fatma ile esit midir : "+true);
		else
			System.out.println("ayse objesi fatma ile esit midir : "+false);
		
		System.out.print("ayse,fatma boy "+ayse.boy+" ");
		System.out.println(fatma.boy);
		
		//fatma.boy = 190;
		if(ayse.equals(fatma))
			System.out.println("(override equals -boy<>)\nayse objesi fatma ile denk midir : "+true);
		else
			System.out.println("(override equals -boy)\nayse objesi fatma ile denk midir : "+false);
		System.out.print("ayse,fatma boy "+ayse.boy+" ");
		System.out.println(fatma.boy);
		
		
		System.out.println(ali);
		System.out.println(veli);
		System.out.println(ali.hashCode());
		System.out.println(veli.hashCode());
		
		System.out.println(ayse);
		System.out.println(fatma);
		System.out.println(ayse.hashCode());
		System.out.println(fatma.hashCode());
		
	}

}
