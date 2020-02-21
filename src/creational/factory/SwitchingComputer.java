package creational.factory;

public class SwitchingComputer {
	
	public OS getInstance(int num) {
		if(num == 1) return new Computer1();
		else if(num == 2) return new Computer2();
		
		return null;
	}
}
