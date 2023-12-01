package Others.java;

import java.math.BigDecimal;

import Others.java.objetos.ContaCorrente;
import Others.java.objetos.Correntista;

public class BigDecimalExamples {
	public static void main(String[] args) {
		BigDecimal valor = BigDecimal.ZERO;
		System.out.println(valor);
		BigDecimal valor2 = new BigDecimal(0);
		BigDecimal valorSoma = new BigDecimal("10.00");
		
		System.out.println(valor == valor2);
		
		System.out.println(valor.getClass().getSimpleName());
		System.out.println(valor2.getClass().getSimpleName());
		
		BigDecimal soma = valor.add(valorSoma);
		System.out.println(soma);
		
		System.out.println("___________________________________________________________");
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setBanco("Nubank");
		contaCorrente.setAgencia("0001");
		contaCorrente.setNumero("123456");
		Correntista correntista = new Correntista("Seu Madruga", "123.123.777-56");
		contaCorrente.setCorrentista(correntista);
		System.out.println(contaCorrente);
		
		contaCorrente.deposito(new BigDecimal(10));
		
		System.out.println("SALDO: " + contaCorrente.getSaldo());
		
		contaCorrente.deposito(new BigDecimal(10));
		
		System.out.println("SALDO: " + contaCorrente.getSaldo());
		
		contaCorrente.saque(new BigDecimal(5));
		
		System.out.println("SALDO: " + contaCorrente.getSaldo());
		
		contaCorrente.deposito(new BigDecimal(10));
		
		System.out.println("SALDO: " + contaCorrente.getSaldo());
		
		contaCorrente.deposito(new BigDecimal(10.99));
		
		System.out.println("SALDO: " + contaCorrente.getSaldo());
		
		contaCorrente.saque(new BigDecimal(13.28));
		
		System.out.println("SALDO: " + contaCorrente.getSaldo());
		
		contaCorrente.saque(new BigDecimal(4.45));
		
		System.out.println("SALDO: " + contaCorrente.getSaldo());
		
//		contaCorrente.saque(new BigDecimal(40.45));
		
		
		
	}
}
