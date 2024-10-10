package Date.objetos;

import java.time.LocalTime;

public class RetornoHorariosTrabalhados {

	private LocalTime periodoHorarioAlmoco;
	private LocalTime periodoTotal;
	private LocalTime periodoTrabalhado;
	private LocalTime cargaHoraria = LocalTime.of(8, 00);
	
	public RetornoHorariosTrabalhados() {
		
	}

	public RetornoHorariosTrabalhados(LocalTime periodoHorarioAlmoco, LocalTime periodoTotal,
			LocalTime periodoTrabalhado) {
		super();
		this.periodoHorarioAlmoco = periodoHorarioAlmoco;
		this.periodoTotal = periodoTotal;
		this.periodoTrabalhado = periodoTrabalhado;
	}

	public LocalTime getPeriodoHorarioAlmoco() {
		return periodoHorarioAlmoco;
	}

	public void setPeriodoHorarioAlmoco(LocalTime periodoHorarioAlmoco) {
		this.periodoHorarioAlmoco = periodoHorarioAlmoco;
	}

	public LocalTime getPeriodoTotal() {
		return periodoTotal;
	}

	public void setPeriodoTotal(LocalTime periodoTotal) {
		this.periodoTotal = periodoTotal;
	}

	public LocalTime getPeriodoTrabalhado() {
		return periodoTrabalhado;
	}

	public void setPeriodoTrabalhado(LocalTime periodoTrabalhado) {
		this.periodoTrabalhado = periodoTrabalhado;
	}

	@Override
	public String toString() {
		return "RetornoHorariosTrabalhados \n[periodoHorarioAlmoco=" + periodoHorarioAlmoco + ", periodoTotal="
				+ periodoTotal + ", periodoTrabalhado=" + periodoTrabalhado + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
	
	
	
}
