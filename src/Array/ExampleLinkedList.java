package Array;

import java.util.LinkedList;

public class ExampleLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Seu Madruga");
		list.add("Chaves");
		list.add("Dona Florinda");
		list.add("Quico");
		list.add("Bruxa do 71");
		
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		
	}
}
