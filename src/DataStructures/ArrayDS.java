package DataStructures;

import java.util.List;
import java.util.ArrayList;

public class ArrayDS {
	
	public static List<Integer> reverseArray(List<Integer> a){
		int temp = 0;
		
		for(int i = 0; i < a.size(); i++) {
			for(int j = 0; j < a.size(); j++) {
				if(a.get(i) > a.get(j)) {
					temp = a.set(i, null);
					a.set(i, j);
					a.set(j, temp);
				}
			}
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(4);
		a.add(3);
		a.add(2);
		
		System.out.println(reverseArray(a));
	}
}
