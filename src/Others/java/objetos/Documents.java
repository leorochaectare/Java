package Others.java.objetos;


public class Documents {

	private String documentFile;
	private Integer documentFormat;
	private String documentName;
	private TipoDocumento tipoDocumento;
	private String description;
	private String expirationDate;
	private String documentKey;
	
	public Documents() {
		
	}

	public Documents(String documentFile, Integer documentFormat, String documentName, TipoDocumento tipoDocumento,
			String description, String expirationDate, String documentKey) {
		this.documentFile = documentFile;
		this.documentFormat = documentFormat;
		this.documentName = documentName;
		this.tipoDocumento = tipoDocumento;
		this.description = description;
		this.expirationDate = expirationDate;
		this.documentKey = documentKey;
	}

	public String getDocumentFile() {
		return documentFile;
	}

	public void setDocumentFile(String documentFile) {
		this.documentFile = documentFile;
	}

	public Integer getDocumentFormat() {
		return documentFormat;
	}

	public void setDocumentFormat(Integer documentFormat) {
		this.documentFormat = documentFormat;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getDocumentKey() {
		return documentKey;
	}

	public void setDocumentKey(String documentKey) {
		this.documentKey = documentKey;
	}

	@Override
	public String toString() {
		return "Documents [documentFile=" + documentFile + ", documentFormat=" + documentFormat + ", documentName="
				+ documentName + ", tipoDocumento=" + tipoDocumento + ", description=" + description
				+ ", expirationDate=" + expirationDate + ", documentKey=" + documentKey + "]";
	}
	
	
	
	
}
