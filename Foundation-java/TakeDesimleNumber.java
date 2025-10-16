import java.util.*;
public class TakeDesimleNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number of decimal type:");
        
        float num1 = sc.nextFloat();
        System.out.println("Enter second number of decimal type:");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        sc.close();
    }
}