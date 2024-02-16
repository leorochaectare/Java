package Date;

import java.time.Duration;
import java.time.LocalTime;

import Date.objetos.HorariosTrabalho;
import Date.objetos.RetornoHorariosTrabalhados;

public class CalculaHorasTrabalhadas {
	
	final static int minutosHora = 60;
	
	public static RetornoHorariosTrabalhados horasTrabalhadas(HorariosTrabalho horariosTrabalho) {
		
		RetornoHorariosTrabalhados retornoHorariosTrabalhados = new RetornoHorariosTrabalhados();
		
		Duration duracaoInicioAlmocoFimAlmoco = Duration.between(horariosTrabalho.getInicioAlmoco(), horariosTrabalho.getFimAlmoco());
		long minutosTotaisPeriodoAlmoco = duracaoInicioAlmocoFimAlmoco.toMinutes();
		long horasPeriodoAlmoco = minutosTotaisPeriodoAlmoco / minutosHora;
		long minutosPeriodoAlmoco = minutosTotaisPeriodoAlmoco % minutosHora;
		
		
		Duration duracaoEntradaSaida = Duration.between(horariosTrabalho.getEntrada(), horariosTrabalho.getSaida());
		long minutosTotais = duracaoEntradaSaida.toMinutes();
		long horas = minutosTotais / minutosHora;
		long minutos = minutosTotais % minutosHora;
		
		long minutosFinais = minutosTotais - minutosTotaisPeriodoAlmoco;
		long horasTrabalhadas = minutosFinais / minutosHora;
		long minutosTrabalhados = minutosFinais % minutosHora;		
		
		retornoHorariosTrabalhados.setPeriodoHorarioAlmoco(LocalTime.of((int) horasPeriodoAlmoco,(int) minutosPeriodoAlmoco));
		retornoHorariosTrabalhados.setPeriodoTotal(LocalTime.of((int) horas,(int) minutos));
		retornoHorariosTrabalhados.setPeriodoTrabalhado(LocalTime.of((int) horasTrabalhadas,(int) minutosTrabalhados));
		return retornoHorariosTrabalhados;
	}
	
	
	
	public static void main(String[] args) {
		final int horaEntrada = 7;
		final int minutoEntrada = 45;
		
		final int horaInicioAlmoco = 12;
		final int minutoInicioAlmoco = 58;
		
		final int horaFimAlmoco = 13;
		final int minutoFimAlmoco = 27;
		
		final int horaSaida = 17;
		final int minutoSaida = 00;
		
		LocalTime entrada = LocalTime.of(horaEntrada, minutoEntrada);
		LocalTime inicioAlmoco = LocalTime.of(horaInicioAlmoco, minutoInicioAlmoco);
		LocalTime fimAlmoco = LocalTime.of(horaFimAlmoco, minutoFimAlmoco);
		LocalTime saida = LocalTime.of(horaSaida, minutoSaida);
		HorariosTrabalho horariosTrabalho = new HorariosTrabalho(entrada, inicioAlmoco, fimAlmoco, saida);
		System.out.println(horasTrabalhadas(horariosTrabalho));
	}
}
