package Others.java.integracao;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IntegrandoApi {
	public static void main(String[] args) throws IOException {

			
		    URL url = new URL("https://api.github.com/users/leogrocha");
		    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		    connection.setRequestMethod("GET");
		    int responseCode = connection.getResponseCode();
		    if (responseCode == 200) {
		      InputStreamReader reader = new InputStreamReader(connection.getInputStream());
		      // Use the reader to parse the response
		      
		    } else {
		      // Handle error
		    }

	}
	
}
