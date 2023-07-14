package Others.java.objetos;

public class ObjetoTeste {
	private int id;
	private String nome;
	private boolean producao = false;
	
	public ObjetoTeste(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isProducao() {
		return producao;
	}

	public void setProducao(boolean producao) {
		this.producao = producao;
	}

	@Override
	public String toString() {
		return "ObjetoTeste [id=" + id + ", nome=" + nome + ", producao=" + producao + "]";
	}
	
	
	
	
	

}
