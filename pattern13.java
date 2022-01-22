package patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        int row =1;
        while(row<=n){
            int val=1;
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print(val);
                if(cst<=nst/2){
                    val++;
                }else
                    val--;
            }
            System.out.println();
            nsp=nsp-1;
            nst += 2;
            row++;
        }
    }
}
