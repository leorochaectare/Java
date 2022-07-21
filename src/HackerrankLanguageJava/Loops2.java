package HackerrankLanguageJava;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("A: ");
            int a = sc.nextInt();
            System.out.print("B: ");
            int b = sc.nextInt();
            System.out.print("N: ");
            int n = sc.nextInt();

            int sum = a * 1;

            int maxIndex = (int) Math.pow(2, n - 1);
            for (int j = 1; j <= maxIndex; j *= 2) {

                sum += (j * b);
                System.out.print(sum + " ");
            }

            System.out.print("\n");
        }

        sc.close();

    }
}
