package HashSet;
/*
Hashset �zellikleri
Contaings ile arama yapabilinir(True,False)
Ayn� eleman birden �ok yer alamaz
Sadece bir null de�eri alabilir
Eleman Ekleme s�ras�na g�re tutulmaz
Kendine ait bir s�ralama kural� vard�r.
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
		//Bir veri grubunun elemanlar�na s�rayla eri�im sa�layan yap�
		Iterator iter = hs.iterator();
		while(iter.hasNext())
		{
			String value = (String)iter.next();
			System.out.println("Diller : "+value);
		}
		System.out.println();
		
		boolean setBosmu = hs.isEmpty();
		System.out.println("Koleksiyon Bosmu : "+ setBosmu);
		System.out.println("Eleman Say�s� : "+ hs.size());
		
		System.out.println();
		
		//istenilen eleman� silme
		String eleman="Java";
		hs.remove(eleman);
		System.out.println(eleman + " eleman� Silindi.");
		
		//t�m elemanlar� silme
		hs.clear();
		System.out.println("T�m Elemanlar Silindi.");
	}
	
	
}
