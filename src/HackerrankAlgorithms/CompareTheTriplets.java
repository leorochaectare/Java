package HackerrankAlgorithms;

import java.util.List;
import java.util.ArrayList;

public class CompareTheTriplets {
	
	public static List<Integer> compareTheTriplets(List<Integer> a, List<Integer> b){
		List<Integer> results = new ArrayList<>();
		int countA = 0;
		int countB = 0;
		
		for(int i = 0; i < 3; i++) {
			if(a.get(i) > b.get(i)){
				countA++;
			} else if (b.get(i) > a.get(i)) {
				countB++;
			}
		}
		
		results.add(countA);
		results.add(countB);
		return results;
	}
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		a.add(5);
		a.add(6);
		a.add(7);
		
		b.add(3);
		b.add(6);
		b.add(10);
		
		System.out.println(compareTheTriplets(a, b));
	}
}
