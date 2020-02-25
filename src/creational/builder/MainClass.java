package creational.builder;

import creational.builder.Phone.PhoneBuilder;

public class MainClass {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder(2).setGraphicsCardEnabled(true).build();
		System.out.println(phone);
	}
}
