package patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp  =0;
        int nst = n;
        int row = 1;
        while (row<=n){
            for (int csp = 1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for (int cst =1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            nsp++;
            nst--;
            row++;
        }
    }
}
