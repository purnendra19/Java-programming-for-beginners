// java pattern printing programs
// hacktoberfest 2022 accpected 
// In this code N = numbers of lines of code
// This code printing following code
// hacktober 2022 accpected
//happy hacktober fest
// happy hacktober fest
// hacktober 2022 accpected
// hacktober 2022 accpected
// hacktober 2022 accpected
// happy hacktober fest
// hacktober 2022 accpected
// hacktober 2022 accpected

// output when N value is 8

// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8
// it will print the pattern mention above
import java.util.*;
public class Halfpyramidwithnumbers {
    public static void main(String args []){
        System.out.println("ENTER A NUMBER N ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //outer loop 
        for(int i=1;i<=n;i++){
            //inner loop for printing value of J and space.
            for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
        sc.close();
}
}
