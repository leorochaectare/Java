package Others.java.objetos;

public enum TipoDocumento {
	
	
	IDENTIDADE_FRENTE(0),
	CPF(1),
	COMPROVANTE_RESIDENCIA(2),
	CNH_FRENTE(3),
	CNPJ(4),
	CONTRATO_SOCIAL(5),
	IDENTIDADE_VERSO(7),
	OUTRO(13),
	CNH_VERSO(16);
	
	private int valor;
	
	TipoDocumento(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	
	

}
