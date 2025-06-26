package lld.designpattern.behavioral.strategy;

import lld.designpattern.behavioral.strategy.PaymentStrategy;

public class UpiStrategy  implements PaymentStrategy {
    private String upiID;
    private String bankName;

    UpiStrategy(String upiID,String bankName){
        this.upiID = upiID;
        this.bankName = bankName;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" amount paid by upi");
    }
}
