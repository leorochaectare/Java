package String;

public class endsWithAndStartsWith {
	/*
	 * O método endsWith verifica se a String termina com o valor especificado, por outro
	 * lado o startsWith verifica se a String começa como o valor especificado. Sendo que o método
	 * startsWith tem duas variações.
	 * */
	
	public static void main(String[] args) {
		String valor = "DEV Java";
		
		System.out.println(valor.endsWith("Java")); //true
		System.out.println(valor.startsWith("DEV")); //true
		System.out.println(valor.startsWith("E", 1)); //true
	}
	
}
