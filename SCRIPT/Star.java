package SCRIPT;

import java.util.Scanner;

/**
 * Star
 */
public class Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai N = ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i--) {
            System.out.print("*");
        }
    }
}