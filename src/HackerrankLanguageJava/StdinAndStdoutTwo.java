package HackerrankLanguageJava;

import java.util.Scanner;

public class StdinAndStdoutTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Int: ");
        int i = scanner.nextInt();
        System.out.print("Double: ");
        double d = scanner.nextDouble();
        System.out.print("String: ");
        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }   
}
