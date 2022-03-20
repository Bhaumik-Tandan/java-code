import java.util.Scanner;
import java.net.SocketException;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;

class Send extends Thread{
    DatagramSocket socket;
    InetAddress ip;
    int port;
    public Send(DatagramSocket socket,InetAddress ip,int port){
        this.socket = socket;
        this.ip = ip;
        this.port = port;
    }
    public void run(){
        byte buffer[];
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String s=sc.nextLine();
            buffer=s.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length,this.ip,this.port);
            try{
                this.socket.send(packet);
            }
            catch(IOException e){
                System.out.println("Error in sending packet: "+e);
            }
            catch(Exception e){}
        }
      
    }
}

class Receive extends Thread{
    DatagramSocket socket;
    public Receive(DatagramSocket socket){
        this.socket = socket;
    }
    
    public void run()
    {
        DatagramPacket packet =null; 
        byte buffer[];
        try{
            while(true){
                buffer=new byte[1024];
                packet=new DatagramPacket(buffer,1024);
                socket.receive(packet);
                String str = new String(buffer);
                System.out.println("Server: "+str);
            }
        }
        catch(Exception e){
            System.out.println("Error in receiving packet");
        }
    }
}

class Client {

  public static void main(String[] a) {
      Scanner s=new Scanner(System.in);
    System.out.print("Enter the port number: ");
    int port=s.nextInt();

    try{
    DatagramSocket ds=new DatagramSocket();
    InetAddress ip = InetAddress.getLocalHost();    
    Send sender=new Send(ds,ip,port);
    sender.start();
    Receive r=new Receive(ds);  
    r.start();
    }
    catch(SocketException e){
        System.out.println("Error in creating socket: "+e);
    }
    catch(IOException e){
        System.out.println("Error in getting ip: "+e);
    }
  }
}
