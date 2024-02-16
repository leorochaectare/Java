package Others.java.objetos;

public class DadosContaTeste {
	private int idancora;
	private String nomeAncora;
	private String codbanco;
	private String agencia;
	private String conta;
	private String digito;
	
	public DadosContaTeste(int idancora, String nomeAncora, String codbanco, String agencia, String conta, String digito) {
		this.idancora = idancora;
		this.codbanco = codbanco;
		this.agencia = agencia;
		this.conta = conta;
		this.digito = digito;
	}
	public int getIdancora() {
		return idancora;
	}
	public void setIdancora(int idancora) {
		this.idancora = idancora;
	}
	public String getCodbanco() {
		return codbanco;
	}
	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getDigito() {
		return digito;
	}
	public void setDigito(String digito) {
		this.digito = digito;
	}
	
	public String getNomeAncora() {
		return nomeAncora;
	}
	public void setNomeAncora(String nomeAncora) {
		this.nomeAncora = nomeAncora;
	}
	@Override
	public String toString() {
		return "DadosContaTeste [idancora=" + idancora + ", nomeAncora=" + nomeAncora + ", codbanco=" + codbanco
				+ ", agencia=" + agencia + ", conta=" + conta + ", digito=" + digito + "] \n";
	}
	
	
	

}
