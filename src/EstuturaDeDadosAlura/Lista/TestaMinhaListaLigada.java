package EstuturaDeDadosAlura.Lista;

public class TestaMinhaListaLigada {
	public static void main(String[] args) {
		MinhaListaLigada lista = new MinhaListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("leonardo");
		System.out.println(lista);
		lista.adicionaNoComeco("seu madruga");
		System.out.println(lista);
		lista.adicionaNoComeco("chaves");
		System.out.println(lista);
		
		lista.adiciona("dona florinda");
		System.out.println(lista);
		lista.adiciona("professor girafales");
		System.out.println(lista);
		
		lista.adiciona(2, "quico");
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
		
		System.out.println(lista.pega(2));
		
		lista.removeDoComeco();
		System.out.println(lista);
		
	}
}
