package Regex;

public class ReplacePontoPorVirgula {
	public static void main(String[] args) {
		String valor = "10.00";
		valor = valor.replaceAll("\\.", ",");
		
		
		System.out.println(valor);
	}
}
