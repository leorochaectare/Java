package Http.Github;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Github {
	public static void main(String[] args) throws IOException {
		
		String url = "https://api.github.com/users/leogrocha";
		URL obj = new URL(url);
		
		// Abrir conexão com a URL
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		// Definindo o método de requisição
		con.setRequestMethod("GET");
		
		// Lendo a resposta da API
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
		    response.append(inputLine);
		}
		in.close();

		System.out.println(response);
		
		
		
	}
}
