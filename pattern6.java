package patterns;

import java.util.Scanner;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr = 2*n-1;
        int nst = 1;
        int row =1;
        while (row<=nr){
            for (int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            if (row<n){
                nst++;
            }
            else
                nst--;
            row++;
        }
    }
}
