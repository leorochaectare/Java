package ListasSetsMapsAlura.Aluno;

import ListasSetsMapsAlura.Objetos.Aula;
import ListasSetsMapsAlura.Objetos.Curso;

public class TestCourseWithStudient {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Seu Madruga");

		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));
		
		Aluno a1 = new Aluno("Power Rangers 1", 34672);
		Aluno a2 = new Aluno("Power Rangers 2", 34571);
		Aluno a3 = new Aluno("Power Rangers 3", 34521);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println(javaColecoes.estaMatriculado(a1)); // true
		
		Aluno power_rangers = new Aluno("Power Rangers 1", 34672);
		System.out.println(javaColecoes.estaMatriculado(power_rangers)); // true
		
		System.out.println(a1.hashCode() == power_rangers.hashCode()); // true
	}
}
