package Classes.Venda;

public class Venda {
	private int idvenda;
	private String data;
	private int numeronota;
	private String tipopagamento;
	private double valor_frete;
	private double valor_desconto;
	DestinatarioVenda Destinatario;
	PagamentoVenda Pagamento;
	
	public Venda() {
		this.Destinatario = new DestinatarioVenda();
		this.Pagamento = new PagamentoVenda();
	}
	
	public int getIdvenda() {
		return idvenda;
	}
	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getNumeronota() {
		return numeronota;
	}
	public void setNumeronota(int numeronota) {
		this.numeronota = numeronota;
	}
	public String getTipopagamento() {
		return tipopagamento;
	}
	public void setTipopagamento(String tipopagamento) {
		this.tipopagamento = tipopagamento;
	}
	public double getValor_frete() {
		return valor_frete;
	}
	public void setValor_frete(double valor_frete) {
		this.valor_frete = valor_frete;
	}
	public double getValor_desconto() {
		return valor_desconto;
	}
	public void setValor_desconto(double valor_desconto) {
		this.valor_desconto = valor_desconto;
	}
	public DestinatarioVenda getDestinatario() {
		return Destinatario;
	}
	public void setDestinatario(DestinatarioVenda destinatario) {
		Destinatario = destinatario;
	}
	public PagamentoVenda getPagamento() {
		return Pagamento;
	}
	public void setPagamento(PagamentoVenda pagamento) {
		Pagamento = pagamento;
	}
	
	
}
