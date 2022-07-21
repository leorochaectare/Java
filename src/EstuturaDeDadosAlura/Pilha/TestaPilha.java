package EstuturaDeDadosAlura.Pilha;

import java.util.Stack;

public class TestaPilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push("Mauricio");
		System.out.println(pilha);
		
		pilha.push("Guilherme");
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazia());
		pilha.push("Marcelo");
		System.out.println(pilha.vazia());
		
		System.out.println(pilha);
		
		Stack<String> stack = new Stack<String>();
		stack.push("Mauricio");
		stack.push("Marcelo");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		// peek - informa qual o último elemento da pilha
		String nome = stack.peek();
		System.out.println(nome);
		
		System.out.println(stack);
		
	}
}
