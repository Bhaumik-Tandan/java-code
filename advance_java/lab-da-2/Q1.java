// Implement the producer consumer problem for the bounded buffer of size ‘n java
class Producer{
    Producer(int n){
        this.n = n;
    }
}
class Q1{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        BoundedBuffer b = new BoundedBuffer(n);
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}