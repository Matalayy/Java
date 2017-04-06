package DesignPatterns;

abstract class devamsizlikKontrol{
	public abstract boolean devamsizlik(int a);
}

class yuksekLisansOgrenci extends devamsizlikKontrol{
	public boolean devamsizlik(int a)
	{
		if(a > 50) return true;
		return false;
	}
}

class lisansOgrenci extends devamsizlikKontrol{
	public boolean devamsizlik(int a)
	{
		if(a > 80) return true;
		return false;
	}
}

abstract class egitimSeviyesi{
	public abstract boolean mezuniyetDurumu(double a);
}

class lisansSeviyesi extends egitimSeviyesi{
	public boolean mezuniyetDurumu(double a)
	{
		if(a > 2.00) return true;
		return false;
	}
}

class yukseklisansSeviyesi extends egitimSeviyesi{
	public boolean mezuniyetDurumu(double a)
	{
		if(a > 3.00) return true;
		return false;
	}
}

class ogrenci{
	String ogrenci;
	int devamsizlikSuresi;
	devamsizlikKontrol devamRolu;
	double notOrtalamasi;
	egitimSeviyesi ogrenciSeviye;
}

// The Player-Role Pattern
public class Player_Role {
	public static void main(String args[])
	{
		ogrenci melih = new ogrenci();
		melih.devamRolu = new yuksekLisansOgrenci();
		int a = melih.devamsizlikSuresi = 50;
		System.out.println("Devamsizliktan Kaldimi? :"+melih.devamRolu.devamsizlik(a));
		
		melih.ogrenciSeviye = new yukseklisansSeviyesi();
		melih.notOrtalamasi = 3.56;
		System.out.println("Sinifi Gectimi? : "+melih.notOrtalamasi+
				" "+melih.ogrenciSeviye.mezuniyetDurumu(3.56));
	}

}
