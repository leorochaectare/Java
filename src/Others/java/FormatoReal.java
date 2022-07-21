package Others.java;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatoReal {
	public static void main(String[] args) {
		double valor = 1118.50;
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String format = formatter.format(valor);
		
		System.out.println(format); //R$ 1.118,50
	}
}
