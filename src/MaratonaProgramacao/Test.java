package MaratonaProgramacao;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scanner.hasNext() -> verificar se ainda tem alguma coisa para ler.

        while(scanner.hasNext()) {
            int numero = scanner.nextInt();
            if(numero == 42)
                break;
            System.out.println(numero);
        }
        
    }
}
