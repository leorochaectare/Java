package Map;

import java.util.HashMap;

public class Exemplo5 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("chave1", 1);
		map.put("chave2", 2);

		System.out.println(map); // {chave2=2, chave1=1}
		int valor = map.get("chave1");
		System.out.println(valor); // 1
		
		if (map.containsKey("chave1")) {
		    System.out.println("A chave existe no mapa");
		}
		
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//		    System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
//		}
		
		map.remove("chave1");
		System.out.println(map); //{chave2=2}
		map.clear();
		System.out.println(map); //{}
	}
}
