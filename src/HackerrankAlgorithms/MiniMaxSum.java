package HackerrankAlgorithms;

import java.util.List;
import java.util.ArrayList;

public class MiniMaxSum {
	
	public static void miniMaxSum(List<Integer> arr) {
		long sum = 0;
		long bigger = 0;
		long smaller = arr.get(0);
		
		for(int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
			
			if(arr.get(i) > bigger) {
				bigger = arr.get(i);
			}
			
			if(arr.get(i) < smaller) {
				smaller = arr.get(i);
			}
		}
		
		System.out.println((sum-bigger) + " " + (sum-smaller));
	}
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		
		miniMaxSum(array);
	}
}
