package Others.java.retornoObjeto;

public class TestaRetorno {
	
	public static Retorno sum(int a, int b) {
		Retorno retorno = new Retorno();
		retorno.setStatus(true);
		int soma = a + b;
		retorno.setResposta(soma);
		System.out.println(retorno.getStatus());
		System.out.println(retorno.getResposta());
		return retorno;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(sum(a, b));
	}
	
}
