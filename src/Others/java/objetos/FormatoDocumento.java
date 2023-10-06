package Others.java.objetos;

public enum FormatoDocumento {
	
	 PDF(0), JPG(1), JPEG(2), PNG(3);
	  
	  private int valor;
	  
	  FormatoDocumento(int valor) {
	      this.valor = valor;
	  }
	  
	  public int getValor() {
	      return valor;
	  }

}
