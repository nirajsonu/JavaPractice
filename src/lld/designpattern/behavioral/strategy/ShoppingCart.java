package lld.designpattern.behavioral.strategy;

import lld.designpattern.behavioral.strategy.Item;
import lld.designpattern.behavioral.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    private String type;

    ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }


    public void remove(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum =0;
        for(Item item:items){
            sum = sum + item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
