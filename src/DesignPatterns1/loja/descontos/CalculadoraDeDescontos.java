package DesignPatterns1.loja.descontos;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
 
    
    public BigDecimal calcular(Orcamento orcamento){
       Desconto desconto = new DescontoParaOrcamentoParaMaisDeCincoItens(
    		   new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
    				   new SemDesconto()));
        
        return desconto.calcular(orcamento);
    }
}
