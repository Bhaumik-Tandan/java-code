import java.util.Scanner;

class Array
{
    int size,index;
    int [] arr;
    int capacity;
       Array(int size)
       {
       this.size=size;
       arr=new int[size];
       index=-1;
       capacity=size;
       }

}
class A extends Thread{
    Array obj;
   
    A(Array x)
    {
    obj=x;
    }
   
    public void run()
    {
        while(true){
    synchronized(obj)
    {
    try{
   while(obj.capacity==0)
    obj.wait();
    obj.index=(obj.index+1)%obj.size;
    obj.arr[obj.index]=(int)(Math.random()*100);
    obj.capacity--;
    System.out.println("A wrote "+obj.arr[obj.index]+" at index "+obj.index);
    obj.notifyAll();
    Thread.sleep(1000);
    }
    catch(Exception e){
    System.out.println("Exception in A");
    }
}
    
    }
    }
}
  
class B extends Thread
{
 Array obj;
 B(Array x)
 {
 obj=x;
 }
 public void run()
 {
    while(true){
        synchronized(obj)
        {
        try{
       while(obj.capacity==obj.size)
       obj.wait();
       System.out.println("B read "+obj.arr[obj.index]+" at index "+obj.index);
       if(obj.index==0)
       obj.index=obj.size-1;
       else
       obj.index--;
       obj.capacity++;
       obj.notifyAll();
       Thread.sleep(1000);
        }
        catch(Exception e){
        System.out.println("Exception in B");
        }
    }
 }
}
}



public class Q2 {
public static void main(String[] args)throws Exception  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size=sc.nextInt();
    Array obj=new Array(size);
    A a=new A(obj);
    B b=new B(obj);
    a.start();
    b.start();    
}    
}
