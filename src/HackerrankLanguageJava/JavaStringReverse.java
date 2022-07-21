package HackerrankLanguageJava;

public class JavaStringReverse {
	public static void main(String[] args) {

		String A = "madam";
		
		String palindrome = "Yes";
		
		for(int i = 0; i < A.length()-1; i++) {
			char ponteiro_1 = A.charAt(i);
			char ponteiro_2 = A.charAt(A.length()-i-1);

			if(ponteiro_1 == ponteiro_2) {
				palindrome = "Yes";
			} else {
				palindrome = "No";
				break;
			}
		}
		
		System.out.println(palindrome);
	}
}
