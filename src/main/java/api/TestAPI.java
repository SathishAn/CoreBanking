package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TestAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String webPage = "http://10.30.65.9:8082/BrowserWeb/servlet/BrowserLoginServlet";
		String authStringEnc = "SATHISH.1:123456";
		URL url = new URL(webPage);
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
       
        InputStream is = urlConnection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        System.err.println(isr.read());
        int character = isr.read();  // reads a single character
        char[] buffer = new char[4096];
       System.out.println(isr.read(buffer)); 
       BufferedReader reader = new BufferedReader(isr);
       String line = reader.readLine(); //
        System.out.println(line);
        
        
      
		
        
	}

}
