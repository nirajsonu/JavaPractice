package lld.designpattern.behavioral.strategy;

public class Item {
    private String upcCode;
    private int price;


    Item(String upcCode,int price){
        this.upcCode = upcCode;
         this.price = price;
    }

    public String getUpcCode(){
        return upcCode;
    }

    public int getPrice(){
        return price;
    }
}
