package HackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MigratoryBirds {
	
	// Não está funcionando corretamente
	// Refazer ele usando as novas funcionalidades da Api Steam() aprendidas recentemente
	
	public static int migratoryBirds(List<Integer> arr) {
		List<Integer> nums =  new ArrayList<>();
		List<Integer> numsArray = new ArrayList<>();
		int bigger = 0;
		int countBigger = 0;
		int count = 0;
	
		// Verificando os valores iguais dentro do array
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.size(); j++) {
				if(arr.get(i) == arr.get(j)) {
					count++;
				}	
			}
			nums.add(arr.get(i));
			numsArray.add(count);
			count = 0;
		}
		
		for(int i = 0; i < numsArray.size(); i++) {
			if(numsArray.get(i) >= bigger) {
				bigger = numsArray.get(i);
				countBigger++;
			}
		}
		
		
		return countBigger-1;
	}
	
	public static void main(String[] args) {
		//List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
		
		System.out.println(migratoryBirds(arr));
	}
}
