package DesignPatterns1.loja.imposto;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    
    }

}
