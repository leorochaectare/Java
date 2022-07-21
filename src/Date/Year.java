package Date;

import java.time.LocalDate;

public class Year {
	public static void main(String[] args) {
		LocalDate dateNow = LocalDate.now();
		System.out.println("Date Now: " + dateNow);
		
		int yearActually = dateNow.getYear();
		System.out.println("Year Actually: " + yearActually);
	}
}
