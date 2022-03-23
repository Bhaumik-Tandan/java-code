import java.rmi.*;  
public interface StringManipulatorInterface extends Remote{  
    public String add(String s1, String s2) throws RemoteException;
    public String toLowerCase(String s) throws RemoteException;
    public String toUpperCase(String s) throws RemoteException; 
    public String substring(String s,int StartIndex, int LastIndex) throws RemoteException; 

    }
