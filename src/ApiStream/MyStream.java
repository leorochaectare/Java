package ApiStream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.ArrayList;

class Funcionario {
	private int id_funcionario;
	private String nome;
	private double salario;
	private String departamento;
	
	public Funcionario(int id_funcionario, String nome, double salario, String departamento) {
		this.id_funcionario = id_funcionario;
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [id_funcionario=" + id_funcionario + ", nome=" + nome + ", salario=" + salario
				+ ", departamento=" + departamento + "] \n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(departamento, other.departamento);
	}
	
	
}

public class MyStream {
	
	public static void mostrarDepartamento(String departamento) {
		
		System.out.println("DEPARTAMENTO: " + departamento);
		
	}
	
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(new Funcionario(1, "Seu Madruga", 10000.00, "Programador"));
		funcionarios.add(new Funcionario(2, "Chaves", 8000.00, "Programador"));
		funcionarios.add(new Funcionario(3, "Chiquinha", 7000.00, "Programador"));
		funcionarios.add(new Funcionario(4, "Quico", 3000.00, "Suporte"));
		funcionarios.add(new Funcionario(5, "Nhonho", 2500.00, "Suporte"));
		funcionarios.add(new Funcionario(6, "Seu Barriga", 4000.00, "Suporte"));
		funcionarios.add(new Funcionario(7, "Dona Florinda", 6000.00, "B.I"));
		funcionarios.add(new Funcionario(8, "Professor Linguica", 2000.00, "Contador"));
		funcionarios.add(new Funcionario(9, "Bruxa do 71", 1500.00, "Recepcao"));
		funcionarios.add(new Funcionario(10, "Godines", 1000.00, "Estagiario"));
		
		System.out.println("-------------------------------------------------");
		System.out.println("Filtrar todos os funcionarios da empresa");
		
		funcionarios.stream().
			filter(func -> func.getNome() != null).
			forEach(func -> System.out.println("Nome: " + func.getNome()));
		
		System.out.println("-------------------------------------------------");
		System.out.println("Funcionarios com salario acima ou igual a 5000.00");
		
		funcionarios.stream()
		 .filter(func -> func.getSalario() >= 5000.00)
		 .forEach(func -> System.out.println("Nome: " + func.getNome()));
		
		System.out.println("-------------------------------------------------");
		System.out.println("Somar todos os salarios dos funcionarios");
		
		double sumSalary = funcionarios.stream()
			.filter(func -> func.getSalario() > 0.00)
			.mapToDouble(func -> func.getSalario())
			.sum();
		System.out.println(sumSalary);	
		
		System.out.println("-------------------------------------------------");
		System.out.println("Quantidade de funcionários com salário acima ou igual a 5000");
		
		var quantity = funcionarios.stream()
				.filter(func -> func.getSalario() >= 5000.00)
				.count();
		System.out.println(quantity);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Retornando lista de funcionários em ordem alfabética");
		
		var employeeListSorted = funcionarios.stream()
				.sorted((item1, item2) -> item1.getNome().compareTo(item2.getNome()))
				.collect(Collectors.toList());
		
		System.out.println(employeeListSorted);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Retornando lista dos salários de todos os funcionarários");
		
		funcionarios.stream()
				.flatMapToDouble(salary -> DoubleStream.of(salary.getSalario()))
				.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Retornando profissões sem repetir nomes");
		
//		funcionarios.stream()
//				.distinct()
//				.forEach(funcionario -> System.out.println(funcionario.getDepartamento()));
		
		funcionarios.stream()
		.distinct()
		.forEach(funcionario -> mostrarDepartamento(funcionario.getDepartamento()));
		
		System.out.println("-------------------------------------------------");
		System.out.println("Média de salários total");
		
		var average = funcionarios.stream()
				.mapToDouble(funcionario -> funcionario.getSalario())
				.average().getAsDouble();
		
		System.out.println(average);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Existe algum funcionarário com salário maior ou igual a dez mil reais ?");
		
		var exists = funcionarios.stream().anyMatch(funcionario -> funcionario.getSalario() >= 10000);
		
		System.out.println(exists);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Todos os funcionários tem um salário maior ou igual ao salário mínimo ?");
		
		Double mininumSalary = 1400.00;
		
		var existsSalary = funcionarios.stream().allMatch(funcionario -> funcionario.getSalario() >= mininumSalary);
		
		System.out.println(existsSalary);
		
		
		
		
		
		
	}
}
