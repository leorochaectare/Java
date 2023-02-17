package Others.java;

import java.text.Normalizer;

public class TirarAcentuacao {
	
	public static String tiraAcentuacao(String valor) {
		valor =  Normalizer.normalize(valor, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		valor = valor.replaceAll("[^a-zA-Z0-9 ]", "");
		return valor.trim();
	}
	
	public static void main(String[] args) {
		String nome = "Você tem acentuação mesmo né ?";
		
		System.out.println(tiraAcentuacao(nome));
	}
}
