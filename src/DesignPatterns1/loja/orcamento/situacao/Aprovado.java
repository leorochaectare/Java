package DesignPatterns1.loja.orcamento.situacao;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
