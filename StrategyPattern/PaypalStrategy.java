package StrategyPattern;

public class PaypalStrategy implements PaymentStrategy{
    String email;

    public PaypalStrategy(String email){
        this.email=email;
    }
    @Override
    public void pay(int amount) {
        System.out.printf("PayPal :" + "$" +amount +"\n");
    }
}
