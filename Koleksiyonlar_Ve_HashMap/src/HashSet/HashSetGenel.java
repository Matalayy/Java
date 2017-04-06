package HashSet;
/*
Hashset özellikleri
Contaings ile arama yapabilinir(True,False)
Ayný eleman birden çok yer alamaz
Sadece bir null deðeri alabilir
Eleman Ekleme sýrasýna göre tutulmaz
Kendine ait bir sýralama kuralý vardýr.
*/

import java.util.HashSet;
import java.util.Iterator;

public class HashSetGenel {
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Visual Basic");
		hs.add("C++");
		hs.add("C#");
		hs.add("Java");
		hs.add("Php");
		
		for(String dil : hs)
		{
			System.out.println(dil);
		}
		
		System.out.println();
		
		//Contains kullanimi (Yani icerir mi?)
		String aranan="C++";
		boolean elemanvarmi= hs.contains(aranan);
		if(elemanvarmi==true){
			System.out.println("Aranan : " + aranan + "\nAranan Dil Var");
		}
		else {
			System.out.println("Aranan : " + aranan + "\nAranan Dil Yok");
		}
		System.out.println();
		
		//iterator (Java programlama dili)
		//Bir veri grubunun elemanlarýna sýrayla eriþim saðlayan yapý
		Iterator iter = hs.iterator();
		while(iter.hasNext())
		{
			String value = (String)iter.next();
			System.out.println("Diller : "+value);
		}
		System.out.println();
		
		boolean setBosmu = hs.isEmpty();
		System.out.println("Koleksiyon Bosmu : "+ setBosmu);
		System.out.println("Eleman Sayýsý : "+ hs.size());
		
		System.out.println();
		
		//istenilen elemaný silme
		String eleman="Java";
		hs.remove(eleman);
		System.out.println(eleman + " elemaný Silindi.");
		
		//tüm elemanlarý silme
		hs.clear();
		System.out.println("Tüm Elemanlar Silindi.");
	}
	
	
}
