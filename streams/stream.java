import java.io.*;
class stream 
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream f=new FileInputStream("fr.txt");
        FileOutputStream o=new FileOutputStream("sl.txt");
        DataOutputStream d=new DataOutputStream(o);
        d.writeChar('7');
        d.writeInt(21);
        d.writeDouble(21.321);
        d.writeChars("sdfds");
        d.flush();
        d.close();
        DataInputStream e=new DataInputStream(new FileInputStream("sl.txt"));
        System.out.println(e.readChar());
        System.out.println(e.readInt());
        System.out.println(e.readDouble());
        System.out.println(e.readChar());
        System.out.println(e.readChar());
        System.out.println(e.readChar());
    }    
}
