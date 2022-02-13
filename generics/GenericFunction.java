class GenericFunction
{
    <T>GenericFunction(T t)
    {
        System.out.println(t);
    }
    static<T>void fun(T t)
    {
        System.out.println(t+" is a "+t.getClass().getName());
    }
    public static void main(String args[])
    {
        GenericFunction gf = new GenericFunction("Hello");
        gf=new GenericFunction(10);
        fun("Hello");
        fun(43);
        fun(43.543);
    }
}