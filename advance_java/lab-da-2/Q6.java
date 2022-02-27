import java.util.*;
import java.util.stream.*;
public class Q6 {
    static int printCount = 0,listCount=0,arrayCount=0;
    static List<Double> list = new ArrayList<Double>();
    static double[] array = new double[20];
    static Double randomDouble() {
        return Math.random()*10;
    }
    static void task(Double e) {
        if(printCount==0)
        {
            System.out.println("5 random numbers are: ");
        }
        if(printCount<5) {
            System.out.println(e);
            printCount++;
            return;
        }
        if(listCount<10)
        {
            list.add(e);
            listCount++;
            return;
        }
        if(listCount==10)
        {
            System.out.println("\nList of 10 random numbers is: ");
            list.stream().forEach(System.out::println);
            listCount++;
        }
        if(arrayCount<20)
        {
            array[arrayCount]=e;
            arrayCount++;
            return;
        }
        if(arrayCount==20)
        {
            System.out.println("\nArray of 20 random numbers is: ");
            for(int i=0;i<array.length;i++)
            {
                System.out.println(array[i]);
            }
            arrayCount++;
        }
    }
    public static void main(String[] args)
    {
        Stream<Double> stream = Stream.generate(Q6::randomDouble);
        stream.forEach(Q6::task);
    }
}
