package Others.java;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import Others.java.objetos.Depoimento;

public class Teste {
	
	public static Set<Depoimento> retornaDepoimentosAleatorios() {
		List<Depoimento> listaDepoimentos = new LinkedList<>();
		
		for(int index = 0; index < 20; index++) {
			listaDepoimentos.add(new Depoimento(Long.valueOf(index), "Foto"+index, "Depoimento"+index, "Nome"+index));
		}
		
		Set<Depoimento> depoimentosSorteados = new HashSet<>();
		
		final int maximoNumerosParaSeremSorteados = 3;
		while(depoimentosSorteados.size() < maximoNumerosParaSeremSorteados) {
			int numberRandom = new Random().nextInt(listaDepoimentos.size());
			depoimentosSorteados.add(listaDepoimentos.get(numberRandom));
		}
		
		return depoimentosSorteados;
	}
	
	public static void main(String[] args) {
		System.out.println(retornaDepoimentosAleatorios());		
	}

}
