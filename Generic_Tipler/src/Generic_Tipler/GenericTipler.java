package Generic_Tipler;

interface Pair<K,V>
{
	public K getKey();
	public V getValue();
}

class OrderedPair<K,V> implements Pair<K,V>
{
		private K key;
		private V value;
		
		public OrderedPair(K key,V value)
		{
			this.key = key;
			this.value = value;
		}
		
		public K getKey(){return key;}
		public V getValue(){return value;}
}

public class GenericTipler {
	public static void main(String args[])
	{
		Pair<String,Integer> pair = new OrderedPair("melih", 26);
		System.out.println(pair.getKey());
		
	}

}
