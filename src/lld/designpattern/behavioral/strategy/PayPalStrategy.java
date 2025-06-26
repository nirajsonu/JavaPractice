package lld.designpattern.behavioral.strategy;

import lld.designpattern.behavioral.strategy.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    PayPalStrategy(String email,String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" amount paid by paypal");
    }
}
