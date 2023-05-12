package Others.java;

import java.math.BigDecimal;

public class BigDecimalExamples {
	public static void main(String[] args) {
		BigDecimal valor = BigDecimal.ZERO;
		System.out.println(valor);
		BigDecimal valor2 = new BigDecimal(0);
		BigDecimal valorSoma = new BigDecimal("10.00");
		
		System.out.println(valor == valor2);
		
		System.out.println(valor.getClass().getSimpleName());
		System.out.println(valor2.getClass().getSimpleName());
		
		BigDecimal soma = valor.add(valorSoma);
		System.out.println(soma);
		
		
		
	}
}
