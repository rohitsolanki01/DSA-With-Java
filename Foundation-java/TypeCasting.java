public class TypeCasting{
    public static void main(String[] args){
        
        //implicit type casting

        int integer = 20;  //byte → short → int → long → float → double
        long longNumber = integer;
        System.out.println("Implicit:" +longNumber);



        //Explicit type casting in java

          double x = 99.99;  //double → float → long → int → short → byte
        float y = (float) x;  // double to int
        System.out.println("Explicit:" + y);
    }
}