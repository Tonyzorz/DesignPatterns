package creational.factory;

public class MainClass {
	
	public static void main(String[] args) {
		//client code
		SwitchingComputer sc = new SwitchingComputer();
		sc.getInstance(1).spec();
		sc.getInstance(2).spec();
	}
}
