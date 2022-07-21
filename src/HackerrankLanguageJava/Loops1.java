package HackerrankLanguageJava;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + N * i);
        }

        sc.close();
    }
}
