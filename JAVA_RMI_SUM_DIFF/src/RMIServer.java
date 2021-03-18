import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
	public static void main(String[] args) throws Exception {
		try {
			RemImplementation local_obj = new RemImplementation();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("add", local_obj);
			System.out.println("RMI Server Started");
		} catch (RemoteException re) {
			System.out.println(re);
		} catch (MalformedURLException mfe) {
			System.out.println(mfe);
		}
	}
}
