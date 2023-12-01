package parquimetro.domain;

import java.util.Objects;

public class Veiculo {
	
	private Long veiculoId;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private String placa;
	
	public Veiculo() {
		
	}

	public Long getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(Long veiculoId) {
		this.veiculoId = veiculoId;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Veiculo [veiculoId=" + veiculoId + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao="
				+ anoFabricacao + ", placa=" + placa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(veiculoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(veiculoId, other.veiculoId);
	}
	
	

}
