package StaticKavrami;

public class StaticKavrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childSkavrami csk = new childSkavrami("Melih", 26, "21019746");
		Skavrami sk = new Skavrami("Suret", 30, "20870415");
		
		System.out.println(sk.getOgrenciSayisi());
		System.out.println(csk.getOgrenciSayisi());
		
	}
}
