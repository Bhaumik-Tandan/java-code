import java.util.*;
public class Q3 {

    static Map<String,Integer> cache = new HashMap<String,Integer>();
    static int countUnique(String s) {
        if(cache.containsKey(s))
            return cache.get(s);
        Map<Character,Boolean> alphabetFrequency = new HashMap<Character,Boolean>();
        for(int i=0;i<s.length();i++)
                alphabetFrequency.put(s.charAt(i),true);
        int count = alphabetFrequency.size();
        cache.put(s,count);
        return count;
    }

    static void printResults(String s) {
        System.out.println("String: "+s);
        System.out.println("Unique characters: "+countUnique(s));
    }
    public static void main(String[] args)
    {
        printResults("Tandan");
        printResults("Bhaumik");
        printResults("Tandan");
    }
}