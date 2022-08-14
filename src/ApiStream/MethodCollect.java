package ApiStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodCollect {
	public static void main(String[] args) {
		// create a list of integers
	    List<Integer> number = Arrays.asList(2,3,4,5);
	  
	    // Retornando o valor multiplicado por ele mesmo na lista 
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	    System.out.println(square);
	    
	    System.out.println("----------------------------------------------");
	    
	    // create a list of String
	    List<String> names =
	                Arrays.asList("Reflection","Collection","Stream", "Carne");
	  
	    // retornando o(s) elemento(s) que possui a primeira letra C 
	    List<String> result = names.stream().filter(s->s.startsWith("C")).
	                          collect(Collectors.toList());
	    System.out.println(result);
	    
	    System.out.println("----------------------------------------------");
	    
	    // Retornando a lista em ordem alfabetica
	    List<String> show =
	            names.stream().sorted().collect(Collectors.toList());
	    System.out.println(show);
	  
	}
}
