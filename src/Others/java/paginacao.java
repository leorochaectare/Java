package Others.java;

import java.util.LinkedList;
import java.util.List;

import Others.java.objetos.Correntista;

public class paginacao {
	
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
	
	public static List<Correntista> retornaListaFiltrada(String filtro) {
		if(filtro==null) {
			return listaCorrentista;
		}
		
		return listaCorrentista.stream().filter(item -> item.getNome().contains(filtro)).toList();
	}
	
	public static List<Correntista> retornarPaginacao(List<Correntista> lista, int paginaAtual, int itensPorPagina) {
		List<Correntista> itensDaPagina = obterItensDaPagina(lista, paginaAtual, itensPorPagina);
		return itensDaPagina;
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			adicionarCorrentista();			
		}
		
		String filtro = "1";
		var lista = retornaListaFiltrada(filtro);
		System.out.println(retornarPaginacao(lista, 2, 10));
	}

}
