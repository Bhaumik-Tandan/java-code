import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
class ReverServer {

  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(1099);
    Socket s = ss.accept();
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    DataInputStream dis = new DataInputStream(s.getInputStream());
    System.out.println("Client is connected");
    int f=0;
    while (true) {
        try{
      String str = dis.readUTF();
      char ch[] = str.toCharArray();
      String rev = "";
      for (int i = ch.length - 1; i >= 0; i--) {
        rev += ch[i];
        f=0;
      }
      dos.writeUTF(rev);
    }
    catch(SocketException e)
    {
        if(f==0)
        System.out.print("The client has stopped sending");
        f=1;
    }
    }
  }
}
