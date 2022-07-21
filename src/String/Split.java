package String;

public class Split {
	public static void main(String[] args) {
		String valor = "DEV-Java";
		String[] valorComSplit = valor.split("-");
		
		for(String s : valorComSplit) {
			System.out.println(s);
		}
	}
}
