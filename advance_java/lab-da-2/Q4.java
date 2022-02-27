import java.util.*;
public class Q4 {
    static Map<String,String> map = new HashMap<String,String>();

    static void addData()
        {
            map.put("a1234","Steve Jobs");
            map.put("a1235","Scott McNealy");
            map.put("a1236","Jeff Bezos");
            map.put("a1237","Larry Ellison");
            map.put("a1238","Bill Gates");
        }

    static void test()
        {
            System.out.print("\nEnter the key: ");
            Scanner sc = new Scanner(System.in);
            String key = sc.next();
            if(map.containsKey(key))
                System.out.println("The value is: " + map.get(key));
            else
                System.out.println("The key is not present in the map");
            
            System.out.println("1. Get the value of the key");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: test();
                        break;
                case 2: System.exit(0);
                        break;
                default: System.out.println("Invalid choice");
                         test();
            }

        }
    
    public static void main(String[] args)
    {
        addData();
        test();
    }
    
}
