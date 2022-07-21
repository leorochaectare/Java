package Classes.Contas;

import java.text.DecimalFormat;

public class ContaPessoaFisica extends Contas {
	DecimalFormat df = new DecimalFormat("###,###,##0.00");
	
	private String cpf;
	
	public ContaPessoaFisica() {
		
	}
	
	public ContaPessoaFisica(int id, String nome, int numero_conta, int dv, double saldo, String cpf, 
			boolean status_emprestimo, double valor_limite_emprestimo) {
		super(id, nome, numero_conta, dv, saldo, status_emprestimo, valor_limite_emprestimo);
		this.cpf = cpf;
	}
	
	public double depositar(double valor_deposito) {
		double deposito = this.getSaldo() + valor_deposito;
		this.setSaldo(deposito);
		return deposito;
	}
	
	public double sacar(double valor_saque) {
		double saque = this.getSaldo() - valor_saque;
		this.setSaldo(saque);
		return saque;
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo atual: R$" + df.format(this.getSaldo()));
	}
	
	public String solicitaEmprestimo(double valor_emprestimo) {
		if(!this.getStatus_emprestimo()) {
			return "Cliente nao esta aprovado para realizar o emprestimo";
		} else {
			if(valor_emprestimo < this.getValor_limite_emprestimo()) {
				double emprestimo = this.getValor_limite_emprestimo() - valor_emprestimo;
				this.setValor_limite_emprestimo(emprestimo);
				double acrescimo_saldo = emprestimo + this.getSaldo();
				this.setSaldo(acrescimo_saldo);
				return "Emprestimo realizado com sucesso - Saldo em conta atual: R$" + df.format(this.getSaldo()) + 
						" Limite disponivel para emprestimo: R$" + df.format(this.getValor_limite_emprestimo()) ;
			} else {
				return "Limite insuficiente para realizar emprestimo - Limite disponivel: R$" + df.format(this.getValor_limite_emprestimo());
			}
		}
	}
	
	public void limiteEmprestimo() {
		System.out.println("Limite disponivel para emprestimo: R$" + df.format(this.getValor_limite_emprestimo()));
	}
	
	public void statusEmprestimo() {
		if(!this.getStatus_emprestimo()) {
			System.out.println("Emprestimo indisponivel no momento, por favor aguarde ou entre em contato com o banco");
		} else {
			System.out.println("Emprestimo disponivel - Limite para emprestimo: R$" + df.format(this.getValor_limite_emprestimo()));
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
