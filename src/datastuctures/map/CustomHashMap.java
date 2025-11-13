package datastuctures.map;

public class CustomHashMap <Key,Value>{

    static int size=0;
    private Key key;
    private Value value;
    CustomHashMap(Key key,Value value){
        this.key=key;
        this.value=value;
        size++;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public static int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomHashMap{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String a[]){
        CustomHashMap<Integer,String> customHashMap = new CustomHashMap<>(1,"Neera j");
        CustomHashMap<Integer,String> customHashMap1 = new CustomHashMap<>(2,"Sonu");
       // System.out.println(customHashMap.getKey());
      //  System.out.println(customHashMap.getValue());
        System.out.println(customHashMap);

        System.out.println(customHashMap.hashCode());
        System.out.println(customHashMap.getSize());
    }
}



