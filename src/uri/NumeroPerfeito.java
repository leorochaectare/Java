package uri;

import java.util.Scanner;

public class NumeroPerfeito {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				sum += i;
			}
		}
		
		
		if(numero == sum) {
			System.out.println(numero + " eh perfeito");
		}
		
		
		
		
	}

}
