package behavior.strategy;

public class PaypalStrategy implements PaymentStrategy{

	private String emailId;
	private String password;
	
	public PaypalStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal");
	}

}
