package DesignPatterns1.loja.descontos;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public abstract class Desconto {
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
