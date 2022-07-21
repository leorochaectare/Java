package HackerrankLanguageJava;

public class javaIntToString {
	public static void main(String[] args) {
		int n = 100;
		String s = Integer.toString(n);
		
		
		if(n == Integer.parseInt(s)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer");
		}
	}
}
