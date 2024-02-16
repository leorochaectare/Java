package Others.java;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;

import Others.java.objetos.DadosContaTeste;

public class Teste {
	
	public static void main(String[] args) {
		
		String dataString = "2023-01-01";
		
		LocalDate dataLocalDate = LocalDate.parse(dataString);
		
		if(dataLocalDate.isBefore(LocalDate.now())) {
			System.out.println("Data de vencimento não pode ser retroativa");
		}
		
		System.out.println(dataLocalDate);
		
		
		

		
	}
}
