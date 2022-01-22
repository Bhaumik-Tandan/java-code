import java.util.Scanner;

public class q3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        int max=0;
        String maxstr="";
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the string for index " + i + ": ");
            str[i] = sc.next();
            if(str[i].length() > max)
            {
                max = str[i].length();
                maxstr = str[i];
            }
        }
        System.out.println("The longest string is: " + maxstr);     

    }
}
