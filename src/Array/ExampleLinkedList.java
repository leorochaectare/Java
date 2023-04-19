package Array;

import java.util.Arrays;
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
		
		System.out.println("________________________________________________________________");
		System.out.println("LinkedList sendo declarada em seu início");
		LinkedList<Integer> myList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(myList);
		
		
	}
}
