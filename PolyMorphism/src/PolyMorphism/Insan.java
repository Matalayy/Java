package PolyMorphism;

public class Insan {
	int boy;
	int kilo;
	
	public Insan()
	{
		
	}
	
	public Insan(int boy,int kilo)
	{
		this.boy = boy;
		this.kilo = kilo;
		System.out.println("Muhendis kullanilarak insan constructor i cagrildi");
	}
	
	void yemek()
	{
		kilo++;
	}
}
