package StaticKavrami;

public class childSkavrami extends Skavrami{

	protected childSkavrami(String isim, int yas, String ogrenciNo) {
		super(isim, yas, ogrenciNo);
	}
	
	public int ogrenciSayisiBul()
	{
		return ogrenciSayisi+100;
	}
	
	public static int getOgrenciSayisi()
	{
		return ogrenciSayisi+100;
	}
	


}
