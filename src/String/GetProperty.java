package String;

public class GetProperty {
	public static void main(String[] args) {
		if(System.getProperty("os.name").equals("Windows")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
