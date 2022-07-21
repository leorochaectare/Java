package Others.java;

import java.util.ArrayList;

public class FunctionBoolean {

	static int maioridade_penal = 18;
	
	public static boolean verificaMaiorIdade(int age) {
		return age >= maioridade_penal ? true : false;
	}
	
	public static boolean verifica_elemento(int number) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		for(int n : nums) {
			if(n == number) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(verificaMaiorIdade(24));
		
		System.out.println(verifica_elemento(10));
	}
}
