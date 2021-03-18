import java.net.*;
import java.io.*;

class ServerDemo {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(96);
		System.out.println("Waiting for client :");
		Socket s = ss.accept();
		System.out.println("Client Connected :");
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = din.readUTF();
			System.out.println("Message from Client: " + str);
			System.out.print("Enter Message For Client:");
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		dout.close();
		din.close();
		s.close();
		ss.close();
	}
}