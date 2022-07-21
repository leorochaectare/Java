package Date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayWeek {
	public static void main(String[] args) {
		// Buscando o dia da semana a partir de uma data passada
		LocalDate dt1 = LocalDate.parse("2023-01-01");
		DayOfWeek dia_semana = DayOfWeek.from(dt1);
		System.out.println("Dia da semana: " + dia_semana); // Sunday
		
		//Buscando dia da semana atual
		java.util.Calendar now = java.util.Calendar.getInstance();
		System.out.println(now.get(java.util.Calendar.DAY_OF_WEEK)); //1
	}
}
