package DesignPatterns1.loja.orcamento.situacao;

import DesignPatterns1.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
