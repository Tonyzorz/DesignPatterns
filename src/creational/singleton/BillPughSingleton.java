package creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton () {}
	
	private static class SingletonClass {
		private static final BillPughSingleton BPS = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonClass.BPS;
	}
}
