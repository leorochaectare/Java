package ListasSetsMapsAlura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Array.Array;

class MyCourse {
	private String nome;
	private int alunos;
	
	
	public MyCourse(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return "MyCourse [nome=" + nome + ", alunos=" + alunos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(alunos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyCourse other = (MyCourse) obj;
		return alunos == other.alunos && Objects.equals(nome, other.nome);
	}	
	
	
}

public class MyExemploCurso {
	public static void main(String[] args) {
		List<MyCourse> cursos = new ArrayList<MyCourse>();	
		cursos.add(new MyCourse("Python", 45));
		cursos.add(new MyCourse("JavaScript", 150));
		cursos.add(new MyCourse("Java 8", 113));
		cursos.add(new MyCourse("C", 55));
		
		System.out.println("--------------------------------------------------------------------");
		
		// Utilizando a API de Stream, crie um filtro para todos os cursos que tenham mais de 50 alunos
		cursos.stream().filter(c -> c.getAlunos() >= 50).forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("--------------------------------------------------------------------");
		
		// Como transformar o Stream<MyCourse> em uma Stream<String> contendo apenas os nomes dos cursos
		cursos.stream().map(MyCourse::getNome).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------");
		
		// Fazer um código para trazer a quantidade de cursos com mais de 50 alunos utilizando o method reference
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(MyCourse::getAlunos)
		   .forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------");
		
		// Multiplicando a quantidade de alunos por ele mesmo Ex: 10 alunos 10 x 10 = 100
		List<Integer> square = cursos.stream().map(x -> x.getAlunos() * x.getAlunos()).
                collect(Collectors.toList());
		System.out.println(square);
		
		
		
		
		
		
		
		
		
		
		
	}
}
