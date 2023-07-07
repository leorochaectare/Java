package Others.java.objetos;

import java.util.Objects;

public class Depoimento {
	private Long id;
	private String foto;
	private String depoimento;
	private String nome;
	
	public Depoimento() {
		
	}
	
	public Depoimento(Long id, String foto, String depoimento, String nome) {
		this.id = id;
		this.foto = foto;
		this.depoimento = depoimento;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDepoimento() {
		return depoimento;
	}

	public void setDepoimento(String depoimento) {
		this.depoimento = depoimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Depoimento [id=" + id + ", foto=" + foto + ", depoimento=" + depoimento + ", nome=" + nome + "]";
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
		Depoimento other = (Depoimento) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
