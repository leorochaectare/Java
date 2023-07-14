package Math;

import java.util.LinkedList;
import java.util.List;

public class AddExact {
	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		int accumulator = 0;
		
		for (Integer nums : numbers) {
			accumulator = Math.addExact(accumulator, nums);
		}
		
		System.out.println(accumulator); // 150
	}
}
