package HYonetim;
import java.io.*;
class benimException extends Exception
{
	
}
class deneme
{
	void  g() throws benimException
	{
		f(10);
	}
	void f(int x) throws benimException
	{
		throw new benimException();
	}
}

public class HataYonetimi {
	
	public static void main(String[] args)
	{
		File f = new File("a.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			int array[] = new int[10];
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Olusturulurken Hata Olustu");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Indeks disinda kalan alan");
			e.printStackTrace();
		} catch(Exception e){
			System.out.println("Bilinmeyen Hata");
		}
		
		deneme d = new deneme();
		try{
			d.f(5);
		} catch(benimException e)
		{
			
		}
		
	}
}
