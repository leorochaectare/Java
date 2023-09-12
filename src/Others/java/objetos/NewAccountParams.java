package Others.java.objetos;

public class NewAccountParams {
	
	private String nome;
	private String telefone;
	private String cpf;
	private String cnpj;
	private String email;
	private String datanascimento;
	private String urlDocumentoFrente;
	private String urlDocumentoVerso;
	private String urlCnhFrente;
	private String urlCnhVerso;
	private String urlIdentidadeFrente;
	private String urlIdentidadeVerso;
	private String urlComprovanteResidencia;
	private String nomemae;
	private String addressLine;
	private String addressLine2;
	private String zipCode;
	private String neighborhood;
	private String cityName;
	private String state;
	private Integer addressType;
	private String complement;
	private String reference;
	private String dataconstituicao;
	private String responsavelNome;
	private String responsavelCpf;
	private String responsavelEmail;
	private String responsavelDatanascimento;
	private String responsavelurlDocumentoFrente;
	private String responsavelurlDocumentoVerso;
	private String responsavelNomemae;
	private String urlCartaoCnpj;
	private String urlContratoSocial;
	private String urlFaturamentoAnual;
	private Boolean escrow;
	private String nacionalidade;
	private Double rendimentoMensal;
	private String tipoEmpresa;
	private String ufNascimento;
	private String agencia;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getUrlDocumentoFrente() {
		return urlDocumentoFrente;
	}
	public void setUrlDocumentoFrente(String urlDocumentoFrente) {
		this.urlDocumentoFrente = urlDocumentoFrente;
	}
	public String getUrlDocumentoVerso() {
		return urlDocumentoVerso;
	}
	public void setUrlDocumentoVerso(String urlDocumentoVerso) {
		this.urlDocumentoVerso = urlDocumentoVerso;
	}
	public String getUrlCnhFrente() {
		return urlCnhFrente;
	}
	public void setUrlCnhFrente(String urlCnhFrente) {
		this.urlCnhFrente = urlCnhFrente;
	}
	public String getUrlCnhVerso() {
		return urlCnhVerso;
	}
	public void setUrlCnhVerso(String urlCnhVerso) {
		this.urlCnhVerso = urlCnhVerso;
	}
	public String getUrlIdentidadeFrente() {
		return urlIdentidadeFrente;
	}
	public void setUrlIdentidadeFrente(String urlIdentidadeFrente) {
		this.urlIdentidadeFrente = urlIdentidadeFrente;
	}
	public String getUrlIdentidadeVerso() {
		return urlIdentidadeVerso;
	}
	public void setUrlIdentidadeVerso(String urlIdentidadeVerso) {
		this.urlIdentidadeVerso = urlIdentidadeVerso;
	}
	public String getUrlComprovanteResidencia() {
		return urlComprovanteResidencia;
	}
	public void setUrlComprovanteResidencia(String urlComprovanteResidencia) {
		this.urlComprovanteResidencia = urlComprovanteResidencia;
	}
	public String getNomemae() {
		return nomemae;
	}
	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		switch (state.toUpperCase()) {
		case "AC": this.state = "0 - AC"; break; 
		case "AL": this.state = "1 - AL"; break; 
		case "AP": this.state = "2 - AP"; break; 
		case "AM": this.state = "3 - AM"; break; 
		case "BA": this.state = "4 - BA"; break; 
		case "CE": this.state = "5 - CE"; break; 
		case "DF": this.state = "6 - DF"; break; 
		case "ES": this.state = "7 - ES"; break; 
		case "GO": this.state = "8 - GO"; break;
		case "MA": this.state = "9 - MA"; break; 
		case "MT": this.state = "10 - MT"; break; 
		case "MS": this.state = "11 - MS"; break; 
		case "MG": this.state = "12 - MG"; break; 
		case "PA": this.state = "13 - PA"; break; 
		case "PB": this.state = "14 - PB"; break; 
		case "PR": this.state = "15 - PR"; break; 
		case "PE": this.state = "16 - PE"; break; 
		case "PI": this.state = "17 - PI"; break; 
		case "RJ": this.state = "18 - RJ"; break; 
		case "RN": this.state = "19 - RN"; break; 
		case "RS": this.state = "20 - RS"; break;  
		case "RO": this.state = "21 - RO"; break; 
		case "RR": this.state = "22 - RR"; break; 
		case "SC": this.state = "23 - SC"; break; 
		case "SP": this.state = "24 - SP"; break; 
		case "SE": this.state = "25 - SE"; break; 
		case "TO": this.state = "26 - TO"; break;
		default: this.state = null; 
		}
	}
	public Integer getAddressType() {
		return addressType;
	}
	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDataconstituicao() {
		return dataconstituicao;
	}
	public void setDataconstituicao(String dataconstituicao) {
		this.dataconstituicao = dataconstituicao;
	}
	public String getResponsavelNome() {
		return responsavelNome;
	}
	public void setResponsavelNome(String responsavelNome) {
		this.responsavelNome = responsavelNome;
	}
	public String getResponsavelCpf() {
		return responsavelCpf;
	}
	public void setResponsavelCpf(String responsavelCpf) {
		this.responsavelCpf = responsavelCpf;
	}
	public String getResponsavelEmail() {
		return responsavelEmail;
	}
	public void setResponsavelEmail(String responsavelEmail) {
		this.responsavelEmail = responsavelEmail;
	}
	public String getResponsavelDatanascimento() {
		return responsavelDatanascimento;
	}
	public void setResponsavelDatanascimento(String responsavelDatanascimento) {
		this.responsavelDatanascimento = responsavelDatanascimento;
	}
	public String getResponsavelurlDocumentoFrente() {
		return responsavelurlDocumentoFrente;
	}
	public void setResponsavelurlDocumentoFrente(String responsavelurlDocumentoFrente) {
		this.responsavelurlDocumentoFrente = responsavelurlDocumentoFrente;
	}
	public String getResponsavelurlDocumentoVerso() {
		return responsavelurlDocumentoVerso;
	}
	public void setResponsavelurlDocumentoVerso(String responsavelurlDocumentoVerso) {
		this.responsavelurlDocumentoVerso = responsavelurlDocumentoVerso;
	}
	public String getResponsavelNomemae() {
		return responsavelNomemae;
	}
	public void setResponsavelNomemae(String responsavelNomemae) {
		this.responsavelNomemae = responsavelNomemae;
	}
	public String getUrlCartaoCnpj() {
		return urlCartaoCnpj;
	}
	public void setUrlCartaoCnpj(String urlCartaoCnpj) {
		this.urlCartaoCnpj = urlCartaoCnpj;
	}
	public String getUrlContratoSocial() {
		return urlContratoSocial;
	}
	public void setUrlContratoSocial(String urlContratoSocial) {
		this.urlContratoSocial = urlContratoSocial;
	}
	public String getUrlFaturamentoAnual() {
		return urlFaturamentoAnual;
	}
	public void setUrlFaturamentoAnual(String urlFaturamentoAnual) {
		this.urlFaturamentoAnual = urlFaturamentoAnual;
	}
	public Boolean getEscrow() {
		return escrow;
	}
	public void setEscrow(Boolean escrow) {
		this.escrow = escrow;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Double getRendimentoMensal() {
		return rendimentoMensal;
	}
	public void setRendimentoMensal(Double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	public String getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	@Override
	public String toString() {
		return "NewAccountParams [nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", cnpj=" + cnpj
				+ ", email=" + email + ", datanascimento=" + datanascimento + ", urlDocumentoFrente="
				+ urlDocumentoFrente + ", urlDocumentoVerso=" + urlDocumentoVerso + ", urlCnhFrente=" + urlCnhFrente
				+ ", urlCnhVerso=" + urlCnhVerso + ", urlIdentidadeFrente=" + urlIdentidadeFrente
				+ ", urlIdentidadeVerso=" + urlIdentidadeVerso + ", urlComprovanteResidencia="
				+ urlComprovanteResidencia + ", nomemae=" + nomemae + ", addressLine=" + addressLine + ", addressLine2="
				+ addressLine2 + ", zipCode=" + zipCode + ", neighborhood=" + neighborhood + ", cityName=" + cityName
				+ ", state=" + state + ", addressType=" + addressType + ", complement=" + complement + ", reference="
				+ reference + ", dataconstituicao=" + dataconstituicao + ", responsavelNome=" + responsavelNome
				+ ", responsavelCpf=" + responsavelCpf + ", responsavelEmail=" + responsavelEmail
				+ ", responsavelDatanascimento=" + responsavelDatanascimento + ", responsavelurlDocumentoFrente="
				+ responsavelurlDocumentoFrente + ", responsavelurlDocumentoVerso=" + responsavelurlDocumentoVerso
				+ ", responsavelNomemae=" + responsavelNomemae + ", urlCartaoCnpj=" + urlCartaoCnpj
				+ ", urlContratoSocial=" + urlContratoSocial + ", urlFaturamentoAnual=" + urlFaturamentoAnual
				+ ", escrow=" + escrow + ", nacionalidade=" + nacionalidade + ", rendimentoMensal=" + rendimentoMensal
				+ ", tipoEmpresa=" + tipoEmpresa + ", ufNascimento=" + ufNascimento + ", agencia=" + agencia + "]";
	}
	
	
	
	

}
