package PolyMorphism;

public class CokSekilcilik {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Muhendis mh = new Muhendis();
		System.out.println(mh.maas);
		System.out.println(mh.Zam(10));
		System.out.println(mh.Zam((float)0.10));
		
		Muhendis mh1 = new Muhendis(6000,180,65);
		System.out.println(mh1);
		
	}

}
