package String;

import java.util.LinkedList;

public class Verificacao {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("");
		System.out.println(list);
		
		System.out.println(list.size() >= 1 ? "" : list.size());
	}
}
