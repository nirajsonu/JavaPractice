package opps;
public class InheritaceExample extends ParentClass{

    public void show(){
        System.out.println("Child class method...");
    }




    //override the parent class method.
   // @Override
    //public void show()
   // {

   // }

public static void main(String args[]){

    //Base class object
    InheritaceExample inheritaceExample=new InheritaceExample();

    //parent class object
    ParentClass parentClass= new ParentClass() ;
    ParentClass.print();


    //parent can hold child class reference
    ParentClass parentClass1=new InheritaceExample();

    //child cannot hold parent object
   // InheritaceExample inheritaceExample1=new ParentClass();

    inheritaceExample.show();
    parentClass.show();
}
}
