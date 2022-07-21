package Exercises;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
		 *  R�aumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as f�rmulas: F = C * 1.8 + 32; K = C + 273.15;
		 *   Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = celsius * 1.8;
		double kelvin = celsius + 237.15;
		double reaumur = celsius * 0.8;
		double rankine = celsius * 1.8 + 32 + 459.67;
		
		System.out.println("A temperatura em Fahrenheit: " + fahrenheit);
		System.out.println("A temperatura em Kelvin: " + kelvin);
		System.out.println("A temperatura em Reaumur: " + reaumur);
		System.out.println("A temperatura em Rankine: " + rankine);

		sc.close();
		
	}

}
