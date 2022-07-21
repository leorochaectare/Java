package String;

public class CompareToAndCompareToIgnoreCase {
	/*
	 * Ambos fazem comparação de duas Strings, sendo que o primeiro (compareTo) considera
	 * letras maiusculas e minúsculas na comparação já o segundo ignora qualquer diferença
	 * de minuscula ou maiscula. Ambos também retornam a quantidade de diferenças, sendo que
	 * nos importa saber, no momento, que quando o retorno for igual a zero significa que não 
	 * há diferenças entre a String.
	 * */
	
	public static void main(String[] args) {
		String valor = "Java";
		
		System.out.println(valor.compareTo("Java") == 0 ? true : false); // true
		System.out.println(valor.compareTo("java") == 0 ? true : false); // false
		System.out.println(valor.compareToIgnoreCase("Java") == 0 ? true : false); // true
		
	}
}
