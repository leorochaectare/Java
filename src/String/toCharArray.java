package String;

public class toCharArray {
	/*
	 * Converte uma String em um Array de char, ou seja, uma String de 10 posições irá
	 * ser convertida em um vetor char[] de 10 posições.
	 * */
	
	public static void main(String[] args) {
		String valor = "Java";
		
		for(char c : valor.toCharArray()) {
			System.out.println("Char: " + c);
		}
	}
}
