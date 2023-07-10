package Constructor;

public class ConstuctorDemo {
    private String name;
    private String city;


    ConstuctorDemo(String name,String city){
        this.name=name;
        this.city=city;
    }

    {
        System.out.println("Before the Constuctor this will run...");
    }

    public  ConstuctorDemo(){
        this("Neeraj");
        System.out.println("Constuctor runss...");
    }

    public ConstuctorDemo(String neeraj) {
        this.name=neeraj;
        System.out.println(name);
    }

    public static void main(String a[]){
        ConstuctorDemo c=new ConstuctorDemo();
        ConstuctorDemo c1=new ConstuctorDemo("Neeraj","Patna");
        String city1 = c1.city;
        System.out.println(city1);
        ConstuctorDemo c3= new ConstuctorDemo("sonu");
    }
}
