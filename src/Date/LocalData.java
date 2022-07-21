package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalData {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("08/05/2022", formatter);
		
		System.out.println(date);
	}
}
