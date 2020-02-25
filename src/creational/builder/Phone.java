package creational.builder;

public class Phone {
	
	private int gb;
	private int ram;
	private boolean graphicsCardEnabled;
	
	
	
	public Phone(PhoneBuilder builder) {
		super();
		this.gb = builder.gb;
		this.ram = builder.ram;
		this.graphicsCardEnabled = builder.graphicsCardEnabled;
	}
	
	public int getGb() {
		return gb;
	}
	public int getRam() {
		return ram;
	}
	public boolean isGraphicsCardEnabled() {
		return graphicsCardEnabled;
	}
	
	
	
	@Override
	public String toString() {
		return "Phone [gb=" + gb + ", ram=" + ram + ", graphicsCardEnabled=" + graphicsCardEnabled + "]";
	}



	public static class PhoneBuilder{
		
		private int gb;
		private int ram;
		private boolean graphicsCardEnabled;
		
		
		public PhoneBuilder(int gb) {
			super();
			this.gb = gb;
		}
		
		public PhoneBuilder setGb(int gb) {
			this.gb = gb;
			return this;
		}
		public PhoneBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		public PhoneBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
			this.graphicsCardEnabled = graphicsCardEnabled;
			return this;
		}
		
		public Phone build() {
			return new Phone(this);
		}
		
		
	}
}
