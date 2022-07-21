package EstuturaDeDadosAlura.Conjuntos;

import java.util.HashSet;
import java.util.Set;



public class TesteConjunto {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Marcelo");
		conjunto.adiciona("Guilherme");
		System.out.println(conjunto);
		
		conjunto.remove("Mauricio");
		System.out.println(conjunto);
		
		Set<String> conjuntoJava = new HashSet<String>();
		conjuntoJava.add("Mauricio");
		conjuntoJava.add("Paulo");
		System.out.println(conjuntoJava);
		
		System.out.println("Guilherme".hashCode());
		System.out.println("Guilherme".hashCode());
		
	}
}
