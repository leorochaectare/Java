package Date;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getYear());

		LocalDate birthDate = LocalDate.of(1998, Month.MARCH, 18);
		System.out.println(birthDate);

		LocalDate teste = LocalDate.of(1998, 3, 18);
		System.out.println(teste);
		
		LocalDate teste2 = LocalDate.parse("1998-03-18");
		System.out.println(teste2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("08/05/2022", formatter);
		System.out.println(date);
	}
}
