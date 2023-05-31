package Others.java;

public class Ternario {
	public static void main(String[] args) {
		String matricula = null;
		
		System.out.println(matricula == null ? "vazio" : matricula);
		
		double valor = 10.45;
		System.out.println(String.valueOf(valor).replaceAll("0+$", ""));
	}
}
