package Others.java;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import Others.java.objetos.Documents;
import Others.java.objetos.FormatoDocumento;
import Others.java.objetos.ResendDocuments;
import Others.java.objetos.TipoDocumento;


public class Teste {
	
	private static Map<Integer, TipoDocumento> files = new HashMap<Integer, TipoDocumento>();
	
	public static void retornaArquivosEctare() {
	    
		files.put(44, TipoDocumento.IDENTIDADE_FRENTE);
		files.put(45, TipoDocumento.IDENTIDADE_VERSO);
		files.put(2, TipoDocumento.COMPROVANTE_RESIDENCIA);
		files.put(42, TipoDocumento.CNH_FRENTE);
	    files.put(43, TipoDocumento.CNH_VERSO);
	    files.put(7, TipoDocumento.COMPROVANTE_RESIDENCIA);
	    files.put(28, TipoDocumento.CNPJ);
	    files.put(8, TipoDocumento.CONTRATO_SOCIAL);
	  }

	public static String tirarNulos(String valor) {
		return "";
	}

	public static FormatoDocumento retornaFormatoDoDocumento(String url) {

		if (url.contains(".pdf")) {
			return FormatoDocumento.PDF;
		} else if (url.contains(".jpg")) {
			return FormatoDocumento.JPG;
		} else if (url.contains(".jpeg")) {
			return FormatoDocumento.JPEG;
		} else if (url.contains(".png")) {
			return FormatoDocumento.PNG;
		}

		return null;

	}
	
	 public static TipoDocumento retornaTipoDeDocumento(int idtipodocumento) {

		    int identidadeFrente = 44;
		    int identidadeVerso = 45;
		    int comprovanteResidenciaPF = 2;
		    int cnhFrente = 42;
		    int cnhVerso = 43;
		    int comprovanteResidenciaPJ = 7;
		    int cnpj = 28;
		    int contratoSocial = 8;
		    
		    retornaArquivosEctare();
		    
		    
		    System.out.println(files.containsKey(1));

		    if (idtipodocumento == identidadeFrente) {
		      return TipoDocumento.IDENTIDADE_FRENTE;
		    } else if (idtipodocumento == identidadeVerso) {
		      return TipoDocumento.IDENTIDADE_VERSO;
		    } else if (idtipodocumento == comprovanteResidenciaPF || idtipodocumento == comprovanteResidenciaPJ) {
		      return TipoDocumento.COMPROVANTE_RESIDENCIA;
		    } else if (idtipodocumento == cnhFrente) {
		      return TipoDocumento.CNH_FRENTE;
		    } else if (idtipodocumento == cnhVerso) {
		      return TipoDocumento.CNH_VERSO;
		    } else if (idtipodocumento == cnpj) {
		      return TipoDocumento.CNPJ;
		    } else if (idtipodocumento == contratoSocial) {
		      return TipoDocumento.CONTRATO_SOCIAL;
		    }

		    return null;

		  }

	public static void main(String[] args) {

//		Map<String, Integer> mapa = new HashMap<String, Integer>();
//		mapa.put("um", 1);
//		mapa.put("dois", 2);
//		mapa.put("tres", 3);
//		
//		Set<Map.Entry<String, Integer>> entradas = mapa.entrySet();
//		
//		System.out.println(entradas);
//		
//		for (Map.Entry<String, Integer> entrada : entradas) {
//            String chave = entrada.getKey();
//            Integer valor = entrada.getValue();
//            System.out.println("Chave: " + chave + ", Valor: " + valor);
//        }

		ResendDocuments resendDocuments = new ResendDocuments();
		resendDocuments.setCpfcnpj("123.123.777-56");
		Documents cnhFrente = new Documents();
		cnhFrente.setDocumentFile("teste");
		cnhFrente.setDocumentFormat(FormatoDocumento.PDF);
		cnhFrente.setDocumentName("CNH FRENTE");
		cnhFrente.setTipoDocumento(TipoDocumento.CNH_FRENTE);
		cnhFrente.setDescription(".png");
		cnhFrente.setExpirationDate("2023-08-08");
		cnhFrente.setDocumentKey("");
		resendDocuments.getListaDocumentos().add(cnhFrente);

		retornaArquivosEctare();
		System.out.println(files);
		
//		Optional<String> documentoCnhFrenteOptional = resendDocuments.getListaDocumentos().stream()
//			    .filter(documento -> documento.getTipoDocumento().equals(TipoDocumento.CNH_FRENTE))
//			    .map(Documents::getDocumentFile) 
//			    .findFirst();

//		String documentoCnhFrente = tirarNulos(resendDocuments.getListaDocumentos().stream()
//			    .filter(documento -> TipoDocumento.CNH_FRENTE.equals(documento.getTipoDocumento()))
//			    .map(Documents::getDocumentFile) 
//			    .findFirst().orElse(null));

//		LocalDateTime entrada = LocalDateTime.of(2023, 10, 03, 7, 0);
//		LocalDateTime saida = LocalDateTime.of(2023, 10, 03, 10, 0);
//		Duration diferencaEntradaSaida = Duration.between(entrada, saida);
//		
//		System.out.println(diferencaEntradaSaida.toHours());

		System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now()).toHours());

		LocalDateTime dataTeste = null;

		System.out.println(dataTeste == null);
		
		
		
		String url = "boletagem.png";
		
		System.out.println(retornaFormatoDoDocumento(url));
		
		retornaTipoDeDocumento(1);
		

//		Double valorfinal = 0.0;
//
//		Double taxa = 1.95;
//		Double valor = 400000.0;
//		
//		LocalDate dataEmissao = LocalDate.of(2023, 9, 15);
//		LocalDate dataVencimento = LocalDate.of(2024, 5, 31);
//		
//		long diferencaEmDias = ChronoUnit.DAYS.between(dataEmissao, dataVencimento);
//
//		
//		System.out.println(diferencaEmDias);
//		
//		int qtdeDias = (int) diferencaEmDias;
//		
//
//			double present_v = valor;
//			double future_v = present_v * (1 + (taxa / 100));
//			System.out.println("Future: " + future_v);
//			double juros_diario = Math.pow((future_v / present_v), (1.0 / 30)) - 1;
//			System.out.println("Juros diário: " + juros_diario);
//			double novo_valor = present_v;
//			int dias_acrescentar_juros = qtdeDias;
//			System.out.println(dias_acrescentar_juros);
//			for (int i = 0; i < dias_acrescentar_juros; i++) {
//				novo_valor = ((juros_diario + 1) * novo_valor);
//
//			}
//
//			valorfinal = novo_valor;
//			
//			System.out.println(valorfinal);
//			
//			
//			Double valor_final_cprf = 472573.91364170803;
//			Double cotacao = 140.59406;
//			
//			System.out.println(valor_final_cprf / cotacao);
//			
//			System.out.println("___________________________________________________________");
//			
//			System.out.println((valor_final_cprf/70)*100);

//			Double valorFinal = 472573.91364170803;
//			Double precoProduto = 141.29375344335321501396272222255;
//			
//			Double quantidade = valorFinal / precoProduto;
//			
//			System.out.println("RESULTADO DOUBLE COM TODAS AS CASAS DECIMAIS: " + quantidade); // 3344.62
//			
//			Double valorFinalArredondando = 472573.91;
//			Double precoProdutoArredondando = 141.2937;
//			
//			Double quantidadeArredondando = valorFinalArredondando / precoProdutoArredondando;
//			
//			System.out.println("RESULTADO DOUBLE SOMENTE COM DUAS CASAS DECIMAIS: " +quantidadeArredondando); // 3344.708825819237
//			
//			DecimalFormat decimalFormat = new DecimalFormat(".##");
//			System.out.println(Double.valueOf(decimalFormat.format(valorFinal).replaceAll(",", ".")));
//			
//			BigDecimal valorFinalBigDecimal = new BigDecimal(valorFinalArredondando);
//			BigDecimal precoProdutoBigDecimal = new BigDecimal(precoProdutoArredondando);
//			
//			BigDecimal quantidadeBigDecimal = valorFinalBigDecimal.divide(precoProdutoBigDecimal,2, RoundingMode.HALF_UP); 
//			
//			System.out.println("RESULTADO BIGDECIMAL: " + quantidadeBigDecimal); // 3344.62
//			
//			BigDecimal valorNominal = quantidadeBigDecimal.multiply(precoProdutoBigDecimal);
//			
//			System.out.println("VALOR NOMINAL: " + valorNominal);
//			
//			DecimalFormat decimalFormat4casas = new DecimalFormat("###,##0.0000");
//			
//			System.out.println(decimalFormat4casas.format(precoProdutoArredondando));
//		
//		Boolean usuarioTemPermissaoParaAlterarLimites = false;
//		
//		
//	      if(usuarioTemPermissaoParaAlterarLimites==null || !usuarioTemPermissaoParaAlterarLimites) {
//	        System.out.println(usuarioTemPermissaoParaAlterarLimites==null ? 
//	            "Erro ao alterar limites." : "Usuário não tem permissão para alterar limites.");
//	      } else {
//	    	  System.out.println("Deu certo");
//	      }
//		

//		String erros = "";
//		Double limiteAncora = 30000000.00;
//		Double limiteProprio = 30000000.00;
//		Double limiteFidc = 30000000.00;
//		
//		erros += limiteProprio > limiteAncora ? "<br/>" + "Limite próprio não pode ser maior do que o limite do ancora. \n" : "";
//	    erros += limiteFidc > limiteAncora ? "<br/>" + "Limite Fidc não pode ser maior do que o limite do ancora. \n" : "";
//	    boolean response = erros.length() > 0 ? true : false;
//		System.out.println(response);
//		System.out.println(erros);

//		String numeroCprfManual = "";
//		
//		System.out.println(LocalDate.now().getYear());

//		retornaEstado("RS");

//		Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date()); // Define a data atual
//        // Adiciona 20 dias
//        calendar.add(Calendar.DAY_OF_MONTH, 20);
//        String datafim = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()) + "T23:59:59-03:00";
//		System.out.println(datafim);
//		
//		LocalDate dataAtual = LocalDate.now();
//		System.out.println(dataAtual.plusDays(20) + "T23:59:59-03:00");

	}

}
