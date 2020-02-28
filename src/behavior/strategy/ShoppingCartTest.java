package behavior.strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new PaypalStrategy("email1", "email1"));
		cart.pay(new CreditCardStrategy("email1", "email1","email1","email1"));
		
	}
}
