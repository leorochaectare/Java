package Others.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import Others.java.objetos.NewAccountParams;

public class Teste {

	public static String retornaEstado(String state) {

		Map<String, String> estados = new HashMap<>();

		estados.put("AC", "0 - AC");
		estados.put("AL", "1 - AL");
		estados.put("AP", "2 - AP");
		estados.put("AM", "3 - AM");
		estados.put("BA", "4 - BA");
		estados.put("CE", "5 - CE");
		estados.put("DF", "6 - DF");
		estados.put("ES", "7 - ES");
		estados.put("GO", "8 - GO");
		estados.put("MA", "9 - MA");
		estados.put("MT", "10 - MT");
		estados.put("MS", "11 - MS");
		estados.put("MG", "12 - MG");
		estados.put("PA", "13 - PA");
		estados.put("PB", "14 - PB");
		estados.put("PR", "15 - PR");
		estados.put("PE", "16 - PE");
		estados.put("PI", "17 - PI");
		estados.put("RJ", "18 - RJ");
		estados.put("RN", "19 - RN");
		estados.put("RS", "20 - RS");
		estados.put("RO", "21 - RO");
		estados.put("RR", "22 - RR");
		estados.put("SC", "23 - SC");
		estados.put("SP", "24 - SP");
		estados.put("SE", "25 - SE");
		estados.put("TO", "26 - TO");
		
		return estados.get(state);
	}

	public static String tiraNulos(String texto) {
		System.out.println(texto == null ? "Realmente texto é nulo" : "Texto não é nulo");
		return texto == null ? "" : texto;
	}

	public static void main(String[] args) {
		
		String state = "RSA";
		
		System.out.println(state.toUpperCase());
		
		switch(state.toUpperCase()) {
		case "RS":
			System.out.println("RETORNOU RS");
			break;
		default:	
			System.out.println("Deu ruim");
			break;
		}

//		String erros = "";
//		NewAccountParams newAccountParams = new NewAccountParams();
//
//		newAccountParams.setNome("Teste");
//		newAccountParams.setTelefone(null);
//		newAccountParams.setCpf(null);
//		newAccountParams.setCnpj(null);
//		newAccountParams.setEmail(null);
//		newAccountParams.setDatanascimento(null);
//		newAccountParams.setUrlDocumentoFrente(null);
//		newAccountParams.setUrlDocumentoVerso(null);
//		newAccountParams.setUrlCnhFrente(null);
//		newAccountParams.setUrlCnhVerso(null);
//		newAccountParams.setUrlIdentidadeFrente(null);
//		newAccountParams.setUrlIdentidadeVerso(null);
//		newAccountParams.setUrlComprovanteResidencia(null);
//		newAccountParams.setNomemae(null);
//		newAccountParams.setAddressLine(null);
//		newAccountParams.setAddressLine2(null);
//		newAccountParams.setZipCode(null);
//		newAccountParams.setNeighborhood(null);
//		newAccountParams.setCityName(null);
//		newAccountParams.setState("AC");
//
//		newAccountParams.setAddressType(null);
//		newAccountParams.setComplement(null);
//		newAccountParams.setReference(null);
//		newAccountParams.setDataconstituicao(null);
//		newAccountParams.setResponsavelNome(null);
//		newAccountParams.setResponsavelCpf(null);
//		newAccountParams.setResponsavelEmail(null);
//		newAccountParams.setResponsavelDatanascimento(null);
//		newAccountParams.setResponsavelurlDocumentoFrente(null);
//		newAccountParams.setResponsavelurlDocumentoVerso(null);
//		newAccountParams.setResponsavelNomemae(null);
//		newAccountParams.setUrlCartaoCnpj(null);
//		newAccountParams.setUrlContratoSocial(null);
//		newAccountParams.setUrlFaturamentoAnual(null);
//		newAccountParams.setEscrow(null);
//		newAccountParams.setNacionalidade(null);
//		newAccountParams.setRendimentoMensal(null);
//		newAccountParams.setTipoEmpresa(null);
//		newAccountParams.setUfNascimento(null);
//		newAccountParams.setAgencia(null);
//
//		System.out.println(newAccountParams.getState());
		
		System.out.println(retornaEstado("ACB"));

	}
}