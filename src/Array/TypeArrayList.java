package Array;

import java.util.ArrayList;
import java.util.List;


public class TypeArrayList {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(4);
		nums.add(3);
		nums.add(2);
		
		System.out.println(nums); //[1,4,3,2]
		
		nums.set(0, 5);
		System.out.println(nums); //5,4,3,2
		
		nums.sort(null);
		System.out.println(nums); //2,3,4,5
		
		
	}
}
