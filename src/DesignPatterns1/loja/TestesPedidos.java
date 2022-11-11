package DesignPatterns1.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import DesignPatterns1.loja.pedido.GeraPedido;
import DesignPatterns1.loja.pedido.GeraPedidoHandler;
import DesignPatterns1.loja.pedido.acao.EnviarEmailPedido;
import DesignPatterns1.loja.pedido.acao.SalvarPedidoBancoDeDados;

public class TestesPedidos {
	public static void main(String[] args) {
		String cliente = "Seu Madruga";
		BigDecimal valorOrcamento = new BigDecimal("2");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBancoDeDados(),
				new EnviarEmailPedido()));
		
		handler.execute(gerador);
	} 

}
