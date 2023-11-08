package SCRIPT;

import java.util.Scanner;

public class Individu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tugas Individu 1
        System.out.print("Masukan Angka : ");
        int angka1 = input.nextInt();

        int i = 1, l = angka1;
        while (i <= angka1) {
            int k = 0;
            l--;
            while (k <= l) {
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }

        // Tugas Individu 2
        System.out.print("Masukan Angka : ");
        int angka2 = input.nextInt();

        for (int j = angka2; j > 0; j--) {
            for (int j2 = 1; j2 <= j; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Tugas Individu 3
        System.out.print("Masukan Angka : ");
        int angka3 = input.nextInt();

        for (int j = 0; j < angka3; j++) {
            for (int j2 = 0; j2 < angka3; j2++) {
                if (j == 0 || j2 == 0 || j == angka3 - 1 || j2 == angka3 - 1) {
                    System.out.print(angka3 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
