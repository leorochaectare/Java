package ListasSetsMapsAlura.Objetos;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Seu Madruga");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas); // []
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		
		System.out.println(javaColecoes.getAulas());
		
		
	}
}
