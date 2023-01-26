package Map;

import java.util.Map;
import java.util.HashMap;

public class Exemplo4 {
	public static void main(String[] args) {
		Map<String, Double> salarys = new HashMap<>();
		double sum = 0.0;
		
		salarys.put("Seu Madruga", 100.00);
		salarys.put("Chaves", 10.00);
		salarys.put("Seu Barriga", 1000.00);
		salarys.put("Professor Linguica", 1500.00);
		
		for(String key: salarys.keySet()) {
			sum += salarys.get(key);
		}
		
		System.out.println(sum); // 2610.0
		
		for(String item : salarys.keySet()) {
			System.out.println(item);
		}
		
		
	}
}
