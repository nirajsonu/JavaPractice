package lld.designpattern.creational.factory;


//In this design pattern we send type and it will return object
public class FactoryDesignPattern {
    public static void main(String a[]){
        Circle c= (Circle) FactoryCreator.objectType("circle");
        c.draw();

        Rectangle r=(Rectangle) FactoryCreator.objectType("rectangle");
        r.draw();
    }
}


class Rectangle implements shape{
    @Override
    public void draw() {
        System.out.println("This is Rectangle shape...");
    }
}


class Triangle implements shape{
    @Override
    public void draw() {
        System.out.println("This is Triangle Shape...");
    }
}

