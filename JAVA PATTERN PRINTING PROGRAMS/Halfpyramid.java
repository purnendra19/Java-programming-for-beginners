//java pattern printing programs
// hacktoberfest 2022 accpected 
//happy hacktoberfest 
// hacktober 2022 accpected

import java.util.*;
public class Halfpyramid {
    public static void main(String[]args){
        System.out.println("ENTER A VALUE OF N");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("+ ");
            }
            System.out.println();    
        }sc.close();
        
    }
}
