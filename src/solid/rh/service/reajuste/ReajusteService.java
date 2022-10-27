package solid.rh.service.reajuste;

import java.util.List;

import java.math.BigDecimal;
import solid.rh.model.Funcionario;

public class ReajusteService {
    
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustaSalarioFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
