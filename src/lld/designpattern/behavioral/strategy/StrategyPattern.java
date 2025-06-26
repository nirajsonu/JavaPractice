package lld.designpattern.behavioral.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item pen = new Item("1234",100);
        Item pencil = new Item("2222",200);

        shoppingCart.addItem(pencil);
        shoppingCart.addItem(pen);

        shoppingCart.pay(new CreditCardStrategy("800","1234","12/12/2025","Neeraj"));

        shoppingCart.pay(new UpiStrategy("123","Kodak"));

        shoppingCart.pay(new PayPalStrategy("nirajsonu7@gmail.com","1234"));
    }
}
