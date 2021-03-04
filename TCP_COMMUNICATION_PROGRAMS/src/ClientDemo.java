import java.net.*;
import java.io.*;

class ClientDemo {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket("localhost", 96);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			System.out.print("Enter Message For Server:");
			str = br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Message From Server:"+ str2);
	
		}

		dout.close();
		s.close();
	}
}