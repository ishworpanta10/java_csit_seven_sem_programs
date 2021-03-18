//Step 1

import java.rmi.*;

public interface Rem extends Remote {
	public int sumNum (int a , int b) throws RemoteException;
	public int diffNum(int a, int b) throws RemoteException;
}
