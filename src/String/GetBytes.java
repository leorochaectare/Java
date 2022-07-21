package String;

public class GetBytes {
	/*
	 * Converte a String em um vetor de byte[]. Este método é muito útil principalmente
	 * quando precisamos salvar caracteres no banco desconsiderando a codificação atual. 
	 * */
	
	public static void main(String[] args) {
		String valor = "java";
		
		for(byte b : valor.getBytes()) {
			System.out.println("byte: " + b);
		}
	}
}
