package patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        while(row<=n){
            if (row==1 || row==n){
                for(int i =01;i<=n;i++){
                    System.out.print("*");
                }
                System.out.println();
            }

            else{
                System.out.print("*");
                for (int i =1;i<=(n-2);i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            row++;
        }
    }
}
