import java.util.Scanner;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.lang.Thread;
import java.net.InetAddress;


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
                System.out.println("Message Received: "+str);
            }
        }
        catch(Exception e){
            System.out.println("Error in receiving packet");
        }
    }
}

class Send extends Thread{
    DatagramSocket socket;
    int port;
    Send(DatagramSocket socket,int port){
        this.socket = socket;
        this.port=port;
    }
    public void run()
    {
        while(true)
        {
            try{
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        byte buffer[]=str.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(),this.port);
        socket.send(packet);
            }
            catch(Exception e){
                System.out.println("Error in sending packet: "+e);
            }
        }
    }

}
class Q1
{
public static void main(String[] a) 
{
    Scanner s=new Scanner(System.in);
    System.out.print("Enter your port number: ");
    int port=s.nextInt();
    System.out.print("Enter the other port: ");
    int receiver_port=s.nextInt();
    try{
    DatagramSocket ds=new DatagramSocket(port);
    Receive r=new Receive(ds);
    r.start();
    Send send=new Send(ds,receiver_port);
    send.start();
    }
    catch(SocketException e){
        System.out.println("Error in creating socket: "+e);
    }
}
}
