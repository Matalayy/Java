package Continued_Fraction;

import java.math.BigInteger;

public class Continued_Fraction_Crypto {
	public static void main(String args[])
	{
		int[] cf = Cfraction(5, Math.log(3.14));
		for(int i=0 ; i<cf.length ; i++)
		{
			System.out.print(cf[i]+",");
		}
		System.out.println();
		int[] pQ = Partial_Quotient(100, 50, cf);
		for(int i=0 ; i<pQ.length ; i++)
		{
			System.out.print(pQ[i]+",");
		}
		System.out.println();
		String birlestirme = Cfraction_Birlestirme(pQ);
		System.out.println(birlestirme);
		String binarySonuc = binaryCevir(birlestirme);
		System.out.println(binarySonuc);
		System.out.println(binarySonuc.length());
		
	}
	
	// Surekli kesir algoritmasi
	public static int[] Cfraction(double e,double z)
	{
		double Xi = Math.pow(Math.log(z),1/e);
		
		int Ai = (int)Math.floor(Xi);
		
		int tamkisimlar[] = new int [1000];
		tamkisimlar[0] = Ai;
		
		double x;
		int a;
		
		for(int i=1; i<1000 ; i++)
		{
			x =(1/(Xi-Ai));
			a = (int)Math.floor(x);
			tamkisimlar[i] = a;
			Xi=x;
			Ai=a;
		}
		return tamkisimlar;
	}
	
	//Surekli kesrin bir parcasini alma
	
	public static int[] Partial_Quotient(int n, int m ,int[] tamkisimlar)
	{
		int[] partialQuotient = new int[n-m];
		for(int i = 0 ; i< n-m ; i++)
		{
			partialQuotient[i] = tamkisimlar[n+1+i]; 
		}
		
		return partialQuotient;
	}
	
	
	//Surekli kesrin elemanlarini birlestirme
	public static String Cfraction_Birlestirme(int[] partialQuotient)
	{
		String birlesikSayi = "";
		for(int i= 0 ; i < partialQuotient.length ; i++ )
		{
			birlesikSayi += Integer.toString(partialQuotient[i]);
		}
		return birlesikSayi;
	}
	
	public static String binaryCevir(String x)
	{
		BigInteger big = new BigInteger(x);
		String binary = big.toString(2);
		return binary;
	}
	
}


