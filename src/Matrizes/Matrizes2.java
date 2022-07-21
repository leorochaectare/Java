package Matrizes;

import java.util.Scanner;

public class Matrizes2 {
	// URI 1478

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o numero de elementos da matriz:");
		int n = scan.nextInt();

		while (n != 0) {
			
			int[][] matriz = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					matriz[i][j] = 1 + Math.abs(i - j);
				}
			}
			
			for(int i = 0; i < n; i++) {
				System.out.printf("%3d", matriz[i][0]);
				for(int j = 1; j < n; j++) {
					System.out.printf(" %3d", matriz[i][j]);	
					
				}
				System.out.println();
			}
			System.out.println();
			
			
			System.out.print("Informe o numero de elementos da matriz:");
			n = scan.nextInt();
		}
		
		scan.close();
	}
}
