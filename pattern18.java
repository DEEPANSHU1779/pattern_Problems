package patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp1 = 0;
        int nsp2 = n-2;
        int row =1;
        while(row<=n){
            for(int csp=1;csp<=nsp1;csp++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int csp=1;csp<=nsp2;csp++){
                System.out.print(" ");
            }
            if (row==n/2+1){
            }
            else
                System.out.print("*");
            for(int csp=1;csp<=nsp1;csp++){
                System.out.print(" ");
            }
            System.out.println();
            if (row<=n/2){
                nsp1++;
                nsp2-=2;
            }
            else{
                nsp1--;
                nsp2+=2;
            }
            row++;

        }
    }

}
