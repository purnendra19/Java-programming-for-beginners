import java.util.*;
public class Advancecalculater{
public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.printf(" Select 1 For Addition : %n Select 2 For Subtraction : %n Select 3 For Multiplication : %n Select 4 For Division :");
        int botton = sc.nextInt();
        float d;
        int r;
        switch(botton){
           case 1 : d=a+b;
           System.out.print(+d);
           break;
           
           case 2: d=a-b;
           System.out.print(+d);
           break;

           case 3: d=a*b;
           System.out.print(+d);
           break;

           case 4: d=a/b ; r = a%b;
           System.out.println("bagfal"+d);
           System.out.println("remender"+r);
           break;

           default : System.out.print("invalid botton");
                        
        }sc.close();

      

    }
}
