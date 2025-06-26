package opps;
public class Child extends ParentClass{


    Child(){
    //    super(10);
        System.out.println("Child Constructor");
    }
    public void show(){
        System.out.println("Child class method...");
    }


public static void main(String args[]){

    //Base class object
    Child child=new Child();

    //parent class object
   ParentClass parentClass= new ParentClass() ;
   parentClass.show();

   Child child1=new Child();
   child1.show();

   ParentClass parentClass1=new Child();
   parentClass1.show();



    //parent can hold child class reference
  //  ParentClass parentClass1=new Child();

    //child cannot hold parent refrence.
    //Child child1= (Child) new ParentClass();

   // child.show();
   // parentClass.show();
   // parentClass1.show();

   // child1.show();
}
}
