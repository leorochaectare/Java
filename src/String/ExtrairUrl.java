package String;

public class ExtrairUrl {
	
	public static void main(String[] args) {
		String url = "https://www.youtube.com/embed/uGY0g0Tg3Sk";
		//String urlNavegador = "https://www.youtube.com/watch?v=bJP3FNjXu-I&list=RDMMbJP3FNjXu-I&start_radio=1";
		String urlCompartilhar = "https://youtu.be/bJP3FNjXu-I";
		String[] valorComSplit = urlCompartilhar.split("/");
		
		
		System.out.println(valorComSplit[3]);
		
//		for(String s : valorComSplit) {
//			System.out.println(s);
//		}
		
	}
	
}
