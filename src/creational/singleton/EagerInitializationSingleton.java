package creational.singleton;

public class EagerInitializationSingleton {
	
	private static final EagerInitializationSingleton ei= new EagerInitializationSingleton();
	
	private EagerInitializationSingleton(){}
	
	public static EagerInitializationSingleton getInstance() {
		return ei;
	}
}