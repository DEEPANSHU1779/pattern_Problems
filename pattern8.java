package patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-4;
        int nst = 1;
        int row = 1;
        while (row<=n){
            for(int csp =1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for (int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            System.out.println();
            if (row<=n/2){
                nsp-=1;
                nst+=2;
            }else{
                nsp++;
                nst-= 2;
            }
            row++;
        }
    }
}
