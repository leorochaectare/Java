package Map;

import java.util.HashMap;
import java.util.Map;

public class Exemplo1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("user", "maria");
		map.put("phone", "35988775566");
		
		// Percorrer a minha coleção
		for(String key : map.keySet()) {
			System.out.println("Chave = " + key + ", Valor = " + map.get(key));
		}
	}	
}
