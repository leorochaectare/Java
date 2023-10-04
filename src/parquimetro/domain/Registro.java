package parquimetro.domain;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Registro {
	
	private Long registroId;
	private PeriodoEstacionamento periodoEstacionamento;
	private Long duracaoDesejada;
	private FormaPagamento formaPagamento;
	private Veiculo veiculo;
	private Condutor condutor;
	private BigDecimal tarifaAplicada;
	private BigDecimal valorTotal;
	private LocalDateTime inicioRegistro;
	private LocalDateTime fimRegistro = null;
	
	public Registro() {
		
	}
	
	
	
	public Long getRegistroId() {
		return registroId;
	}

	public void setRegistroId(Long registroId) {
		this.registroId = registroId;
	}

	public PeriodoEstacionamento getPeriodoEstacionamento() {
		return periodoEstacionamento;
	}

	public void setPeriodoEstacionamento(PeriodoEstacionamento periodoEstacionamento) {
		this.periodoEstacionamento = periodoEstacionamento;
	}

	public Long getDuracaoDesejada() {
		return duracaoDesejada;
	}

	public void setDuracaoDesejada(Long duracaoDesejada) {
		this.duracaoDesejada = duracaoDesejada;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	public BigDecimal getTarifaAplicada() {
		return tarifaAplicada;
	}

	public void setTarifaAplicada(BigDecimal tarifaAplicada) {
		this.tarifaAplicada = tarifaAplicada;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDateTime getInicioRegistro() {
		return inicioRegistro;
	}

	public void setInicioRegistro(LocalDateTime inicioRegistro) {
		this.inicioRegistro = inicioRegistro;
	}
	
	

	public LocalDateTime getFimRegistro() {
		return fimRegistro;
	}

	public void setFimRegistro(LocalDateTime fimRegistro) {
		this.fimRegistro = fimRegistro;
	}
	
	public BigDecimal calculaValorTotal(PeriodoEstacionamento periodoEstacionamento) {
		Long duracaoAtual = periodoEstacionamento == PeriodoEstacionamento.FIXO ? this.duracaoDesejada : calculaQtdeHoras();
		return getTarifaAplicada().multiply(new BigDecimal(duracaoAtual));
	}
	
	public Long calculaQtdeHoras() {
		LocalDateTime duracaoAtual = this.fimRegistro == null ? LocalDateTime.now() : this.fimRegistro;
		return Duration.between(inicioRegistro, duracaoAtual).toHours();
	}

	@Override
	public String toString() {
		return "Registro [registroId=" + registroId + ", periodoEstacionamento=" + periodoEstacionamento
				+ ", duracaoDesejada=" + duracaoDesejada + ", formaPagamento=" + formaPagamento + ", veiculo=" + veiculo
				+ ", condutor=" + condutor + ", tarifaAplicada=" + tarifaAplicada + ", valorTotal=" + valorTotal
				+ ", inicioRegistro=" + inicioRegistro + ", fimRegistro=" + fimRegistro + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(registroId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		return Objects.equals(registroId, other.registroId);
	}
	
	

}
