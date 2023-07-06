package Others.java;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static int findDigits(int number) {
		int countNumbers = 0;
		String transformString = String.valueOf(number);
		String item = "";
		List<Integer> listIntegers = new ArrayList<>(); 
		for(int i = 0; i < transformString.length(); i++) {
			item = String.valueOf(transformString.charAt(i));
			listIntegers.add(Integer.parseInt(item));
		}
		
		for(int i = 0; i < listIntegers.size(); i++) {
			
			if(listIntegers.get(i) != 0 && number % listIntegers.get(i) == 0) {
				countNumbers++;
			}
		}
		
		
		return countNumbers;
	}

	
	public static void main(String[] args) {

		System.out.println(findDigits(1012));
		
		
	}

}
