package MyDesignPatterns1;

import java.math.BigDecimal;

import MyDesignPatterns1.Strategy.imposto.CalculadoraDeImpostos;
import MyDesignPatterns1.Strategy.imposto.ICMS;
import MyDesignPatterns1.Strategy.imposto.ISS;
import MyDesignPatterns1.Strategy.orcamento.Orcamento;

public class TesteStrategy {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		System.out.println(calculadora.calcular(orcamento, new ISS()));
	}
}
