package Array;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		int sum = 0;
		
		for(int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		
		System.out.println(sum); //15
	}
}
