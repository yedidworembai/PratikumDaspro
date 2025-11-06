package jobsheet8;

import java.util.Scanner;

public class Square28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
                 //outer loop//
        for (int j = 1; j <= n; j++) {
                //inner loop//
            for (int i = 1; i <= n; i++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        sc.close();
    }
}