import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

class Client {

  public static void main(String[] args) throws Exception {
    Socket s = new Socket("localhost", 1099);
    Console c = System.console();
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    DataInputStream dis = new DataInputStream(s.getInputStream());
    String str = "ABCD";
    dos.writeUTF(str);
    System.out.println(dis.readUTF());
    str = "Abcd 93820";
    dos.writeUTF(str);
    System.out.println(dis.readUTF());
  }
}
