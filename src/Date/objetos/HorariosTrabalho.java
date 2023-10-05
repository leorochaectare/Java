package Date.objetos;

import java.time.LocalTime;

public class HorariosTrabalho {
	
	private LocalTime entrada;
	private LocalTime inicioAlmoco;
	private LocalTime fimAlmoco;
	private LocalTime saida;
	
	public HorariosTrabalho() {
		
	}
	
	public HorariosTrabalho(LocalTime entrada, LocalTime inicioAlmoco, LocalTime fimAlmoco, LocalTime saida) {
		this.entrada = entrada;
		this.inicioAlmoco = inicioAlmoco;
		this.fimAlmoco = fimAlmoco;
		this.saida = saida;
	}

	public LocalTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}

	public LocalTime getInicioAlmoco() {
		return inicioAlmoco;
	}

	public void setInicioAlmoco(LocalTime inicioAlmoco) {
		this.inicioAlmoco = inicioAlmoco;
	}

	public LocalTime getFimAlmoco() {
		return fimAlmoco;
	}

	public void setFimAlmoco(LocalTime fimAlmoco) {
		this.fimAlmoco = fimAlmoco;
	}

	public LocalTime getSaida() {
		return saida;
	}

	public void setSaida(LocalTime saida) {
		this.saida = saida;
	}

	@Override
	public String toString() {
		return "HorariosTrabalho [entrada=" + entrada + ", inicioAlmoco=" + inicioAlmoco + ", fimAlmoco=" + fimAlmoco
				+ ", saida=" + saida + "]";
	}
	
	
	
	
	

}
