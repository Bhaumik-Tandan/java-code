public class inner 
{
    static class in
    {
        static void inclass()
        {
           class infunclass
            {
               void fun()
                {
                    System.out.println("Infunclass");
                }
            }
           new infunclass().fun();
        }
        static void infun()
        {
            System.out.println("Infun");
            inclass();
        }
    }    
    static void fun()
    {
        System.out.println("fun");
        in.infun();
    }
    public static void main(String[] args)
    {
        fun();
    }
}
