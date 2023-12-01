package parquimetro.repository;

import java.util.LinkedList;
import java.util.List;

import parquimetro.domain.Registro;
import parquimetro.exceptions.ControllerNotFoundException;

public class RegistroRepository {
	
	private static final List<Registro> registros = new LinkedList<>();
	
	public static List<Registro> findAll() {
		return registros;
	}
	
	public static Registro findById(Long registroId) {
		return registros.stream().filter(registro -> registro.getRegistroId() == registroId)
				.findFirst().orElseThrow(() -> new ControllerNotFoundException("Registro não encontrado"));
	}
	
	public static boolean save(Registro registro) {
		boolean adicionarRegistro = registros.add(registro);
		if(!adicionarRegistro) {
			throw new ControllerNotFoundException("Erro ao salvar o condutor");
		}
		
		return adicionarRegistro;
	}
	
	public static int size() {
		return registros.size();
	}

}
