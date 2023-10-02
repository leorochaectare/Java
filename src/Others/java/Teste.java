package Others.java;




public class Teste {


	
	
	
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
		cnhFrente.setDocumentFormat(0);
		cnhFrente.setDocumentName("CNH FRENTE");
		cnhFrente.setTipoDocumento(TipoDocumento.CNH_FRENTE);
		cnhFrente.setDescription(".png");
		cnhFrente.setExpirationDate("2023-08-08");
		cnhFrente.setDocumentKey("");
		resendDocuments.getListaDocumentos().add(cnhFrente);
		
		

//		Optional<String> documentoCnhFrenteOptional = resendDocuments.getListaDocumentos().stream()
//			    .filter(documento -> documento.getTipoDocumento().equals(TipoDocumento.CNH_FRENTE))
//			    .map(Documents::getDocumentFile) 
//			    .findFirst();
		
		String documentoCnhFrente = tiraNulos(resendDocuments.getListaDocumentos().stream()
			    .filter(documento -> TipoDocumento.CNH_FRENTE.equals(documento.getTipoDocumento()))
			    .map(Documents::getDocumentFile) 
			    .findFirst().orElse(null));
				

		System.out.println(documentoCnhFrente);
		
		
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

