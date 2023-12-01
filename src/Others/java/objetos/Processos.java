package Others.java.objetos;

public class Processos {
	private String descricao;
	private String nomeBanco;
	
	public Processos() {
		
	}
	
	public Processos(String descricao, String nomeBanco) {
		this.descricao = descricao;
		this.nomeBanco = nomeBanco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	@Override
	public String toString() {
		return "Processos [descricao=" + descricao + ", nomeBanco=" + nomeBanco + "]";
	}
	
	
	
	
}
