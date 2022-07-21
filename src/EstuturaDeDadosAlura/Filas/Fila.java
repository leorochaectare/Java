package EstuturaDeDadosAlura.Filas;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	
	private List<String> alunos = new LinkedList<String>();
	
	public void adiciona(String aluno) {
		alunos.add(aluno);
	}
	
	public boolean vazia() {
		return alunos.size() == 0;
	}
	
	public void remove() {
		if(vazia()) {
			throw new IllegalArgumentException("Fila vazia! Nao e possivel remover elementos de uma fila vazia....");
		}
		
		alunos.remove(0);
	}

	@Override
	public String toString() {
		return alunos.toString();
	}
	
	
	
	
}
