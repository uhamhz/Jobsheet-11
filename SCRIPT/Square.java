package SCRIPT;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N = ");
        int N = sc.nextInt();

        // Outer Loop
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            // Inner Loop
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
