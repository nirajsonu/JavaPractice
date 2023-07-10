package opps;

public final class ImmutableClass {
    private final int i;
    ImmutableClass(int i){
        this.i=i;
    }

    public ImmutableClass  modify(int i){
        if(this.i==i){
            return this;
        }
        else {
            return new ImmutableClass(i);
        }
    }

    public static void main(String a[]){
        ImmutableClass immutableClass=new ImmutableClass(10);
        ImmutableClass immutableClass1=immutableClass.modify(100);
        ImmutableClass immutableClass2=immutableClass1.modify(1000);
    }

}
