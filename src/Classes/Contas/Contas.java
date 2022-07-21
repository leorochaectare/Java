package Classes.Contas;


public abstract class Contas {
	private int id;
	private String nome;
	private int numero_conta;
	private int dv;
	private double saldo;
	private boolean status_emprestimo;
	private double valor_limite_emprestimo;

	public Contas() {

	}

	public Contas(int id, String nome, int numero_conta, int dv, double saldo, boolean status_emprestimo, 
			double valor_limite_emprestimo) {
		this.id = id;
		this.nome = nome;
		this.numero_conta = numero_conta;
		this.dv = dv;
		this.saldo = saldo;
		this.status_emprestimo = status_emprestimo;
		if(this.status_emprestimo == false) {
			this.valor_limite_emprestimo = 0.00;
		} else {
			this.valor_limite_emprestimo = valor_limite_emprestimo;
		}
	}
	
	public abstract double depositar(double valor_deposito);
	public abstract double sacar(double valor_saque);
	public abstract void mostrarSaldo();
	public abstract String solicitaEmprestimo(double valor_emprestimo);
	public abstract void limiteEmprestimo();
	public abstract void statusEmprestimo();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}

	public int getDv() {
		return dv;
	}

	public void setDv(int dv) {
		this.dv = dv;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus_emprestimo() {
		return status_emprestimo;
	}
	
	public void setStatus_emprestimo(boolean status_emprestimo) {
		this.status_emprestimo = status_emprestimo;
	}
	
	public double getValor_limite_emprestimo() {
		return valor_limite_emprestimo;
	}
	
	public void setValor_limite_emprestimo(double valor_limite_emprestimo) {
		this.valor_limite_emprestimo = valor_limite_emprestimo;
	}

	@Override
	public String toString() {
		return "Contas [id=" + id + ", nome=" + nome + ", numero_conta=" + numero_conta + ", dv=" + dv + ", saldo="
				+ saldo + ", status_emprestimo=" + status_emprestimo + ", valor_limite_emprestimo="
				+ valor_limite_emprestimo + "]";
	}
}
