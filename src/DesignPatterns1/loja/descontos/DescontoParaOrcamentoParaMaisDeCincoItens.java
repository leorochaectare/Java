package DesignPatterns1.loja.descontos;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoParaMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoParaMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
	
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
	
}
