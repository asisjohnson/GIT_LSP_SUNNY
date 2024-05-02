package org.howard.edu.lsp.oopfinal.exam.question2;

public class PaymentStrategyDriver {
	public static void main(String[] args) {
	   PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
	   PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
	   PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
	
	   ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
	   cart1.checkout(100.0);
	
	   ShoppingCart cart2 = new ShoppingCart(payPalPayment);
	   cart2.checkout(50.0);
	
	   ShoppingCart cart3 = new ShoppingCart(bitcoinPayment);
	   cart3.checkout(75.0);
	}
}
