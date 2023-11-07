package SCRIPT;

import java.util.Scanner;

public class NestedLoop_2341720074 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        
        int i = 1;
        for (double[] barisArray : temps) {
            double avg = 0;
            System.out.println("Kota ke-" + i + " : ");
            for (double kolomArray : barisArray) {
                System.out.print(kolomArray + " ");
                avg += kolomArray;
            }
            System.out.println(" | Rata-Rata Suhu di kota-" + i + " : " + (avg/temps.length));
            i++;
        }
    }
}
