import java.io.*;
import java.net.*;

class PrintText_Thread extends Thread {

  String ab;
  int na;

  PrintText_Thread(String a, int n) {
    ab = a;
    na = n;
  }

  public void run() {
    for (int i = 0; i < na; i++)
      System.out.println(ab);
    System.out.println(Thread.currentThread().getName() + " Terminated");
  }

}

class Data {
  public static void main(String[] args) {
    PrintText_Thread t1 = new PrintText_Thread("I am in FY", 10);
    PrintText_Thread t2 = new PrintText_Thread("I am in SY", 20);
    PrintText_Thread t3 = new PrintText_Thread("I am in TY", 30);
    t1.start();
    try{
    t2.join();
    }
    t2.start();
    t3.join();
    t3.start();
  }
}