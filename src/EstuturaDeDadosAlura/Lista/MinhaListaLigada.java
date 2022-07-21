package EstuturaDeDadosAlura.Lista;

public class MinhaListaLigada {
	
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	@Override
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();

	}
	
	public void adicionaNoComeco(Object elemento) {
		// Criar a celula
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = primeira;
		}
	
		
		this.totalDeElementos++;
	}
	
	public void adiciona(Object elemento) {
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			
			this.totalDeElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao > 0 && posicao <= this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Inexistente");
		}
		
		Celula atual = primeira;
		
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
			
		}
		
		return atual;
		
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == totalDeElementos) {
			adiciona(elemento);
		} else {
			Celula anterior = pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);
			this.totalDeElementos++;
		}
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		} else {
			
			this.primeira = this.primeira.getProximo();
			this.totalDeElementos--;
			
			if(this.totalDeElementos == 0) {
				this.ultima = null;
			}
		
		}	
	}
	
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
}
