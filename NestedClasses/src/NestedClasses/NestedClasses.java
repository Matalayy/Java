package NestedClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NestedClasses {
	// Nested class - yani ic ice siniflar
	// varligi bir baska varligin var olmasina bagli olan siniflardir
	// buna vucudun orgalari ornegi verilebilir
	// birbirine bagli olrak olarak calisirlar ve vucut olmazsa
	// bu organlarin bir anlami yoktur.
	public static void main(String[] args)
	{
		// static olan seyler ayri bir hafiza alaninda durur
		// ve surekli yasarlar ve onlara erisim yapmamiz mumkundur
		
		// shadowing golgeleme class lar icersindeki degiskenlerin birbirini golgelemesidir
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		inner.innerClassMethod(2);
		
		
		System.out.println(OuterClass.StaticNestedClass.x);
		
		//Yaz();
		//Oku();
		
	}
	
	public static void Yaz(){
        try{
              Kisi kisi = new Kisi("Burak", "Kutbay");
              FileOutputStream dosya = new FileOutputStream("C:\\metin.txt");
              ObjectOutputStream yaz = new ObjectOutputStream(dosya);
              yaz.writeObject(kisi);
              yaz.close();
        }
        catch(Exception e){
              System.out.println(e.getMessage());
        }
	}
	public static void Oku(){
        try{
              FileInputStream dosya = new FileInputStream("C:\\metin.txt");
              ObjectInputStream oku = new ObjectInputStream(dosya);
              Kisi kisi = (Kisi)oku.readObject();
               System.out.println(kisi.toString());
              oku.close();
        }
        catch(Exception e){
              System.out.println(e.getMessage());
        }
}
	
}
