package Others.java;

import java.util.LinkedList;
import java.util.List;

import Others.java.objetos.Correntista;

public class Teste {
	
	private static List<Correntista> listaCorrentista = new LinkedList<Correntista>();
	
	public static void adicionarCorrentista() {
		int index = listaCorrentista.size() + 1;
		listaCorrentista.add(new Correntista("CPF" + index , "NOME" + index));
	}
	
	private static List<Correntista> obterItensDaPagina(List<Correntista> lista, int paginaAtual, int itensPorPagina) {
		int startIndex = (paginaAtual - 1) * itensPorPagina;
        int endIndex = Math.min(startIndex + itensPorPagina, lista.size());

        if (startIndex > endIndex) {
            throw new IllegalArgumentException("Página inválida");
        }

        return lista.subList(startIndex, endIndex);
	}
	
	public static List<Correntista> retornarPaginacao(List<Correntista> lista, int paginaAtual, int itensPorPagina) {
		List<Correntista> itensDaPagina = obterItensDaPagina(listaCorrentista, paginaAtual, itensPorPagina);
		return itensDaPagina;
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			adicionarCorrentista();			
		}
		
		System.out.println(retornarPaginacao(listaCorrentista, 1, 10));
	}

}
