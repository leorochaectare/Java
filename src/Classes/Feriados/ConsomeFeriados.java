package Classes.Feriados;

import java.util.LinkedList;

public class ConsomeFeriados {
	public static void main(String[] args) {
		LinkedList<Feriados> feriados = new LinkedList<Feriados>();
		Feriados feriado_ano_novo = new Feriados("Ano novo", "2022-01-01");
		Feriados feriado_carnaval = new Feriados("Carnaval", "2022-03-01");
		Feriados feriado_pascoa = new Feriados("Pascoa", "2022-04-17");
		Feriados feriado_tiradentes = new Feriados("Tiradentes", "2022-04-21");
		Feriados feriado_dia_trabalho = new Feriados("Dia do trabalho", "2022-05-01");
		Feriados feriado_corpus_christi = new Feriados("Corpus Christi", "2022-06-16");
		Feriados feriado_independencia_brasil = new Feriados("Independencia do Brasil", "2022-09-07");
		Feriados feriado_nossa_senhora = new Feriados("Nossa senhora da Aparecida", "2022-10-12");
		Feriados feriado_finados = new Feriados("Finados", "2022-11-02");
		Feriados feriado_proclamacao_republica = new Feriados("Proclamacao Republica", "2022-11-15");
		Feriados feriado_natal = new Feriados("Natal", "2022-12-25");
		
		feriados.add(feriado_ano_novo);
		feriados.add(feriado_carnaval);
		feriados.add(feriado_pascoa);
		feriados.add(feriado_tiradentes);
		feriados.add(feriado_dia_trabalho);
		feriados.add(feriado_corpus_christi);
		feriados.add(feriado_independencia_brasil);
		feriados.add(feriado_nossa_senhora);
		feriados.add(feriado_finados);
		feriados.add(feriado_proclamacao_republica);
		feriados.add(feriado_natal);
		
		for(Feriados f: feriados) {
			System.out.println(f);
		}
		
	}
}
