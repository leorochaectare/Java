package HackerrankLanguageJava;

import java.util.ArrayList;
import java.util.Collections;

public class JavaSubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < s.length() - k+1; i++) {
			list.add(s.substring(i,k +i));	
		}
		
		Collections.sort(list);
		smallest = list.get(0);
		largest = list.get(list.size()-1);
		
		return smallest + "\n" + largest;
	}
		
	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		
		System.out.println(getSmallestAndLargest(s, k));	
	}
}
