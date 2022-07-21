package HackerrankLanguageJava;

import java.util.ArrayList;

public class JavaStringTokens {
	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		ArrayList<String> strings = new ArrayList<>();
		String caracteres = "";
		
		for(int i = 0; i < s.length(); i++) {
			//String caracter = s.substring(i-1, i);
			
			if(s.codePointAt(i) != 32 && s.codePointAt(i) != 33 && s.codePointAt(i) != 44
					&& s.codePointAt(i) != 63 && s.codePointAt(i) != 46 && s.codePointAt(i) != 95
					&& s.codePointAt(i) != 39 && s.codePointAt(i) != 64) {
				caracteres = caracteres + s.charAt(i);
			} else {
				strings.add(caracteres);
				caracteres = "";
			}
			
//			System.out.println(s.charAt(i) + " = " + s.codePointAt(i));
		}
		
		System.out.println(strings.size());
		System.out.println(strings);
	}
}

// regex - /[^a-zA-Z0-9]+/g