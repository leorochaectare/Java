package HackerrankAlgorithms;

import java.util.Scanner;

public class SolveMeFirst {
	
	static int solveMeFirst(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		
		int sum = solveMeFirst(a,b);
		System.out.println("Sum: " + sum);
		
		sc.close();
	}
}
