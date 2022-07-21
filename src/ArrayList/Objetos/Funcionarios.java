package ArrayList.Objetos;

public class Funcionarios {
	private int id;
	private String nome;
	private double salario;
	private String data_nascimento;
	
	public Funcionarios(int id, String nome, double salario, String data_nascimento) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.data_nascimento = data_nascimento;
	}

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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	@Override
	public String toString() {
		return "Funcionarios [id=" + id + ", nome=" + nome + ", salario=" + salario + ", data_nascimento="
				+ data_nascimento + "]";
	}
	
	
}
