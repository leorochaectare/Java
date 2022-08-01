package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioOrdenandoStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("Power Rangers Vermelho");
		palavras.add("Power Rangers Preto");
		palavras.add("Power Rangers Rosa");
		
		// Criando uma classe anonima
//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);	
//			}
//			
//		};
		
		
		//Criando uma classe anonima diretamente pelo foreach 
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);	
//			}
//		});
		
		// Lambda
		palavras.forEach((String s) -> {
			System.out.println(s);
		});
		
		// Fazendo o lambda de uma maneira bem abreviada
		palavras.forEach(s -> System.out.println(s));
		
		// Classe anonima
//		palavras.sort(new Comparator<String>() {
//			@Override
//			public int compare(String string_1, String string_2) {
//				if(string_1.length() < string_2.length())
//					return -1;
//				else if(string_1.length() > string_2.length())
//					return 1;
//					
//				return 0;
//			}
//		});
		
		// lambda
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);
		
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		
	}
}

class ComparatorTamanhoLinha implements Comparator<String> {

	public int compare(String string_1, String string_2) {
		if(string_1.length() < string_2.length())
			return -1;
		else if(string_1.length() > string_2.length())
			return 1;
		
		return 0;
	}
	
}

class ImprimeNaLInha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}
