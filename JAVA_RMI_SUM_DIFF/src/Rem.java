import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Rem extends Remote {
	public int sumNum (int a , int b) throws RemoteException;
	public int diffNum(int a, int b) throws RemoteException;
}
