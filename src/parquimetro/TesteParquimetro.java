package parquimetro;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import parquimetro.domain.Condutor;
import parquimetro.domain.Endereco;
import parquimetro.domain.FormaPagamento;
import parquimetro.domain.PeriodoEstacionamento;
import parquimetro.domain.Registro;
import parquimetro.domain.Veiculo;
import parquimetro.repository.CondutorRepository;
import parquimetro.repository.RegistroRepository;

public class TesteParquimetro {
	
	
	private final CondutorRepository condutorRepository;
	
	public TesteParquimetro(CondutorRepository condutorRepository) {
		this.condutorRepository = condutorRepository;
	}
	
	public static void main(String[] args) {
		
		
		Condutor condutor = new Condutor();
		condutor.setCondutorId(Long.valueOf(CondutorRepository.size() + 1));
		condutor.setNome("Seu Madruga");
		condutor.setCpf("123.123.777-56");
		condutor.setEmail("contato@hotmail.com");
		condutor.setTelefone("35988774455");
		condutor.setFormaPagamento(FormaPagamento.PIX);
		Endereco endereco = new Endereco();
		endereco.setEnderecoId(condutor.getCondutorId());
		endereco.setLogradouro("Rua Pimenta de Teste");;
	    endereco.setBairro("Centro");
	    endereco.setNumero("S/N");
	    endereco.setComplemento("S/COMPLEMENTO");
	    endereco.setCep("37950-000");
	    endereco.setMunicipio("Paraíso infelizmente");
		condutor.setEndereco(endereco);
		
		List<Veiculo> listaVeiculos = new LinkedList<>();
		Veiculo veiculo = new Veiculo();
		veiculo.setVeiculoId(1L);
		veiculo.setPlaca("ABC-1234");
		veiculo.setMarca("ONIX");
		veiculo.setModelo("V3");
		veiculo.setAnoFabricacao(2018);
		listaVeiculos.add(veiculo);
		condutor.setVeiculos(listaVeiculos);
		CondutorRepository.save(condutor);
		System.out.println(CondutorRepository.findById(1L));
		
		
		Registro registro = new Registro();
		registro.setRegistroId(1L);
		registro.setPeriodoEstacionamento(PeriodoEstacionamento.POR_HORA);
		registro.setDuracaoDesejada(2L);
		registro.setFormaPagamento(FormaPagamento.PIX);
		registro.setVeiculo(veiculo);
		registro.setCondutor(condutor);
		registro.setTarifaAplicada(new BigDecimal("2.00"));
		
		registro.setInicioRegistro(LocalDateTime.now());
		registro.setValorTotal(registro.calculaValorTotal(registro.getPeriodoEstacionamento()));
		registro.setFimRegistro(null);
				
		System.out.println(registro);
		
		RegistroRepository.save(registro);
		System.out.println(RegistroRepository.findAll());
		
		
		
		
		
		
		
		
		
	}

}
