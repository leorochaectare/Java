package HackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
	/*
	 * Dado um array de inteiros e um inteiro positivo K, determine o número de (i,j) pares onde
	 * i < j e ar[i] + ar[j] e divisivel por k
	 * 
	 *  - o comprimento do array
	 *  - uma matriz de inteiros
	 *  - o divisor inteiro
	 *  
	 *  1- 2 inteiros separados por espaco, n e k
	 *  2- inteiros separados por espaco, cada um com um valor de arr[i]
	 * 
	 * Retorno - o numero de pares
	 */
	
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n; j++) {
				int sum = ar.get(i) + ar.get(j);
				boolean divisivel = sum % k == 0; 
				if(i < j && divisivel == true) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(1,2,3,4,5,6);
		int n = 6;
		int k = 5;
		
		System.out.println(divisibleSumPairs(n, k, ar));
	}
}
