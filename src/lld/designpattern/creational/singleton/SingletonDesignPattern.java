package lld.designpattern.creational.singleton;

public class SingletonDesignPattern implements Cloneable{
    public static void main(String a[]) throws CloneNotSupportedException {
       Single s= Single.createObject();
       Single s1=Single.createObject();
       System.out.println(s.hashCode());
       System.out.println(s1.hashCode());
       Single s3=(Single) s.clone();
       System.out.println(s3.hashCode());
    }
}

class Single{
    private static Single single=null;
    private Single(){

    }

    public static Single  createObject(){
            if(single==null){
                single=new Single();
            }
            return single;

    }

    //New keyword

    //For clone method persist.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Single();
        //return single;
    }


    //deSerialization

    //newInstance

    //newInstance to the constructor class

    //For reflection persist



}