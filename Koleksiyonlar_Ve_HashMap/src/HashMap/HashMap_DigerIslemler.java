package HashMap;

import java.util.HashMap;
import java.util.Set;



public class HashMap_DigerIslemler {

	public static void main(String[] args) {
		HashMap<Integer, String> ogr = new HashMap<Integer,String>();
		boolean mapBosmu = ogr.isEmpty();
		System.out.println("Koleksiyon bosmu : " + mapBosmu);
		
		ogr.put(2, "Ali");
		ogr.put(3, "Veli");
		ogr.put(1, "Mehmet");
		ogr.put(4, "Ridvan");
		
		System.out.println();
		
		System.out.println("Ogrenci Sayisi : "+ ogr.size());
		System.out.println();
		
		boolean mapBosmu2 = ogr.isEmpty();
		System.out.println("Koleksiyon Bosmu? : "+mapBosmu2);
		
		//�stenilen Anahtara g�re ismi getirir.
		String isimgetir=ogr.get(2);
		System.out.println("Se�ilen ��renci : "+isimgetir);
		
		System.out.println("T�m ��renciler ;");
		//Anahtara g�re s�ralay�p getirir
		Set<Integer> anahtarlar = ogr.keySet();
		
		for(Integer anahtar : anahtarlar)
		{
			// Anahtar sirasina gore yazdirir.
			System.out.println(ogr.get(anahtar));
		}

	}

}
