package patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        int row = 1;
        while (row<=n){
            for (int csp =1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for (int cst = 1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            nsp -= 1;
            nst += 1;
            row++;
        }
    }
}
