package ListasSetsMapsAlura.Objetos;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import ListasSetsMapsAlura.Aluno.Aluno;

import java.util.HashSet;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>(); 
	private int qtde_aulas = 0;
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		this.qtde_aulas++;
	}
	
	public int getQuantidadeAulas() {
		return this.qtde_aulas;
	}

	public int getTempoTotal() {
//		int sum = 0;
//		
//		for(int i = 0; i < aulas.size(); i++) {
//			sum += aulas.get(i).getTempo();
//		}
//		
//		return sum;

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "," + "aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno a1) {
		return this.alunos.contains(a1); 
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("Numero de matricula nao encontrado!");
		}
		return this.matriculaParaAluno.get(numero);	
	}
	
	
	
	
	

}
