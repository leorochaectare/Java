package ListasSetsMapsAlura.Objetos;

import java.util.Set;
import java.util.HashSet;

public class MeuSet {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		// adicione alguns alunos
		alunos.add("Seu Madruga");
		alunos.add("Chaves");
		alunos.add("Quico");
		alunos.add("Sr Barriga");
		alunos.add("Dona Florinda");
		
		// imprima o tamanho da coleção
		System.out.println(alunos.size()); // 5
		
		// tente adicionar um elemento que já existe
		alunos.add("Sr Barriga");
		
		// Imprima novamente a coleção
		System.out.println(alunos.size()); // 5
	}
}
