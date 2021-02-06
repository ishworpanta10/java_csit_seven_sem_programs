import java.io.*;
import java.net.*;

class ClientArea {
	public static void main(String args[]) throws IOException {

		Socket s = new Socket("localhost", 95);
		BufferedReader br;
		PrintStream ps;
		String str;
		System.out.println("Enter Radius  :");
//		getting radius from terminal
		br = new BufferedReader(new InputStreamReader(System.in));
		ps = new PrintStream(s.getOutputStream());
//		sending radius to server
		ps.println(br.readLine());
//		receive area from server
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		str = br.readLine();
		System.out.println("Area of the circle is : " + str);
		br.close();
		ps.close();
	}
}