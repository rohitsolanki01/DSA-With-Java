import java.util.*;


public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find a Area of Circle:");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is:" + area);
        sc.close();
    }
}