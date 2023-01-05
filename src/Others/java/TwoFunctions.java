package Others.java;

public class TwoFunctions {

	public static int sumNumbers(int a, int b) {
		return a + b;
	}

	public static int sumNumbers(int a, int b, int c) {
		return a + b + c;
	}

	public static boolean verificationBiggerAge(int age) {
		int biggerAge = 18;

		return age >= biggerAge ? true : false;
	}

	public static boolean verificationBiggerAge(int age, int biggerAge) {
		return age >= biggerAge ? true : false;
	}
	
//	public static int testandoTipo() {
//		return 0;
//	}
//	
//	public static String testandoTipo() {
//		return "";
//	}

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=10;
		int age=24;
		int biggerAge=18;

		System.out.println(sumNumbers(a, b));
		System.out.println(sumNumbers(a, b, c));
		System.out.println(verificationBiggerAge(age));
		System.out.println(verificationBiggerAge(age, biggerAge));
	}
}
