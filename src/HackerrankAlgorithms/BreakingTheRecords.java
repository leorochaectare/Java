package HackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BreakingTheRecords {
	
	public static List<Integer> breakingRecords(List<Integer> scores){
		List<Integer> results = new ArrayList<>();
		int bigger = scores.get(0);
		int countBigger = 0;
		int smaller = scores.get(0);
		int countSmaller = 0;
		
		for(int i = 1; i < scores.size(); i++) {
			if(scores.get(i) > bigger) {
				bigger = scores.get(i);
				countBigger++;
			}
			
			if(scores.get(i) < smaller) {
				smaller = scores.get(i);
				countSmaller++;
			}
		}
		
		results.add(countBigger);
		results.add(countSmaller);
		
		return results;
	}
	
	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(3,4,21,36,10,28,35,5,24,42);
		List<Integer> scoresTwo = Arrays.asList(10,5,20,20,4,5,2,25,1);
		
		System.out.println(breakingRecords(scores));
		System.out.println(breakingRecords(scoresTwo));
	}
}
