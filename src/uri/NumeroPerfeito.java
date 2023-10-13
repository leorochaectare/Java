package uri;

import java.util.Scanner;

public class NumeroPerfeito {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int sum = 0;
		
		for(int index = 1; index < number; index++) {
		    if(number % index == 0) {
		        sum += index;
		    }
		}
		
		
		System.out.println(number == sum ? number + " eh perfeito" : number + " nao eh perfeito");
	}

}
