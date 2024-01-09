package app.day5.example.abstractdemo;

public class Television extends Remote {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Switch on TV");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Switch off TV");
		
	}
	
	public Television() {
		super();
	}
	
	public void monitor() {
		System.out.println("Monitor...");
	}
}
