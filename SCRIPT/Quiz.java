package SCRIPT;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {

                System.out.print("Tebak angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                if (answer > number) {
                    System.out.println("Jawaban Anda Terlalu Besar");
                }else if (answer < number){
                    System.out.println("Jawaban Anda Terlalu Kecil");
                }
                success = (answer == number);
            } while (!success);
            System.out.print("Apakah and ingin mengulang permainan (y/n) ? : ");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
