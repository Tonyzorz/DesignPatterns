package creational.singleton;

public class ThreadSafe {
	
	private static ThreadSafe ts;
	
	private ThreadSafe() {}
	
	public static ThreadSafe getInstance() {
		if(ts == null) {
			synchronized (ThreadSafe.class){
				if(ts == null) {
					ts = new ThreadSafe();
				}
			}
		}
		return ts;
	}
}
