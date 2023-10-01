package parquimetro.repository;

import java.util.LinkedList;
import java.util.List;

import parquimetro.domain.Condutor;
import parquimetro.exceptions.ControllerNotFoundException;

public class CondutorRepository {
	
	private static final List<Condutor> condutores = new LinkedList<>();
	
	public static List<Condutor> findAll() {
		return condutores;
	}
	
	public static Condutor findById(Long condutorId) {
		return condutores.stream().filter(condutor -> condutor.getCondutorId() == condutorId)
				.findFirst().orElseThrow(() -> new ControllerNotFoundException("Condutor não encontrado"));
	}
	
	public static boolean save(Condutor condutor) {
		boolean adicionarCondutor = condutores.add(condutor);
		if(!adicionarCondutor) {
			throw new ControllerNotFoundException("Erro ao salvar o condutor");
		}
		
		return adicionarCondutor;
	}
	
	public static int size() {
		return condutores.size();
	}

}
