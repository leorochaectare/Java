package parquimetro.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Condutor {
	
	private Long condutorId;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private FormaPagamento formaPagamento;
	private Endereco endereco;
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public Condutor() {
		
	}

	public Long getCondutorId() {
		return condutorId;
	}

	public void setCondutorId(Long condutorId) {
		this.condutorId = condutorId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> listaVeiculos) {
		this.veiculos = listaVeiculos;
	}

	@Override
	public String toString() {
		return "Condutor [condutorId=" + condutorId + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", email=" + email + ", formaPagamento=" + formaPagamento + ", endereco=" + endereco + ", veiculos="
				+ veiculos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(condutorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Condutor other = (Condutor) obj;
		return Objects.equals(condutorId, other.condutorId);
	}
	
	

}
