package Others.java;

import java.util.Vector;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		
		Vector<Integer> nums = new Vector<>();
		nums.add(50);
		nums.add(40);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(50);
		
		Vector<String> words = new Vector<>();
		words.add("Seu Madruga");
		words.add("Chaves");
		words.add("Quico");
		
		System.out.println(nums.stream().map(values -> values).toList());
		System.out.println(nums.stream().filter(values -> values >= 30).toList());
		System.out.println(nums.stream().filter(values -> values == 30).findFirst().get());
		System.out.println(nums.stream().count());
		System.out.println(nums.stream().reduce(0, (accumulator, value) -> accumulator + value));
		System.out.println(nums.stream().distinct().toList());
		System.out.println(words.stream().collect(Collectors.joining(", ")));
		System.out.println(nums.stream().limit(2).toList());
		System.out.println(nums.stream().max(Integer::compareTo).get());
		System.out.println(nums.stream().min(Integer::compareTo).get());
		System.out.println(nums.stream().sorted().toList());
		        		
		
	}

}
