package MaratonaProgramacao;

import java.util.Scanner;

public class MyPalindrome {
    
    public static boolean isPalindrome(String palavra) {
        // two pointers
        int pointer1 = 0;
        int pointer2 = palavra.length() - 1;

        while (pointer1 < pointer2) {
            if (palavra.charAt(pointer1) != palavra.charAt(pointer2)) {
                return false;
            }
            pointer1++;
            pointer2--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();

        System.out.println(isPalindrome(palavra));
    }
}
