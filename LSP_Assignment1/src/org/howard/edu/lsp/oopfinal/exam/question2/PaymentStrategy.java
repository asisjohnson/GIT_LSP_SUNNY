package org.howard.edu.lsp.oopfinal.exam.question2;

public interface PaymentStrategy {
 void pay(double amount);
}

//CreditCardPayment.java
class CreditCardPayment implements PaymentStrategy {
 private String creditCardNumber;

 public CreditCardPayment(String creditCardNumber) {
     this.creditCardNumber = creditCardNumber;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using credit card " + creditCardNumber);
 }
}

//PayPalPayment.java
class PayPalPayment implements PaymentStrategy {
 private String email;

 public PayPalPayment(String email) {
     this.email = email;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using PayPal account " + email);
 }
}

//BitcoinPayment.java
class BitcoinPayment implements PaymentStrategy {
 private String bitcoinAddress;

 public BitcoinPayment(String bitcoinAddress) {
     this.bitcoinAddress = bitcoinAddress;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress);
 }
}

//ShoppingCart.java
class ShoppingCart {
 private PaymentStrategy paymentStrategy;

 public ShoppingCart(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void checkout(double amount) {
     paymentStrategy.pay(amount);
 }
}