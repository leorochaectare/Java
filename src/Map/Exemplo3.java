package Map;

import java.util.HashMap;
import java.util.Map;

public class Exemplo3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Seu Madruga");
		map.put(2, "Quico");
		map.put(3, "Chaves");
		map.put(4, "Dona Florinda");
		
		System.out.println(map.get(1)); // Seu Madruga
		
	}
}
