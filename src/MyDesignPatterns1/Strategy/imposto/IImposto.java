package MyDesignPatterns1.Strategy.imposto;

import java.math.BigDecimal;

import MyDesignPatterns1.Strategy.orcamento.Orcamento;

public interface IImposto {
	
	BigDecimal calcular(Orcamento orcamento);
}
