package Others.java.objetos;

public class Correntista {
	private String cpf;
	private String nome;
	
	public Correntista(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
}
