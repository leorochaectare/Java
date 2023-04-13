package String;

public class RemovendoEspacos {
	
	public static String pegarPrimeiraPalavra(String texto) {
	    if (texto == null) {
	        return null;
	    }
	    texto = texto.trim();
	    int posicaoEspaco = texto.indexOf(' ');
	    if (posicaoEspaco == -1) {
	        return texto;
	    } else {
	        return texto.substring(0, posicaoEspaco);
	    }
	}
	
	public static void main(String[] args) {
		System.out.println(pegarPrimeiraPalavra("Leonardo Rocha"));
		System.out.println(pegarPrimeiraPalavra("   Leonardo    Rocha"));
	}
}
