import java.util.*;
class Coin_Flipping implements Runnable{
    boolean flipCoin()
    {
        //0 means head
        //1 means tail
        return Math.random()<0.5;
    }
    @Override
    public void run()
    {
        try{
        int c=0;
        for(int i=0;i<1000;i++)
        {
            boolean x=flipCoin();
            if(x==false)
            {
                c++;
                continue;
            }
            if(c>=3){
            System.out.println(c+" consecutive heads were given by "+Thread.currentThread().getName());
            Thread.sleep(1000);
            }
            c=0;   
        }
    }
    catch(InterruptedException e){
        System.out.println(Thread.currentThread().getName()+" interrupted");
    }
    }

}

class TaskQueue{
    void execute(Coin_Flipping c)
    {
        Thread t=new Thread(c);
        t.start();
    }
}
public class Q5 {
    public static void main(String[] args)
    {
        TaskQueue t=new TaskQueue();
        for(int i=0;i<5;i++)
        t.execute(new Coin_Flipping());
    }
}
