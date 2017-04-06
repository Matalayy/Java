package EAA;
// Encapsulation : kapsulleme
// Kodlama detaylarinin saklanmasi ve sadece arayuzlerin calismasidir
// *** Bir nesnenin nasil calistiginin kapali, ne yaptiginin acik olmasidir.
// *** Bir nesnenin nasil calisildigina karisilamamasi ancak soyleneni yapmasidir.
public class Kapsul {
	private int kapsulboyu;
	
	public int getKapsulboyu()
	{
		return kapsulboyu;
	}
	
	public void setKapsulboyu(int kapsulboyu)
	{
		this.kapsulboyu = kapsulboyu;
	}
	
}
