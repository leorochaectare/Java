package Matrizes;

import java.util.Scanner;

public class Matrizes1 {
	public static void main(String[] args) {
		/*
		 * Ler um número inteiro N representando a ordem de uma matriz.
		 * Ler uma matriz de numeros reais, depois mostrar a soma principal da matriz
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		
		System.out.print("Qual a ordem da matriz ? ");
		int n = scan.nextInt();
		
		double[][] matriz = new double[n][n];
		
		System.out.println("Digite os valores da matriz");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Matriz ["+i+"]["+j+"] = ");
				matriz[i][j] = scan.nextDouble();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					sum += matriz[i][j];
				}
			}
		}
		
		System.out.println("Soma da diagonal principal: " + sum);
		
		scan.close();
	}
}
