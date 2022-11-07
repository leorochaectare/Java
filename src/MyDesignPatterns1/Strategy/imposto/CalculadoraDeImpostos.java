package MyDesignPatterns1.Strategy.imposto;

import java.math.BigDecimal;

import MyDesignPatterns1.Strategy.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, IImposto imposto) {
		return imposto.calcular(orcamento);
	}
	
}
