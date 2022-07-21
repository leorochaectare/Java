package EstuturaDeDadosAlura.Lista;

public class TestaLista {
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		System.out.println(lista);
		lista.adicionaNoComeco("mauricio");
		System.out.println(lista);
		lista.adicionaNoComeco("paulo");
		System.out.println(lista);
		lista.adicionaNoComeco("guilherme");
		System.out.println(lista);
		
		lista.adiciona("marcelo");
		System.out.println(lista);
		
		lista.adiciona(2, "gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.removeDoFim();
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		System.out.println(lista.contem("paulo"));
		System.out.println(lista.contem("seu madruga"));
		
		
		
	}
}
