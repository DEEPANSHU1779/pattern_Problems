package patterns;

import java.util.Scanner;
// *** ***
// **   **
// *     *

// *     *
// **   **
// *** ***

public class pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n-4;
        int nsp = 1;
        int row = 1;
        while (row<=n){
            for (int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            for (int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for (int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=n/2){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
            row++;
        }
    }
}
