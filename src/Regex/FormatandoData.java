package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatandoData {
	public static void main(String[] args) {

        String data = "2007-12-31";
        Pattern pattern = Pattern.compile("(\\d{4})(-)(\\d{2})(-)(\\d{2})");
        Matcher matcher = pattern.matcher(data);

        if (matcher.matches()) {

            String ano = matcher.group(1);
            String mes = matcher.group(3);
            String dia = matcher.group(5);

            String separador1 = matcher.group(2);
            String separador2 = matcher.group(4);

            System.out.println(dia + separador1 + mes + separador2 + ano);
        }
    }
}
