package DesignPattern.StrategyBetterExplaination;

public class ShoppingCartDemo {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@ps.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Sanjiv Upadhyay", "1234 4321 1234 4321", "123", "12/15"));
	}

}