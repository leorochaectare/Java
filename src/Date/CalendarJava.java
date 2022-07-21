package Date;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class CalendarJava {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d)); // 25/06/2018 12:42:07
		
		// Acrescentando 4 horas na data
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(d);
		cal.add(java.util.Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d)); // 25/06/2018 16:42:07
		
		// Obtendo uma unidade de tempo
		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		java.util.Calendar calendar = java.util.Calendar.getInstance();
		calendar.setTime(data);
		int minutes = calendar.get(java.util.Calendar.MINUTE);
		System.out.println("Minutes : " + minutes); // Minutes : 42
		int month = 1 + calendar.get(java.util.Calendar.MONTH); // O month começa com zero, então é necessário acrescentar + 1 para ficar com o mês correto.
		System.out.println("Month : " + month); // Month : 6
		
		// Verificando o dia da semana
		Date data_dia_semana = Date.from(Instant.parse("2022-12-25T15:42:42Z"));
		java.util.Calendar calendario = java.util.Calendar.getInstance();
		calendario.setTime(data_dia_semana);
		
		LocalDate dt1 = LocalDate.parse("2023-01-01");
		DayOfWeek dia_da_semana = DayOfWeek.from(dt1);
		System.out.println("Dia da semana: " + dia_da_semana); // SUNDAY
		
		
		
		int day_week = java.util.Calendar.DAY_OF_WEEK;
		System.out.println(day_week);
		
	}
}
