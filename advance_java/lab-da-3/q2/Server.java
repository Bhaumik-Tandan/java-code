import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;


class StringManipulator extends UnicastRemoteObject implements StringManipulatorInterface{
    StringManipulator() throws RemoteException
    {
        super();
    }
    public String add(String s1, String s2) throws RemoteException
    {
        return s1 + s2;
    }
    public String toLowerCase(String s) throws RemoteException
    {
        return s.toLowerCase();
    }
    public String toUpperCase(String s) throws RemoteException
    {
        return s.toUpperCase();
    }
    public String substring(String s,int StartIndex, int LastIndex) throws RemoteException
    {
        return s.substring(StartIndex, LastIndex);
    }

}
public class Server
{
    public static void main(String args[])
    {
        try
        {
            StringManipulator obj = new StringManipulator();
            LocateRegistry.createRegistry(1800);
            Naming.rebind("rmi://localhost:1800"+"/stringManipulator",obj);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}