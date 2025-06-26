package lld.designpattern.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String cvv;
    private String cardNumber;

    private String expiryDate;
    private String name;

    CreditCardStrategy(String cvv,String cardNumber,String expiryDate,String name){
        this.cvv= cvv;
        this.cardNumber = cardNumber;
        this.expiryDate= expiryDate;
        this.name= name;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" amount paid by credit card");
    }
}
