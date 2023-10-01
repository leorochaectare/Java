package parquimetro.repository;

import java.util.LinkedList;
import java.util.List;

import parquimetro.domain.Veiculo;
import parquimetro.exceptions.ControllerNotFoundException;

public class VeiculoRepository {

	private static final List<Veiculo> veiculos = new LinkedList<>();
	
	public static List<Veiculo> findAll() {
		return veiculos;
	}
	
	public static Veiculo findById(Long veiculoId) {
		return veiculos.stream().filter(veiculo -> veiculo.getVeiculoId() == veiculoId)
				.findFirst().orElseThrow(() -> new ControllerNotFoundException("Veiculo não encontrado"));
	}
	
	public static boolean save(Veiculo veiculo) {
		boolean adicionarVeiculo = veiculos.add(veiculo);
		if(!adicionarVeiculo) {
			throw new ControllerNotFoundException("Erro ao salvar o veiculo");
		}
		
		return adicionarVeiculo;
	}
	
	public static int size() {
		return veiculos.size();
	}
	
	
}
