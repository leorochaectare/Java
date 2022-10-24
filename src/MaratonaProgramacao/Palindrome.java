package MaratonaProgramacao;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();

        for(int i = 1; i <= casos; i++) {
            System.out.println(i + " ");
            String palavra = scanner.nextLine();
            if(ehPalindromo(palavra)){
                System.out.println("\"YES\"");
            } else {
                System.out.println("\"NO\"");
            }
             
        }

    }

    private static boolean ehPalindromo(String palavra){
        String invertido = new StringBuilder(palavra).reverse().toString();
        return palavra.equals(invertido);
    }
}
