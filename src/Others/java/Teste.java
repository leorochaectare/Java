package Others.java;

import java.time.LocalDateTime;

public class Teste {

	public static void main(String[] args) {

		String cnhFrente = "1";
		String cnhVerso = "1";
		String identidadeFrente = "";
		String identidadeVerso = "1";
		
		if((cnhFrente.isEmpty() || cnhVerso.isEmpty()) && (identidadeFrente.isEmpty() && identidadeVerso.isEmpty())) {
			System.out.println("Informar CNH fFrente e verso ou informar identidade frente e verso");
		} else if((cnhFrente.isEmpty() && cnhVerso.isEmpty()) && (identidadeFrente.isEmpty() || identidadeVerso.isEmpty())) {
			System.out.println("Informar CNH fFrente e verso ou informar identidade frente e verso");
		} else if((cnhFrente.isEmpty() || cnhVerso.isEmpty()) && (identidadeFrente.isEmpty() || identidadeVerso.isEmpty())) {
			System.out.println("Informar CNH fFrente e verso ou informar identidade frente e verso");
		} else {
			System.out.println("Documentos corretos");
		}
		
		
		LocalDateTime data = LocalDateTime.now();
		System.out.println(String.valueOf(data) instanceof String);
		
		
		
		
	}

}
