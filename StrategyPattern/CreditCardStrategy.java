package StrategyPattern;

public class CreditCardStrategy implements PaymentStrategy{
    String cardNumber;
    String CreditCard;

    public CreditCardStrategy(String cardNumber){
        this.cardNumber=cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("CreditCard :" + "$" +amount +"\n");
    }
}
