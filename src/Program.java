public class Program {
    public static void main(String a[]){
        try{
            Exceptionclass.aMethod();
        }catch (Exception e){
            System.out.print("exception ");
        }
        System.out.print("finished");
    }
}


 class Exceptionclass {

    public static void aMethod() throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            System.out.print("finally ");
        }
    }
    public static void main(String args[])
    {
        try
        {
            aMethod();
        }
        catch (Exception e)
        {
            System.out.print("exception ");
        }
        System.out.print("finished");
    }
}
