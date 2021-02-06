import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemImplementation extends UnicastRemoteObject implements Rem {
	public RemImplementation() throws RemoteException{}
	
	public int sumNum(int a , int b) {
		return (a+b);
	}
	
	public int diffNum(int a, int b) {
		return (a-b);
	}
}
