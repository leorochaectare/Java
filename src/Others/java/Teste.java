package Others.java;


import Others.java.objetos.ProcessosCheck;

public class Teste {

	public static void main(String[] args) {

		ProcessosCheck contrato = new ProcessosCheck();
		contrato.setDataboletagem(null);
		contrato.setDataconferenciacrk(null);
		contrato.setData_desembolso(null);
		contrato.setDataconfirmacao_desembolso_crk(null);
		contrato.setDataliquidacao(null);
		contrato.setFisico(false);
		contrato.setDataconfirmacao_recebimento_crk(null);
		contrato.setDatavenda_crk(null);
		contrato.setDataregistro_b3_manual(null);
		contrato.setDatacodigos_b3_manual(null);
		contrato.setDataconferencia_b3_manual(null);
		contrato.setDataretirar_b3_manual(null);
		

		boolean aguardandoBoletagem = contrato.getDataboletagem() == null;
		boolean aguardandoConferirCrk = contrato.getDataconferenciacrk() == null && !aguardandoBoletagem;
		boolean aguardandoDesembolso = contrato.getData_desembolso() == null && !aguardandoConferirCrk;
		boolean aguardandoDesembolsoCrk = contrato.getDataconfirmacao_desembolso_crk() == null && !aguardandoDesembolso;
		boolean aguardandoLiquidacao = contrato.getDataliquidacao() == null && !aguardandoDesembolsoCrk;
		boolean aguardandoRecebimentoDocumentoFisico = contrato.isFisico() && contrato.getData_documentofisico() == null
				&& !aguardandoLiquidacao;
		boolean aguardandoRecebimentoCrk = contrato.isFisico()
				? contrato.getDataconfirmacao_recebimento_crk() == null && !aguardandoRecebimentoDocumentoFisico
				: contrato.getDataconfirmacao_recebimento_crk() == null && !aguardandoLiquidacao;
		boolean aguardandoVendaCrk = contrato.getDatavenda_crk() == null && !aguardandoRecebimentoCrk;
		boolean aguardandoRegistroB3 = contrato.getDataregistro_b3_manual() == null && !aguardandoVendaCrk;
		boolean aguardandoCodigosB3 = contrato.getDatacodigos_b3_manual() == null && !aguardandoRegistroB3;
		boolean aguardandoConferenciaB3 = contrato.getDataconferencia_b3_manual() == null && !aguardandoCodigosB3;
		boolean aguardandoRetirarB3 = contrato.getDataretirar_b3_manual() == null && !aguardandoConferenciaB3;

		if (aguardandoBoletagem) {
			System.out.println("AGUARDANDO BOLETAGEM");
		} else if (aguardandoConferirCrk) {
			System.out.println("AGUARDANDO CONFERIR CRK");
		} else if (aguardandoDesembolso) {
			System.out.println("AGUARDANDO DESEMBOLSO");
		} else if (aguardandoDesembolsoCrk) {
			System.out.println("AGUARDANDO DESEMBOLSO CRK");
		} else if (aguardandoLiquidacao) {
			System.out.println("AGUARDANDO LIQUIDAÇÃO");
		} else if (aguardandoRecebimentoDocumentoFisico) {
			System.out.println("AGUARDANDO RECEBIMENTO DE DOCUMENTO FÍSICO");
		} else if (aguardandoRecebimentoCrk) {
			System.out.println("AGUARDANDO RECEBIMENTO CRK");
		} else if (aguardandoVendaCrk) {
			System.out.println("AGUARDANDO VENDA CRK");
		} else if (aguardandoRegistroB3) {
			System.out.println("AGUARDANDO REGISTRO B3");
		} else if (aguardandoCodigosB3) {
			System.out.println("AGUARDANDO INFORMAR CÓDIGOS B3");
		} else if (aguardandoConferenciaB3) {
			System.out.println("AGUARDANDO CONFERÊNCIA B3");
		} else if (aguardandoRetirarB3) {
			System.out.println("AGUARDANDO RETIRAR DA B3");
		} else {
			System.out.println("FINALIZADO");
		}

	}
}