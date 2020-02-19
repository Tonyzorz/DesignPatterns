package creational.singleton;

public class StaticBlockIntialization {
	
	private static StaticBlockIntialization sbi;
	
	private StaticBlockIntialization() {}
	
	static {
		try {
			sbi = new StaticBlockIntialization();
		} catch (Exception e) {
			throw new RuntimeException("exception when creating");
		}
	}
	
	public static StaticBlockIntialization getInstance() {
		return sbi;
	}
	
}
