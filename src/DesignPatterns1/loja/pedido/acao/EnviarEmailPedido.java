package DesignPatterns1.loja.pedido.acao;

import DesignPatterns1.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email do pedido");
	}
}
