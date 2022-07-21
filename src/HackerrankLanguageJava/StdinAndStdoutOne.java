package HackerrankLanguageJava;

import java.util.Scanner;

public class StdinAndStdoutOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
