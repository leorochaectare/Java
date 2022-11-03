package solid.rh.service;

import java.math.BigDecimal;

import solid.rh.model.Cargo;
import solid.rh.model.Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario("Leonardo Rocha", "135.694.866-99", 
				Cargo.ANALISTA, new BigDecimal("10000.00"));
		
		System.out.println(func);
	}
}
