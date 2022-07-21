package Classes.Contas;

import java.util.LinkedList;

public class TestaContas {
	
	public static String qtde_accounts(LinkedList<Contas> accounts) {
		return "Existem no momento " + accounts.size() + " contas em aberto." ;
	}
	
	public static void main(String[] args) {
		LinkedList<Contas> list_accounts = new LinkedList<>();
		Contas pessoa1 = new ContaPessoaFisica(1,"Seu Madruga", 18035, 6, 200.00, "12345678899", true, 10000.00);
		Contas pessoa2 = new ContaPessoaFisica();
		Contas pessoa3 = new ContaPessoaJuridica(1,"Seu Madruga", 18035, 6, 200.00, "123456799-000", false, 0.00);
		list_accounts.add(pessoa1);
		list_accounts.add(pessoa2);
		list_accounts.add(pessoa3);
		pessoa2.setId(1);
		pessoa2.setNome("Chaves");
		pessoa2.setNumero_conta(102030);
		pessoa2.setDv(4);
		pessoa2.setSaldo(100.00);
		
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		
		pessoa1.sacar(100.00);
		pessoa1.mostrarSaldo();
		pessoa1.depositar(200.00);
		pessoa1.mostrarSaldo();
		
		pessoa3.depositar(200.00);
		pessoa3.mostrarSaldo();
		pessoa3.sacar(100.00);
		pessoa3.mostrarSaldo();
		
		System.out.println(pessoa1.solicitaEmprestimo(5000.00));
		System.out.println(pessoa1.solicitaEmprestimo(6000.00));
		pessoa3.statusEmprestimo();
		pessoa1.statusEmprestimo();
		pessoa1.limiteEmprestimo();
		
		System.out.println(qtde_accounts(list_accounts));
		
		
		
		
	}
}
