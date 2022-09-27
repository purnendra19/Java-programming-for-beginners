import java.util.*;

public class Simpleinterest {
    public static void main (String []args){
        System.out.println("enter value of p");
        Scanner sc= new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println("enter value of r");
        
        int r = sc.nextInt();
        System.out.println("enter value of t");
    
        int t = sc.nextInt();
        sc.close();

        int simpleInt = p*r*t/100;
        System.out.print("ans: "+ simpleInt);

    }
        
}
