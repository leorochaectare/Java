package Others.java;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Teste {
	public static void main(String[] args) {
		
		LocalTime inicioAlmoco = LocalTime.of(13, 00);
		LocalTime fimAlmoco = LocalTime.of(13, 30);
		Duration duracaoInicioAlmocoFimAlmoco = Duration.between(inicioAlmoco, fimAlmoco);
		long minutosTotaisPeriodoAlmoco = duracaoInicioAlmocoFimAlmoco.toMinutes();
		long horasPeriodoAlmoco = minutosTotaisPeriodoAlmoco / 60;
		long minutosPeriodoAlmoco = minutosTotaisPeriodoAlmoco % 60;
		
		System.out.println("HORAS PERIODO ALMOÇO: " + horasPeriodoAlmoco);
		System.out.println("MINUTOS PERIODO ALMOÇO: " + minutosPeriodoAlmoco);
		
		LocalTime entrada = LocalTime.of(8, 00);
		LocalTime saida = LocalTime.of(17, 18);
		Duration duracaoEntradaSaida = Duration.between(entrada, saida);
		long minutosTotais = duracaoEntradaSaida.toMinutes();
		long horas = minutosTotais / 60;
		long minutos = minutosTotais % 60;
		
		
		System.out.println("HORAS: " + horas);
		System.out.println("MINUTOS: " + minutos);
		
		long minutosFinais = minutosTotais - minutosTotaisPeriodoAlmoco;
		long horasTrabalhadas = minutosFinais / 60;
		long minutosTrabalhados = minutosFinais % 60;		
		
		System.out.println("HORAS TRABALHADAS: " + horasTrabalhadas);
		System.out.println("MINUTOS TRABALHADAS: " + minutosTrabalhados);
		
		System.out.println(500 % 60);
		
		
		
		
		
		
		
	}
}