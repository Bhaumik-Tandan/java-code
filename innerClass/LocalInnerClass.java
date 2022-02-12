public class LocalInnerClass {
    public static void main(String[] args) {
        int x=34;
        class Inner {
            public void print() {
                System.out.println(x);
            }
        }
        Inner inner = new Inner();
            inner.print();
    }
}
