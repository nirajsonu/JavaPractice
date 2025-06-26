package annotations;
public class MyClass {
    public static void main(String a[]){
        Demo demo=new Demo();
        Class<? extends Demo> aClass = demo.getClass();
        System.out.println(aClass.getName());
        MyCustomAnnotation annotation = aClass.getAnnotation(MyCustomAnnotation.class);
        System.out.println(annotation.city());
        System.out.println(annotation.name());
        System.out.println(annotation.value());
    }
}

@MyCustomAnnotation(name = "Sonu",value = 100,city = "Patna")
class Demo{

}