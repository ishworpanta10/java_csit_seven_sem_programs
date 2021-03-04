import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket conn = new Socket("localhost", 95);
		BufferedReader br;
		PrintStream ps;
		String str;
		
		System.out.println("Enter Message For Server :");
		br = new BufferedReader(new InputStreamReader(System.in));
		ps = new PrintStream(conn.getOutputStream());
		ps.println(br.readLine());
		
//		receive from server
		br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		str = br.readLine();
		
		System.out.println("Reply From Server :" + str);

		conn.close();
		br.close();
		ps.close();

	}

}
