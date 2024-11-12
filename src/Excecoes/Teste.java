package Excecoes;

public class Teste {
	
	public static class Pessoa {
		private int id;
		private String nome;
		private String documento;
		private Double salario;
		
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
		public String getDocumento() {
			return documento;
		}
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public Double getSalario() {
			return salario;
		}
		public void setSalario(Double salario) {
			this.salario = salario;
		}
		
	}
	
	public static int divisaoPorZero() {
			
		try {
			System.out.println("INÍCIO");
			
			int a = 0;
			int b = 0;
			
			if (a == 0 || b == 0) {
				throw new Exception("Divisão por zero.");
			}
			
			return a/b;
		} catch (Exception e ) {
			e.printStackTrace();
		} finally {
			System.out.println("FIM");
		}
		return 0;
	}
	
	public static Double nullPointerException(Pessoa pessoa) throws Exception {
		
		Double soma = 0.0;
		
		try {
			
			if (pessoa == null || pessoa.getSalario()==null || pessoa.getSalario()==0.0) {
				throw new Exception("Salário não pode ser nulo ou zero.");
			}
			
			soma += pessoa.getSalario();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return soma;
	}
	
	public static void main(String[] args) throws Exception {
//		System.out.println(divisaoPorZero());
		
		System.out.println(nullPointerException(null));
	}

}
