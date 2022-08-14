package ApiStream;

import java.util.Arrays;
import java.util.List;

public class MethodCount {
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Quantidade de elementos dentro da lista");
				
		List<Integer> list = Arrays.asList(0,2,4,6,8,10,12);
		
		long total = list.stream().count();
		
		System.out.println(total);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Quantidade de elementos dentro da lista porém sem repetir elementos");
		
		List<String> listString = Arrays.asList("GFG", "Geeks", "for", "Geeks","GeeksforGeeks", "GFG");
		
		long totalStrings = listString.stream().distinct().count();
		
		System.out.println(totalStrings);
		
		
	}
}
