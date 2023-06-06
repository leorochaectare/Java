package Others.java;

import java.text.DecimalFormat;

public class Teste {
	public static void main(String[] args) {
		double valorCotacao = 2222251.37;
		double valorArroba = 243.90;
		double sum = valorCotacao / valorArroba;
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		DecimalFormat dfValorTotal = new DecimalFormat("########0.00");
		
		System.out.println(df.format(sum));
		System.out.println(dfValorTotal.format(sum));
		
	}
}
