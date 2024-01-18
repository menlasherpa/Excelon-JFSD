package app.day07.pair;

// implementation class of Pair Interface
public class CustomerPair<K,V> implements Pair<K,V> {
	
	private K key;
	private V value;
	
	public CustomerPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
