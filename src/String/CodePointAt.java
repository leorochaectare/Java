package String;

public class CodePointAt {
	
	// Retorna o valor UNICODE do caractere especifiacdo no index
	
	public static void main(String[] args) {
		String valor = "java";
		System.out.println(valor.codePointAt(0));
		
		String alfabeto = "AB";
		for(int i = 0; i < alfabeto.length(); i++) {
			if(alfabeto.codePointAt(i) == 65 || alfabeto.codePointAt(i) == 66)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}
