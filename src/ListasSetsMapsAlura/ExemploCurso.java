package ListasSetsMapsAlura;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;

class Course {
	private String nome;
	private int alunos;
	
	public Course (String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}
	
}

public class ExemploCurso {
	
	
	public static void main(String[] args) {
		List<Course> cursos = new ArrayList<Course>();
		cursos.add(new Course("Python", 45));
		cursos.add(new Course("JavaScript", 150));
		cursos.add(new Course("Java 8", 113));
		cursos.add(new Course("C", 55));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Imprimindo os cursos");
		
		// Ordenando os cursos a partir de algum critério
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		// Imprimindo os cursos
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Imprimindo todos os cursos que possuem mais de 100 alunos");
		
		// Imprimir todos os cursos que possuem mais de 100 alunos
		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Quantos alunos possui em cada curso");
		
		cursos.stream().forEach(c -> System.out.println("Curso " + c.getNome() + " possui " + c.getAlunos()+ " alunos "));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Qual o numero de cursos que possui mais de 100 alunos");
		
		Stream<Course> numeros = cursos.stream().filter(c -> c.getAlunos() >= 100);
		System.out.println(numeros.count());
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Quantos alunos tem em cada um desses cursos com mais de 100 pessoas");
		
		cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).forEach(total -> System.out.println(total));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Saber o total de todos os alunos de todos os cursos que possui mais de 100 pessoas");
		
		int sumBiggerHundred = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).sum();
		System.out.println(sumBiggerHundred);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Saber o total de todos os alunos de todos os cursos");
		
		int sum = cursos.stream().mapToInt(c -> c.getAlunos()).sum();
		System.out.println(sum);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("FindAny - Retornando um curso que possui mais de 100 alunos");
		
//		Optional<Course> optionalCourse = cursos.stream().filter(c-> c.getAlunos() >= 100).findAny();
//		optionalCourse.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("average - Retornando a média dos cursos que possui mais de 100 alunos");
		
		 OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Course::getAlunos).average();
		 System.out.println(media);
		
		 System.out.println("----------------------------------------------------------");
		 System.out.println("Collect -> Alterar a referência da Collection para poder alterar a lista original de cursos");
		 
//		 cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
//		 cursos.stream().forEach(c -> System.out.println(c.getNome()));
		 
		 // Com essa mudança acima agora a lista de cursos que possui 4 elementos agora só vai possuir dois.
		 
		 System.out.println("----------------------------------------------------------");
		 System.out.println("toMap() - retornar a referência de duas função (o nome do curso e a quantidade de alunos) ");
		 
		 cursos.stream().filter(c -> c.getAlunos() >= 100)
		 	.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
		 	.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));;
		 
		 System.out.println("----------------------------------------------------------");
		 System.out.println("Retornando o nome do curso e a quantidade de alunos pelo for ");
		 
		 for(int i = 0; i < cursos.size(); i++) {
			 if(cursos.get(i).getAlunos() >= 100) {
				 System.out.println("O curso " + cursos.get(i).getNome() + " possui " + cursos.get(i).getAlunos() + " alunos.");
			 }
		 }
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
