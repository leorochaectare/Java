package ApiStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;




public class MethodReduce {
	
	 public static int add(int a, int b) {
	        return a + b;
	 }
	
	 
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Retornando a maior String da lista");
		
		  List<String> words = Arrays.asList("GFG", "Geeks", "for","GeeksQuiz", "GeeksforGeeks");
		  
		  Optional<String> longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		  
		  longestString.ifPresent(System.out::println);
		  
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Sum of numbers");
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sum = numbers.stream().reduce(0, (accumulator, value) -> accumulator + value);
		System.out.println(sum);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Function Sum of numbers");
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sumFunction = integers.stream()
		  .reduce(0, MethodReduce::add);
		
		System.out.println(sumFunction);
		
		
	}
}
