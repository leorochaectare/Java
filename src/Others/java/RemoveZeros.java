package Others.java;

public class RemoveZeros {
	public static void main(String[] args) {
		String latitude = "-10.234710060000";
		
		System.out.println(latitude);
		System.out.println(latitude.replaceAll("0+$", ""));
	}
}
