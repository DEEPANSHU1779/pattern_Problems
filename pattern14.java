package patterns;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst= 1;
        int row =1;
        int nr = 2*n -1;
        while (row<=nr){
            int val;
            if (row<=n){
                val=row;
            }
            else
                val=2*n - row;
            for(int cst=1;cst<=nst;cst++){
                if(cst%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(val);
                }
            }
            System.out.println();
            if(row<n){
                nst+=2;
            }else
                nst-=2;
            row++;
        }
    }
}
