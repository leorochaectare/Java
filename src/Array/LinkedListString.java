package Array;

import java.util.LinkedList;

public class LinkedListString {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		String nome = "Seu Madruga";
		
		list.add(nome);
		list.add(" tem ");
		list.add(" 50 ");
		list.add(" anos.");
		
		String filtro = String.join(" AND", list);
		
		System.out.println(filtro);
	}
}
