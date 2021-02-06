import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMIServer {
	public static void main(String[] args) {
		try {
			RemImplementation local_obj = new RemImplementation();
			Naming.rebind("ADDSUB", local_obj);
			System.out.println("RMI Server Started");
		} catch (RemoteException re) {
			System.out.println(re);
		} catch (MalformedURLException mfe) {
			System.out.println(mfe);
		}
	}
}