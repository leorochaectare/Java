package DesignPatterns1.loja.pedido.acao;

import DesignPatterns1.loja.pedido.Pedido;

public class SalvarPedidoBancoDeDados implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {		
		System.out.println("Salvando pedidos no banco de dados");
	}
}
