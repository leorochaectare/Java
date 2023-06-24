package Others.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teste {

	public static void main(String[] args) {
		
		var valueTotal = new BigDecimal("5000.00");
		var installments = 6;
		
		var result = valueTotal.divide(BigDecimal.valueOf(installments), 2, RoundingMode.HALF_UP);
		
		System.out.println(result.multiply(BigDecimal.valueOf(installments)));
		
		

	}

}
