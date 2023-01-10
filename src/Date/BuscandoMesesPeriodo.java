package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class BuscandoMesesPeriodo {
	public static void main(String[] args) throws ParseException {
		String data_inicio = "2022-11-01";
		String data_fim = "2023-12-30";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date data_inicio_formatada = formatter.parse(data_inicio);
		Date data_fim_formatada = formatter.parse(data_fim);
		
		int resultado = 0;
		
		int mes_inicio = Integer.parseInt(data_inicio.substring(5,7));
		int mes_fim = Integer.parseInt(data_fim.substring(5,7));
		
//		System.out.println(mes_inicio);
//		System.out.println(mes_fim);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		
		
		while(mes_inicio != mes_fim) {
			mes_inicio++;
		}
		
		System.out.println("Resultado: " + resultado);
		
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date data_inicio_formatada = formatter.parse(data_inicio);
//		Date data_fim_formatada = formatter.parse(data_fim);
//		
//		LocalDate date1 = LocalDate.parse(data_inicio, dtf);
//		LocalDate date2 = LocalDate.parse(data_fim, dtf);
////		long mesBetween = Duration.between(date1, date2).toDays();
////		System.out.println(mesBetween);
//		
//		
//		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
//        df.setLenient(false);
//        Date d1 = df.parse ("01/12/2022");
//        System.out.println (d1);
//        Date d2 = df.parse ("30/12/2022");
//        System.out.println (d2);
//        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
//        System.out.println (dt / 86400000L); // passaram-se 67111 dias
    }
}
