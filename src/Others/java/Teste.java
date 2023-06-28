package Others.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teste {

	public static void main(String[] args) {
		
		String valor = "123.123.777-56";
		
		 valor = valor.replaceAll("[^0-9]", "");
		 System.out.println(valor.length());
		

	}

}
