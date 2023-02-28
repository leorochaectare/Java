package Others.java;

public class ValueOf {
	public static void main(String[] args) {
		String s = "42";
		Integer i = Integer.valueOf(s);
		
		System.out.println(i instanceof Integer);
				
	}
}
