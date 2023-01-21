package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DataNascimentoMaiorQueNow {
	public static void main(String[] args) throws ParseException {
		
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date1 = sdf.parse("2023-01-21");
	Date date2 = sdf.parse("2023-01-20");
	
	System.out.println(date1.compareTo(date2)); // Resultado 1 date1 é maior
	System.out.println(date2.compareTo(date1)); // // Resultado -1 date1 é maior
	// caso fosse igual iria retornar 0
	
	String data_nascimento = "2023-01-21";
	Date dataAtual = new Date();
	String dataAtualFormatada = sdf.format(dataAtual);
	
	System.out.println("Data Atual formatada: " + dataAtualFormatada);
	System.out.println("Data Nascimento: " + data_nascimento);
	
	System.out.println(data_nascimento.compareTo(dataAtualFormatada));
	System.out.println(dataAtualFormatada.compareTo(data_nascimento));
		
		
        
	}
}
