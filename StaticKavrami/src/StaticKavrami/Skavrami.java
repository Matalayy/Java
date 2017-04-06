package StaticKavrami;

public class Skavrami {
	private String isim;
	private int yas;
	private String ogrenciNo;
	public static int ogrenciSayisi = 0;
	public int ogr = ogrenciSayisi;
	
	protected Skavrami(String isim,int yas, String ogrenciNo)
	{
		this.isim = isim;
		this.yas = yas;
		this.ogrenciNo = ogrenciNo;
		ogrenciSayisi++;
	}
	
	
	
	public int ogrenciSayisiBul()
	{
		return ogrenciSayisi;
	}
	//Static metodlar static degerli integer döndürmelidir.
	//Aksi takdirde hata verir. Aþaðýdaki ogr static degildir
	//Bu nedenle hata alýrýz. Benzer sekilde static olmayan bir fonksiyon
	//geri cevirdiginde de ayni hatayi aliriz.
	public static int getOgrenciSayisi()
	{
		//return ogr;
		//return ogrenciSayisiBul();
		return ogrenciSayisi;
	}
	


}
