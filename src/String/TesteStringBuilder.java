package String;

public class TesteStringBuilder {
	public static void main(String[] args) {
		StringBuilder nomes = new StringBuilder();
		nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");
		
		System.out.println(nomes.toString());
	}
}
