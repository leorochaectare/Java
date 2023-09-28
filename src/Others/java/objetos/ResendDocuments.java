package Others.java.objetos;

import java.util.LinkedList;

public class ResendDocuments {
	
	private String cpfcnpj;
	private LinkedList<Documents> listaDocumentos = new LinkedList<>();
	
	public ResendDocuments() {};
	
	public ResendDocuments(String cpfcnpj, LinkedList<Documents> listaDocumentos) {
		super();
		this.cpfcnpj = cpfcnpj;
		this.listaDocumentos = listaDocumentos;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public LinkedList<Documents> getListaDocumentos() {
		return listaDocumentos;
	}

	public void setListaDocumentos(LinkedList<Documents> listaDocumentos) {
		this.listaDocumentos = listaDocumentos;
	}

	@Override
	public String toString() {
		return "ResendDocuments [cpfcnpj=" + cpfcnpj + ", listaDocumentos=" + listaDocumentos + "]";
	}
	
	
	
	

}
