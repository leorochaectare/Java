package MaratonaProgramacao;

import java.util.Scanner;

public class my3n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio = Integer.parseInt(scanner.nextLine());
        int fim = Integer.parseInt(scanner.nextLine());
        int bigger = 0;

        int menor = Math.min(inicio, fim);
        int maior = Math.max(inicio, fim);
       

        for(int i = menor; i <= maior; i++) {
            System.out.println(qtdeInteractions(i));
            if(qtdeInteractions(i) > bigger) {
                bigger = qtdeInteractions(i);
            }
        }

        System.out.println("Valor final: " + bigger);

    }

    public static int qtdeInteractions(int n){
        int interactions = n;
        int qtde = 1;

        while(interactions != 1) {

            if(interactions % 2 != 0){
                interactions = (3 * interactions) + 1;
            } else {
                interactions = interactions / 2;
            }

            qtde++;
        }

        return qtde;
    }

    
}


