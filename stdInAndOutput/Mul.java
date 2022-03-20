import java.lang.*;
import java.util.Scanner;
class Writter extends Thread
{
    @Override
   public void run()
    {
        try{
            while(true){
        System.out.println("abcd");
        Thread.sleep(3000);
            }
        }
        catch(Exception e){
        System.out.println(e);
        }
    }
}
class Read extends Thread
{
    @Override 
    public void run()
    {
        while(true)
        {
            Scanner s=new Scanner(System.in);
            int i=s.nextInt();
            System.out.println(i);
        }
    }
}
public class Mul{
    public static void main(String[] args)
    {
        Writter w=new Writter();
        w.start();
        Read r=new Read();
        r.start();
    }
}