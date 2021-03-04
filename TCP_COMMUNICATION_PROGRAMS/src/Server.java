import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
//		1.creating server socket
		ServerSocket server = new ServerSocket(95);
		System.out.println("Waiting For Client");

		Socket socket = server.accept();

		BufferedReader br;
		PrintStream ps;
		String str;
		String outMsg;
		
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		str = br.readLine();
		while(str != "stop") {
			System.out.println("Message From Client :" + str);
			
			System.out.println("Enter Message for Server :");
			br = new BufferedReader(new InputStreamReader(System.in));
			ps = new PrintStream(socket.getOutputStream());
			outMsg = br.readLine();
			ps.println(outMsg);
			ps.close();
		}
		
	
		br.close();
		socket.close();
		server.close();
		

	}

}
