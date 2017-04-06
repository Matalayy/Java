package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
	public static void main(String args[])
	{
		/*Dönüþüm (Map)’ler, yapýsal olarak, Listeler ve Kümeler’den çok farklýdýr. 
		 * Öðeleri tek tek depolamak yerine nesne çiftlerini depo ederler. 
		 * Depolanmak istenen her öðeye bir anahtar verilir; böylece bir öðe yerine 
		 * bir öðe çifti oluþur ve bu çiftler depo edilirler. Depodaki her öðeye kendi
		 * anahtarýyla eriþilir. Öðe çifti “anahtar” ve “deðer” olmak üzere iki nesneden oluþur.
		 *  Anahtar, oluþançifti belirleyen iþaretçidir; deðer ise anahtara iliþkilendirilen 
		 *  bilgiyi içeren bir nesnedir. */
		
		HashMap<Integer, Ogrenci> ogrencimap = new HashMap<Integer,Ogrenci>();
		
		Ogrenci o1 = new Ogrenci(1, "Melih", "Atalay");
		Ogrenci o2 = new Ogrenci(2, "Suret", "Yorulmaz");
		Ogrenci o3 = new Ogrenci(3, "Yeliz", "Yesilmen");
		Ogrenci o4 = new Ogrenci(4, "Nimet", "Emer"); // Nimet ile Tugbaya ayni
		Ogrenci o5 = new Ogrenci(4, "Tugba", "Uyar"); // integer degerini verdik.
		
		ogrencimap.put(o1.getNo(), o1);
		ogrencimap.put(o2.getNo(), o2);
		ogrencimap.put(o3.getNo(), o3);
		ogrencimap.put(o4.getNo(), o4);
		ogrencimap.put(o5.getNo(), o5);
		
		//Direk olarak hashmapta foreach ile dönemiyoruz.
        //Öncelikle keyleri alýp ona göre dönmemiz lazým
        //Integer bir listeye alýyoruz.
		Set<Integer> anahtarlar = ogrencimap.keySet();
		
		//ve anahtarlara göre verileri alýyoruz.
        //Tabi burada toString() metodunu ezdiðimiz için
        //toString de tanýmladýðýmýz veriler gelecektir.
		for(Integer anahtar : anahtarlar)
		{
			// toString() tanýmlananlar
			System.out.println(ogrencimap.get(anahtar));
		}
		System.out.println();
		
		// Iterator kullanarak verileri alma
		Iterator iter = ogrencimap.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry mEntry = (Map.Entry)iter.next();
			System.out.println(mEntry.getKey()+" : "+mEntry.getValue());
		}
		System.out.println();
		
		for(Integer anahtar : anahtarlar)
		{
			System.out.println(ogrencimap.get(anahtar).getIsim());
		}
		System.out.println();
		
	}

}

class Ogrenci
{
	private int no;
	private String isim, soyisim;
	
	public Ogrenci() {}
	
	public Ogrenci(int no, String isim, String soyisim)
	{
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
	}
	
	public int getNo()
	{
		return no;
	}
	
	public void setNo(int no)
	{
		this.no = no;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	@Override
	public String toString()
	{
		return this.no+" "+this.isim+" "+this.soyisim;
	}
	
}
