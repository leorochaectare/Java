package ListasSetsMapsAlura.Objetos;

import ListasSetsMapsAlura.Aluno.Aluno;

public class TestaBuscaAlunoNoCurso {
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
		
		Aluno aluno = javaColecoes.buscaMatriculado(34672);
		System.out.println("Aluno: " + aluno);
	}
}
