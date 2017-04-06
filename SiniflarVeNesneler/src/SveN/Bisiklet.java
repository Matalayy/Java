package SveN;

public class Bisiklet implements BisikletHareketleri  {
	
	int hiz = 5;
	int vites;
	int kadans;
	
	// Constructor
	public Bisiklet(int yeniVites,int yeniKadans)
	{
		vites = yeniVites;
		kadans = yeniKadans;
	}
	
	void kadansDegistir(int yeniDeger)
	{
		kadans = yeniDeger;
	}
	
	void vitesDegistir(int yeniDeger)
	{
		vites = yeniDeger;
	}
	
	void hizlan(int eklenecekHiz)
	{
		hiz += eklenecekHiz;
	}
	
	void yavasla(int cikarilacakHiz)
	{
		hiz -= cikarilacakHiz;
	}
	
	public void pedalCevir()
	{
		hiz++;
	}
	
	public void freneBas()
	{
		hiz--;
	}

}
