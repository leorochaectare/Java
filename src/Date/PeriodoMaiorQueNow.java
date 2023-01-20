package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PeriodoMaiorQueNow {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String data_nascimento = "2023-01-20";
		Date data_nascimento_formatada = simpleDateFormat.parse(data_nascimento);
//		Date data_atual_formatada = simpleDateFormat.format(date);
		
		System.out.println(simpleDateFormat.format(date).compareTo(data_nascimento));
	}
}
