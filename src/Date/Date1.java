package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Date1 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// Modelo UTC
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2021 15:42:07");
		
		// Buscando a data atual
		Date x1 = new Date();
		System.out.println(x1); // Sat Apr 02 14:42:46 BRT 2022
		
		// Pega o instante do sistema e converte para milissegundos 
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println(x2); // Sat Apr 02 14:44:44 BRT 2022
		
		Date x3 = new Date(0L);
		System.out.println(sdf2.format(x3)); // 31/12/1969 21:00:00
		
		System.out.println(y1); // Mon Jun 25 00:00:00 BRT 2018
		System.out.println(y2); // Fri Jun 25 15:42:07 BRT 2021
		
		System.out.println(sdf2.format(y1)); // 25/06/2018 00:00:00
		System.out.println(sdf2.format(y2)); // 25/06/2021 15:42:07
		
		// Desafio - Retornar a data de 1 de janeira de 1970 as 05:00 da manhã
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		// como estamos no Brasil o padrão UTF tem uma diferença de três horas como o horário padrão proposto
		System.out.println(x4); // Thu Jan 01 02:00:00 BRT 1970

		// Horário UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf2.format(y3)); // 25/06/2018 12:42:07
		
		Date utc_x1 = new Date();
		Date utc_x2 = new Date(System.currentTimeMillis());
		Date utc_x3 = new Date(0L);
		Date utc_x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date utc_y1 = sdf1.parse("25/06/2018");
		Date utc_y2 = sdf2.parse("25/06/2021 15:42:07");
		Date utc_y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); 
		
		
		System.out.println("__________________________________________");
		System.out.println("Horário máquina local sem o UTC");
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf2.format(x4));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y3));
		
		System.out.println("__________________________________________");
		System.out.println("Horário com o UTC");
		System.out.println(sdf3.format(utc_x1));
		System.out.println(sdf3.format(utc_x2));
		System.out.println(sdf3.format(utc_x3));
		System.out.println(sdf3.format(utc_x4));
		System.out.println(sdf3.format(utc_y1));
		System.out.println(sdf3.format(utc_y2));
		System.out.println(sdf3.format(utc_y3));
		
	}
}
