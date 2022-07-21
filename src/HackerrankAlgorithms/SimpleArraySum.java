package HackerrankAlgorithms;

import java.util.List;
import java.util.ArrayList;

public class SimpleArraySum {
	
	public static int simpleArraySum(List<Integer> ar) {
		int sum = 0;
		
		for(int i = 0; i < ar.size(); i++) {
			sum += ar.get(i);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		
		int sum = simpleArraySum(array);
		System.out.println(sum); //150
	}
}
