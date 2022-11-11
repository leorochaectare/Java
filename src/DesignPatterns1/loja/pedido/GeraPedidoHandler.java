package DesignPatterns1.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import DesignPatterns1.loja.orcamento.Orcamento;
import DesignPatterns1.loja.pedido.acao.AcaoAposGerarPedido;
import DesignPatterns1.loja.pedido.acao.EnviarEmailPedido;
import DesignPatterns1.loja.pedido.acao.SalvarPedidoBancoDeDados;

public class GeraPedidoHandler {
	// construtor com injeção de dependência: repository, service, etc.
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
	}
	
}
