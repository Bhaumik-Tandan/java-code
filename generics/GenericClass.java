public class GenericClass<T> {
    private T t;
    void setT(T t) {
        this.t = t;
    }
    T getT() {
        return t;
    }
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass<String>();
        gc.setT("Hello");
        System.out.println(gc.getT()+" is a "+gc.getT().getClass().getName());
        GenericClass<Integer> gc1 = new GenericClass<Integer>();
        gc1.setT(10);
        System.out.println(gc1.getT()+" is a "+gc1.getT().getClass().getName());
    }
    
}
