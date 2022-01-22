package patterns;

// *       *
// **     **
// ***   *** 
// **** ****
// *********

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = 2*n-3;
        int row=1;
        while(row<=n){
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            for(int csp =1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            int cst=1;
            if (row==n){
                cst=2;
            }
            for(;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            nst++;
            nsp-=2;
            row++;
        }

    }
}
