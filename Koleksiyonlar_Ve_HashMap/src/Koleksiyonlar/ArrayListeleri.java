package Koleksiyonlar;

//Siralama yapabilmek icin comparable arayuzunu kullanmaliyiz
//compareTo() methodunu gecersiz kilmaliyiz



import java.util.ArrayList;
import java.util.Collections;

public class ArrayListeleri {
	public static void main(String args[])
	{
		ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		
		Ogrenci o1 = new Ogrenci(1, "Melih", "Atalay");
		Ogrenci o2 = new Ogrenci(2, "Suret", "Yorulmaz");
		Ogrenci o3 = new Ogrenci(3, "Nimet", "Emer");
		Ogrenci o4 = new Ogrenci(4, "Tugba", "Uyar");
		ogrenciler.add(o1);
		ogrenciler.add(o2);
		ogrenciler.add(o3);
		ogrenciler.add(o4);
		
		// Ogrenci No ya gore siralama
		Collections.sort(ogrenciler);
		System.out.println("Compare To methoduna gore Sort etme : ");
		System.out.println("Ogrenci No ya gore Siralama : ");
		for(Ogrenci ogr : ogrenciler)
		{
			System.out.println(ogr.getNo() + " "+ ogr.getIsim() + " " + ogr.getSoyisim());
		}
		System.out.println();
		
		//Ogrenci ismine gore siralama
		Collections.sort(ogrenciler,new ismeGoreSirala());
		System.out.println("Compare metoduna göre Sort etme : ");
        System.out.println("Ýsme Göre Sýralama : ");
        for(Ogrenci ogr : ogrenciler)
        {
        	System.out.println(ogr.getNo() + " "+ ogr.getIsim() + " " + ogr.getSoyisim());
        }
	}

}
