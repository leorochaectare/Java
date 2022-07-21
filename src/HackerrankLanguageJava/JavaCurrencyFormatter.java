package HackerrankLanguageJava;

import java.text.NumberFormat;
import java.util.Locale;
//import java.util.Scanner;

public class JavaCurrencyFormatter {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		double payment = scanner.nextDouble();
//		scanner.close();
		
		Locale locale = new Locale("en", "in");
		
		double payment = 12324.134;
		
		NumberFormat formatter_us = NumberFormat.getCurrencyInstance(Locale.US);
		String us = formatter_us.format(payment);
		NumberFormat formatter_india = NumberFormat.getCurrencyInstance(locale);
		String india = formatter_india.format(payment);
		NumberFormat formatter_china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = formatter_china.format(payment);
		NumberFormat formatter_france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = formatter_france.format(payment);
		
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: "  + china);
		System.out.println("France: " + france);
		
		
	}
}
