package HackerrankLanguageJava;

public class JavaPrimalityTest {
	
	public static String prime(int number) {
		boolean result = false;
		
		for(int i = 2; i < 100; i++) {
			
			if(number % i == 0 && number != i) {
				result = true;
			}
		}
		
		if(result == true)
			return "not prime";
		else 
			return "prime";
	}
	
	public static void main(String[] args) {
		System.out.println(prime(11));
	}
}
