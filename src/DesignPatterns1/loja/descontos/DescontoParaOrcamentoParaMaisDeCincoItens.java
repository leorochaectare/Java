package DesignPatterns1.loja.descontos;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoParaMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoParaMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
		
		return proximo.calcular(orcamento);
	}
	
}
