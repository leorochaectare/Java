package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatandoData {
	public static void main(String[] args) throws ParseException {
		String patternBR = "dd/MM/yyyy";
	    SimpleDateFormat simpleDateFormatBR = new SimpleDateFormat(patternBR);
		String data_apuracao = "2023-01-01";
		
		Date date = simpleDateFormatBR.parse(data_apuracao);
		
		System.out.println(date);
	}
}
