package solid.rh.service.reajuste;

import java.math.BigDecimal;

import solid.rh.model.Funcionario;

public interface ValidacaoReajuste {

	void validar(Funcionario funcionario, BigDecimal aumento);
}
