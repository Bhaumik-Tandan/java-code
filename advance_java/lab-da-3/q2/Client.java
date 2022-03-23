import java.rmi.*;  
public class Client {
    public static void main(String args[]){  
        try{  
        StringManipulatorInterface stub=(StringManipulatorInterface)Naming.lookup("rmi://localhost:1800/stringManipulator");  
        System.out.println("ADD: "+stub.add("Bhaumik ","Tandan"));
        System.out.println("To upper: "+stub.toUpperCase("bhaumik")); 
        System.out.println("To lower: "+stub.toLowerCase("BHAUMIK"));
        System.out.println("Substring: "+stub.substring("BHAUMIK",1,3));
        }catch(Exception e){}  
        }  
}
