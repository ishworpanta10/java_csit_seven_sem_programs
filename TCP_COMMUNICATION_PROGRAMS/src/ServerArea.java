import java.io.*;
import java.net.*;

public class ServerArea {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(93);
		
		System.out.println("Waiting for Client :");
		
		Socket s = ss.accept();
		
		System.out.println("Client Connected :");
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
//		BufferedReader bf =new  BufferedReader(new InputStreamReader(System.in));
		
//		getting data from client
		double radius;
		radius = Double.parseDouble(din.readUTF());
//		radius = din.readDouble();
		
//		calculating area of circle
		double area =  Math.PI * radius * radius;
		
//		sending radius to client
		dout.writeDouble(area);
		
		dout.close();
		din.close();
		s.close();
		ss.close();
		 

	}

}
