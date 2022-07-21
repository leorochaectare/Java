package HackerrankLanguageJava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JavaDateAndTime {
	
	public static String findDay(int month, int day, int year) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formatter_day = day < 10 ? "0" +Integer.toString(day) : Integer.toString(day);
		String formatter_month = month < 10 ? "0" + Integer.toString(month) : Integer.toString(month);
		String data = formatter_month + "/" + formatter_day + "/" + Integer.toString(year);
		LocalDate dt = LocalDate.parse(data, formatter);
		DayOfWeek dia_da_semana = DayOfWeek.from(dt);
		
		return dia_da_semana.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(findDay(8,5,2015));
	}
}
