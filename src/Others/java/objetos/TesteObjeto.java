package Others.java.objetos;

import java.util.Objects;

public class TesteObjeto {
	private int id;
	private String nome;
	private boolean producao = true;
	
	public TesteObjeto(int id, String nome) {
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
	
	public boolean getProducao() {
		return producao;
	}

	@Override
	public String toString() {
		return "TesteObjeto [id=" + id + ", nome=" + nome + ", producao=" + producao + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TesteObjeto other = (TesteObjeto) obj;
		return id == other.id;
	}
	
	
	
	
}
