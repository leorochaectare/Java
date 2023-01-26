package ApiStream;

import java.util.Arrays;
import java.util.List;

public class TesteStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,2,4,6,8,10,12);
		
		System.out.println(list.stream().count()); // 7
		
	}
}
