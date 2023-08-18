package Others.java;


import java.util.LinkedList;
import Others.java.objetos.Processos;

public class Teste {
	
	static LinkedList<Processos> listaProcessos = new LinkedList<>();
	
	public static boolean validaEtapaAnterior(String processoAtual) {
		
		boolean response = true;
		
		// encontrar etapa na lista
		Processos processo = listaProcessos.stream().filter(process -> process.getDescricao().equals(processoAtual)).findFirst().get();
		System.out.println(processo);
		int indiceProcessoAtual = listaProcessos.lastIndexOf(processo);
		
		if(indiceProcessoAtual==0) {
			return response;
		}
		
		
		Processos processoAnterior = listaProcessos.get(indiceProcessoAtual-1);
		
		// Conectar no banco de dados e pegar a informação do campo de nomeBanco
		
		
		
		return response;
	}
	
	
	
	public static void main(String[] args) {
		
		listaProcessos.add(new Processos("Desembolso", "datadesembolso"));
		listaProcessos.add(new Processos("Boletagem", "databoletagem"));
		listaProcessos.add(new Processos("Conferir CRK", "data_conferencia_crk"));
		listaProcessos.add(new Processos("Liquidação", "data_liquidacao"));
		
		validaEtapaAnterior("Boletagem");
	}
}