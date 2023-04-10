package Map;

import java.util.HashMap;

import Map.objetos.NotasFiscais;

public class AtributosDinamicos {
	public static void main(String[] args) {
		NotasFiscais notasFiscais = new NotasFiscais();
		
		HashMap<Object, Integer> notas = new HashMap<Object, Integer>();
	
		notas.put(notasFiscais.getNumero_nota_1(), 1);
		notas.put(notasFiscais.getNumero_nota_2(), 2);
		notas.put(notasFiscais.getNumero_nota_3(), 3);
		notas.put(notasFiscais.getNumero_nota_4(), 4);
		notas.put(notasFiscais.getNumero_nota_5(), 5);
		notas.put(notasFiscais.getNumero_nota_6(), 6);
		notas.put(notasFiscais.getNumero_nota_7(), 7);
		notas.put(notasFiscais.getNumero_nota_8(), 8);
		notas.put(notasFiscais.getNumero_nota_9(), 9);
		notas.put(notasFiscais.getNumero_nota_10(), 10);
		
		System.out.println(notas);
		
		
	}
}
