package app.day07.pair;

public class CustomerPairMain {
	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new CustomerPair<String, Integer>("Lakpa", 1);
		System.out.println("Key: " + p1.getKey() + " Value: " + p1.getValue());
		
		Pair<String, String> p2 = new CustomerPair<String, String>("Plano", "Texas");
		System.out.println("Key: " + p2.getKey() + " Value: " + p2.getValue());
	}
}
