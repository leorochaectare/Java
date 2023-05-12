package Others.java;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


import Others.java.objetos.ContaCorrente;
import Others.java.objetos.Correntista;

public class OptionalTeste {
	
	public static void main(String[] args) {
		Correntista correntista = new Correntista("123.123.777-56", "Seu Madruga");
		ContaCorrente contaCorrente = new ContaCorrente("333", "44444", "123456", correntista);
		
		Set<ContaCorrente> contas = new HashSet<>();
		contas.add(contaCorrente);
		
		String banco = "333";
		String agencia = "44444";
		String numero = "1234567";
		
		
		Optional<ContaCorrente> buscar = contas.stream()
				.filter(conta -> conta.identificadaPor(banco, agencia, numero))
                .findFirst();
		
//		System.out.println(contas);
		System.out.println(buscar);
		
		if(buscar.isEmpty()) {
			System.out.println("Essa porra está vazia");
		} else {
			System.out.println("Essa porra não está vazia");
		}
	}
}
