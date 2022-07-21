package ListasSetsMapsAlura.Objetos;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Seu Madruga");
		alunos.add("Chaves");
		alunos.add("Quico");
		alunos.add("Dona Florinda");
		alunos.add("Bruxa 71");
		alunos.add("Seu Madruga");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		boolean professorLinguicaEstaMatriculado = alunos.contains("Professor Linguiça");
		System.out.println(professorLinguicaEstaMatriculado); // false
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
		
		
	}
}
