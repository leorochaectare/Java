package Others.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teste {

	public static void main(String[] args) {

		String cnhFrente = "";
		String cnhVerso = null;
		String identidadeFrente = "";
		String identidadeVerso = null;
		String erros = "";

		if ((cnhFrente == null && cnhVerso == null) && (identidadeFrente == null && identidadeVerso == null)) {
			erros = "CNH frente e verso ou Identidade frente e verso são obrigatórios";
		}
		if ((cnhFrente == null || cnhVerso == null) && (identidadeFrente == null && identidadeVerso == null)) {
			erros = "CNH frente e verso são obrigatórios";
		}
		if ((cnhFrente == null && cnhVerso == null) && (identidadeFrente == null || identidadeVerso == null)) {
			erros = "Identidade frente e verso são obrigatórios";
		}
		if ((cnhFrente == null || cnhVerso == null) && (identidadeFrente == null || identidadeVerso == null)) {
			erros = "CNH frente e verso ou Identidade frente e verso são obrigatórios";
		}
		

		System.out.println(erros);

	}

}
