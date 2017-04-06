package SVN2;

public class SVN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bisiklet bisiklet = new Bisiklet(5, 7, 0);
		
		System.out.println(bisiklet.getVites());
		
		
		// class metod, static degiskene erisebiliriz.
		System.out.println(Bisiklet.getBisikletSayisi());

	}
}
