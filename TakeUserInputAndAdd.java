import java.util.*;

public class TakeUserInputAndAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(Sytem.in);
        System.out.println("Enter a First Number");

        int num1 = sc.nextint();
        System.out.println("Enter a Second Number");
        int num2 = sc.nextint();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers:" + sum);
    }
}