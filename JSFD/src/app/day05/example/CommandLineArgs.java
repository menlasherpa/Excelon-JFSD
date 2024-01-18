package app.day05.example;

public class CommandLineArgs {
	
	// go to run configurations and give values to arguments
	// or by CMD, jut type java <class> <argument values>
	// link: https://www.digitalocean.com/community/tutorials/command-line-arguments-in-java
	
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
