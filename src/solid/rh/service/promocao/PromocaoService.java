package solid.rh.service.promocao;

import solid.rh.ValidacaoException;
import solid.rh.model.Cargo;
import solid.rh.model.Funcionario;

public class PromocaoService {
	
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		if(Cargo.GERENTE == funcionario.getDadosPessoais().getCargo()) {
			throw new ValidacaoException("Gerentes não podem ser promovidos");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário não bateu a meta");
		}
	}
}
