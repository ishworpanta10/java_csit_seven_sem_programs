
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;

public class RMIClient {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter First Number: ");
//		int a = scanner.nextInt();
//
//		System.out.println("Enter Second Number: ");
//		int b = scanner.nextInt();

		try {
			String ip = "rmi://localhost/add";
			Rem rem_obj = (Rem) Naming.lookup(ip);
			System.out.println("Sum = " + rem_obj.sumNum(4, 5));
			System.out.println("Difference = " + rem_obj.diffNum(5, 2));
			System.out.println("Completed RMI Program");
		} catch (RemoteException re) {
			System.out.println(re);
		} catch (MalformedURLException mfe) {
			System.out.println(mfe);
		} catch (NotBoundException nbe) {
			System.out.println(nbe);
		}

	}

}
