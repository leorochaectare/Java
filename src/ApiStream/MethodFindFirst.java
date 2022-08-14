package ApiStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodFindFirst {
	public static void main(String[] args) {
		
		// Primeiro elemento da lista de inteiros
		
		List<Integer> list = Arrays.asList(3,5,7,9,11);
		
		Optional<Integer> answer = list.stream().findFirst();
		System.out.println(answer);
		
		
		// Primeiro elemento da lista de String
		
		// Creating a List of Strings
        List<String> listString = Arrays.asList("GeeksforGeeks", "for","GeeksQuiz", "GFG");

        // Using Stream findFirst()
        Optional<String> answerString = listString.stream().findFirst();
        System.out.println(answerString);
		
	}
}
