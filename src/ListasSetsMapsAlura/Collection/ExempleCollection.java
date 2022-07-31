package ListasSetsMapsAlura.Collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ExempleCollection {
	public static void main(String[] args) {
		Collection<String> strings = new LinkedList<>();
		String nome1 = "Seu Madruga";
		String nome2 = "Seu Barriga";
		String nome3 = "Chaves";
		String nome4 = "Seu Madruga";
		strings.add(nome1);
		strings.add(nome2);
		strings.add(nome3);
		strings.add(nome4);
		System.out.println(strings);
		System.out.println(strings.size());
		System.out.println(strings.isEmpty());
		System.out.println(strings.contains(nome3));
		System.out.println(strings.contains("Chaves"));
		
		
	}
}
