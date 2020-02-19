package creational.singleton;

public class LazyIntialization {
	
	private static LazyIntialization li;
	
	private LazyIntialization() {}
	
	public static LazyIntialization getInstance() {
		if(li == null) {
			li = new LazyIntialization();
		} 
		return li;
	}
}
