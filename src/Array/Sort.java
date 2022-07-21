package Array;

import java.util.List;
import java.util.ArrayList;

public class Sort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		list.sort(null);
		System.out.println(list); // [1,2,3,4]
		
	}
}

