import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
//		1. creating socket
		Socket conn = new Socket("localhost",95);
		
//		2. getting socket IO Stream
//		 Input Stream => Receive info from server
//		 Output Stream => Sending info to server

		PrintWriter out = new PrintWriter(conn.getOutputStream());
		out.println("Hello Server From Client");
	
		
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String message = in.readLine();
		System.out.println("Message from Server :" + message);
		
//		3. Closing conn and out
		out.close();
		conn.close();

	}

}
