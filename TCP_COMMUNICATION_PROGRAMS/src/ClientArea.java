import java.net.*;
import java.io.*;

public class ClientArea {

	public static void main(String[] args) throws UnknownHostException, IOException {
//		creating socket
		Socket s = new Socket("localhost", 93);
		System.out.println("Client Program Started");
		
//		making varaible to send, receive data to and from server and take input from console
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
//		making string variable to hold console value
		String radius;
		System.out.println("Enter the radius of server:");
//		reading console radius value from user
		radius = bf.readLine();
		
//		sending radius to server
		dout.writeUTF(radius);
		
//		reading calculagted radius value from server
		double area;
		area = din.readDouble();
		System.out.println("The area of circle is "+ area);
		
		din.close();
		dout.close();
		s.close();
	}

}
