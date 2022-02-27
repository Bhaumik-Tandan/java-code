import java.util.*;


class Buffer
{
 int size,index;
 int [] buffer;
 int capacity;
    Buffer(int size)
    {
    this.size=size;
    buffer=new int[size];
    index=-1;
    capacity=size;
    }
}

class Consumer extends Thread{
    Buffer b;
    int consumerNo;
    Consumer(Buffer x,int no)
    {
    b=x;
    consumerNo=no;
    }
    public void run()
    {
        while(true){
        synchronized(b)
        {
            try{
                while(b.capacity==b.size)
                b.wait();
                System.out.println("Consumer "+consumerNo+" consumed "+b.buffer[b.index]+" from index "+b.index);
                if(b.index==0)
                b.index=b.size-1;
                else
                b.index--;
                b.capacity++;
                b.notifyAll();
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Exception in consumer "+consumerNo);
            }
        }
    }

}

    }
    class Producer extends Thread{
        Buffer b;
        int producerNo;
        Producer(Buffer x,int no)
        {
        b=x;
           producerNo=no;
        }
       
        public void run()
        {
            while(true){
        synchronized(b)
        {
        try{
            while(b.capacity==0)
            b.wait();
           b.index=(b.index+1)%b.size;
           b.buffer[b.index]=(int)(Math.random()*1000);
           b.capacity--;
           System.out.println("Producer "+producerNo+" produced "+b.buffer[b.index]+" at index "+b.index);
           b.notifyAll();
           Thread.sleep(1000);
        }
        catch(Exception e){
               System.out.println("Exception in producer "+producerNo);
           }
        }}
        }
        }
       
           

public class Q1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of buffer: ");
        int size=sc.nextInt();
        Buffer b=new Buffer(size);
        System.out.print("Enter the number of producer: ");
        int p=sc.nextInt();
        System.out.print("Enter the number of consumer: ");
        int c=sc.nextInt();
        Producer[] p1=new Producer[p];
        Consumer [] c1=new Consumer[c];
        for(int i=0;i<p;i++)
        {
            p1[i]=new Producer(b,i+1);
            p1[i].start();
        }
        for(int i=0;i<c;i++)
        {
            c1[i]=new Consumer(b,i+1);
            c1[i].start();
        }
        
    }
}