package DesignPatterns1.loja.descontos;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
}
