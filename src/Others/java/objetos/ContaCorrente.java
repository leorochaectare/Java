package Others.java.objetos;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaCorrente {
	private String banco;
	private String agencia;
	private String numero;
	private BigDecimal saldo;
	private Correntista correntista;
	
	public ContaCorrente(String banco, String agencia, String numero, Correntista correntista) {
		this();
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
		this.correntista = correntista;
	}
	
	public ContaCorrente() {
		this.saldo = BigDecimal.ZERO;
	}

    public boolean identificadaPor(String banco, String agencia, String numero) {
        return this.banco.equals(banco)
            && this.agencia.equals(agencia)
            && this.numero.equals(numero);
    }
    
  
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	public void deposito(BigDecimal valor) {
    	this.setSaldo(this.getSaldo().add(valor));
    }
	
	public void saque(BigDecimal valor) {
		
		var saldo = this.getSaldo().subtract(valor);
		
		if(saldo.intValue() < 0) {
			throw new IllegalArgumentException("Limite insuficiente para realizar essa operação.");
		} else {
			this.setSaldo(saldo);
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, banco, numero);
	}
	
	public boolean identificadorPor(String banco, String agencia, String numero) {
		return this.banco.equals(banco) 
				&& this.agencia.equals(agencia)
				&& this.numero.equals(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Objects.equals(agencia, other.agencia) && Objects.equals(banco, other.banco)
				&& Objects.equals(numero, other.numero);
	}

	@Override
	public String toString() {
		return "ContaCorrente [banco=" + banco + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo
				+ ", correntista=" + correntista + "]";
	}
    
    
	
}
