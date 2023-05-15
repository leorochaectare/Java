package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListJava {
	public static void main(String[] args) {
		List<String> campos = new ArrayList<>();
		campos.add("nome_imovel");
		campos.add("matricula");
		campos.add("cartorio");
		campos.add("proprietario");
		campos.add("arrendtario");
		
		System.out.println(campos);
		
		
		List<Integer> numbers = new LinkedList<>();
		int contador = 0;
		while(contador < 10) {
			numbers.add(contador);
			contador++;
		}
		
		System.out.println(numbers);
		System.out.println("Quantidade de itens: " + numbers.size());
		
		
		
		
	}
}
