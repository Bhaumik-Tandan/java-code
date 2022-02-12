interface a{
    void ab();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        a a = new a() {
            public void ab() {
                System.out.println("AnonymousInnerClass");
            }
        };
        a.ab();
    }
    
}
