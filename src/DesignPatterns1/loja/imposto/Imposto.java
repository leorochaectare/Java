package DesignPatterns1.loja.imposto;

import java.math.BigDecimal;

import DesignPatterns1.loja.orcamento.Orcamento;

public interface Imposto {
    
    BigDecimal calcular(Orcamento orcamento);

}
