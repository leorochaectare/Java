package HackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;


public class ApplesAndOrange {
	
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int countApples = 0;
		int countOranges = 0;
		
		for(Integer i: apples) {
			int result = a + i;
			if(result >= s && result <= t) {
				countApples++;
			}
		}
		
		for(Integer i: oranges) {
			int result = b + i;
			if(result >= s && result <= t) {
				countOranges++;
			}
		}
		
		System.out.println(countApples);
		System.out.println(countOranges);
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 15;
		int s = 7;
		int t = 11;
		List<Integer> apples = Arrays.asList(-2,2,1);
		List<Integer> oranges = Arrays.asList(5,-6);
		
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}
}
