package Java8;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		String nome1 = "professor girafales";
		String nome2 = "dona florinda";
		String nome3 = "seu madruga";
		
		palavras.add(nome1);
		palavras.add(nome2);
		palavras.add(nome3);
		
		System.out.println(palavras);
		
		// Lambda para poder trazer os valores da lista
		palavras.forEach(s -> System.out.println(s));
		
		// Lambda com sort para poder trazer os valores da string na ordem de tamanho
		palavras.sort((string_1, string_2) -> Integer.compare(string_1.length(), string_2.length()));
		System.out.println(palavras);
	}
}
