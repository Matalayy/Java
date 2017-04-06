package Koleksiyonlar;

class Ogrenci implements Comparable<Ogrenci>
{
	private int no;
	private String isim,soyisim;
	
	public Ogrenci(int no, String isim,String soyisim)
	{
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
	}
	
	@Override
	public int compareTo(Ogrenci o) {
		return new Integer(this.no).compareTo(o.no);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
}
