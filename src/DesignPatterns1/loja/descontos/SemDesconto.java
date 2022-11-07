package DesignPatterns1.loja.descontos;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
	
}
