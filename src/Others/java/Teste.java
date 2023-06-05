package Others.java;

import java.text.DecimalFormat;

public class Teste {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("########0.00");
		Double valor = 100000000000000000.01;
		
		System.out.println(df.format(valor));
	}
}
