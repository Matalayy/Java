package NestedClasses;

public class OuterClass {
	
	public int x=0;
	//Nested Class lar sirasiyla
	// 1. inner class
	// 2. local class
	// 3. anonymous class
	// inner class ta  bir ust class tan illaki bir obje olmasi gerekir
	// miras almada - (inheritance) ust class tan bir obje olusturmaya gerek yoktur.
	// local class belirli bir islem icin istenilen yerde olusturulan class tir.
	// islem sonrasi local class lar yok edilirler
	class InnerClass
	{
		//public int x = 1;
		
		public void innerClassMethod(int x)
		{
			System.out.println(x);
			//System.out.println(this.x);
			System.out.println(OuterClass.this.x);
		}
	}
	
	static class StaticNestedClass
	{
		static int x = 3;
	}

}
