package EAA;

public class generalSecretary extends secretary {
	
	/*public void authority()
	{
		Kod hata veriyor cunku final methodlar override edilemezler
		ancak overload edilebilirler.
	}
	*/
	
	public void authority(int x)
	{
		System.out.println("I am more empowered than secretary");
	}
}
