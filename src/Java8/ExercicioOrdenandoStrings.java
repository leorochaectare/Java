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
		
		Consumer<String> consumidor = new ImprimeNaLInha();
		palavras.forEach(consumidor);
		
		Comparator<String> comparator = new ComparatorTamanhoLinha();
		palavras.sort(comparator);
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
