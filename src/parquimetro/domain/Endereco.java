package parquimetro.domain;

import java.util.Objects;

public class Endereco {
	
	private Long enderecoId;
	private String logradouro;
	private String bairro;
	private String complemento;
	private String cep;
	private String municipio;
	private String numero;
	
	
	public Endereco() {
		
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	@Override
	public String toString() {
		return "Endereco [enderecoId=" + enderecoId + ", logradouro=" + logradouro + ", bairro=" + bairro
				+ ", complemento=" + complemento + ", cep=" + cep + ", municipio=" + municipio + ", numero=" + numero
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(enderecoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(enderecoId, other.enderecoId);
	}
	
	

}
