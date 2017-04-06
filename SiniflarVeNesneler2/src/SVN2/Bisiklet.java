package SVN2;

public class Bisiklet {
	
	private int kadans;
	private int vites;
	private int hiz;
	
	private int id;
	
	private static int bisikletSayisi = 0;
	//constructor
	public Bisiklet(int baslangicKadans, int baslangicVites,int baslangicHiz)
	{
		setKadans(baslangicKadans);
		setVites(baslangicVites);
		setHiz(baslangicHiz);
		
		id = ++bisikletSayisi;
	}
	
	public int getId()
	{
		return id;
	}
	
	public static int getBisikletSayisi()
	{
		return bisikletSayisi;
	}
	
	// Get ve Set metodlarini Kadans icin ekleme
	
	// burada aslinda bir encapsulation baslatiyoruz
	public int getKadans() {
		return kadans;
	}

	public void setKadans(int kadans) {
		this.kadans = kadans;  // this kullanimi yukaridaki degiskeni gosterir.
	}
	
	// kadans sonu
	
	public int getVites() {
		return vites;
	}

	public void setVites(int vites) {
		this.vites = vites;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	
	
	

}
