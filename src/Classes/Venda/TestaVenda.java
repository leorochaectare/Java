package Classes.Venda;

public class TestaVenda {
	public static void main(String[] args) {
		Venda venda = new Venda();
		
		int idpessoaagro = 10;
		String cpf_cnpj = "13569486699";
		
		venda.getDestinatario().setCpf_cnpj(cpf_cnpj);
		System.out.println(venda);
		
	}
}
