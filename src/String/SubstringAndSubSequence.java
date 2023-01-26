package String;

public class SubstringAndSubSequence {
	public static void main(String[] args) {
		String valor = "DevJava";
		
		System.out.println(valor.subSequence(0, 4)); //DevJ
		System.out.println(valor.substring(0, 4)); //DevJ
		
		String data = "2022-12-25 00:00:00.000";
		
		System.out.println(data.substring(0, 10));
		
		
	}
}
