package DesignPatterns1.loja;

import java.math.BigDecimal;

import DesignPatterns1.loja.imposto.CalculadoraDeImpostos;
import DesignPatterns1.loja.imposto.ICMS;
import DesignPatterns1.loja.orcamento.Orcamento;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
