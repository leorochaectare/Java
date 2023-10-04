package Date;

import java.time.Duration;
import java.time.LocalTime;

public class CalculaHorasTrabalhadas {
	public static void main(String[] args) {
		
		final int minutosHora = 60;
		
		final int horaEntrada = 8;
		final int minutoEntrada = 11;
		
		final int horaInicioAlmoco = 12;
		final int minutoInicioAlmoco = 58;
		
		final int horaFimAlmoco = 13;
		final int minutoFimAlmoco = 21;
		
		final int horaSaida = 18;
		final int minutoSaida = 07;
		
		LocalTime inicioAlmoco = LocalTime.of(horaInicioAlmoco, minutoInicioAlmoco);
		LocalTime fimAlmoco = LocalTime.of(horaFimAlmoco, minutoFimAlmoco);
		Duration duracaoInicioAlmocoFimAlmoco = Duration.between(inicioAlmoco, fimAlmoco);
		long minutosTotaisPeriodoAlmoco = duracaoInicioAlmocoFimAlmoco.toMinutes();
		long horasPeriodoAlmoco = minutosTotaisPeriodoAlmoco / minutosHora;
		long minutosPeriodoAlmoco = minutosTotaisPeriodoAlmoco % minutosHora;
		
		System.out.println("HORAS PERIODO ALMOÇO: " + horasPeriodoAlmoco);
		System.out.println("MINUTOS PERIODO ALMOÇO: " + minutosPeriodoAlmoco);
		
		LocalTime entrada = LocalTime.of(horaEntrada, minutoEntrada);
		LocalTime saida = LocalTime.of(horaSaida, minutoSaida);
		Duration duracaoEntradaSaida = Duration.between(entrada, saida);
		long minutosTotais = duracaoEntradaSaida.toMinutes();
		long horas = minutosTotais / minutosHora;
		long minutos = minutosTotais % minutosHora;
		
		System.out.println("HORAS: " + horas);
		System.out.println("MINUTOS: " + minutos);
		
		long minutosFinais = minutosTotais - minutosTotaisPeriodoAlmoco;
		long horasTrabalhadas = minutosFinais / minutosHora;
		long minutosTrabalhados = minutosFinais % minutosHora;		
		
		System.out.println("HORAS TRABALHADAS: " + horasTrabalhadas);
		System.out.println("MINUTOS TRABALHADAS: " + minutosTrabalhados);
	}
}
