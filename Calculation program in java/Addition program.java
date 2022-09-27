// Three number addition program in java. 
import java.util.*;

public class inputadd{
    public static void main(String [] agrs){
        //input
        Scanner sc= new Scanner(System.in);
        //take first number input
        System.out.println("Enter your first number : ");
        int a = sc.nextInt();
        //take second number
        System.out.println("Enter your second number : ");
        int b = sc.nextInt();
        //take third number
        System.out.println("Enter your third number : ");
        int c = sc.nextInt();
        int d = a+b+c;
        System.out.println("Total is = "+d);
        sc.close();
    }
}
