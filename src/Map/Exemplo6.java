package Map;

import java.util.HashMap;
import java.util.Map;

public class Exemplo6 {
	
	static Map<String, Integer> listaEmpresas = new HashMap<>();
	
	public static void inicializarListaEmpresas() {
		listaEmpresas.put("Empresa1", 1);
		listaEmpresas.put("Empresa2", 2);
		listaEmpresas.put("Empresa3", 3);
	}
	
	public static void printarEmpresa() {
		System.out.println(listaEmpresas.get("Empresa1"));
	}
	
	public static void main(String[] args) {
//		inicializarListaEmpresas();
		
		printarEmpresa();
		
//		System.out.println(listaEmpresas);	
	}

}
