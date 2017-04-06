package EAA;
// heap hafiza alani obje lerin tutuldugu ozel hafiza alanidir.
public class secretary extends employee {
	//static degisken class icerisinde nesnenin degil sinifin degiskenidir ve
	// herkesin erisebildigi ozel bir hafiza alaninda saklanir.
	// eger static olarak belirlemezsek nesneye ozel olarak degisir.
	static int numberOfSecretary = 0;
	// yeni bir nesne tanimlandiginda constructor sayesinde
	// sekreter sayisi static oldugundan surekli artar
	// eger static olmasaydi hep nesneye bagli olarak degisirdi ve sonuc = 1 olurdu.
	public secretary()
	{
		numberOfSecretary++;
	}
	
	public void salary() // salary methodunu override ettik
	{
		System.out.println("Salary : 2500 TL");
	}
	
	public final void authority()
	{
		System.out.println("Never give your aouthority");
	}
}
