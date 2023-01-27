package Date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatandoData {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String data_apuracao = "2023-01-01";
		
		Date date = formatter.parse(data_apuracao);
		Format format = new SimpleDateFormat("dd/MM/yyyy");
		String data_formatada = format.format(date);
		
		
		System.out.println(data_formatada);
	}
}
