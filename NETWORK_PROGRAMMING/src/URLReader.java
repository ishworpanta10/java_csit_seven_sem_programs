import java.net.*;
import java.io.*;

/*public class URLReader {
	public static void main(String[] args) throws Exception {
		URL oracle = new URL("http://www.ishworpanta.com.np/");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}
}*/

//Alternative

public class URLReader {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.ishworpanta.com.np/");
		URLConnection yc = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	
	}
}