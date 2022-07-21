package EstuturaDeDadosAlura;

public class TestaArray {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");
		Aluno a3 = new Aluno("Teste");
		
		
		Array lista = new Array();
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista.contem(a1)); // true
		System.out.println(lista.contem(a3)); // false
		
		
		System.out.println(lista);
		
//		Aluno x = lista.pega(158);
//		System.out.println(x); // Posicao Invalida
		
		lista.adiciona(1, a3);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		for(int i = 0; i < 300; i++) {
			Aluno y = new Aluno("Joao" + i);
			lista.adiciona(y);
		}
		
		System.out.println(lista);
		
		
	}
}
