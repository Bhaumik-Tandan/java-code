import java.util.Scanner;

public class q2 {
    static Scanner sc = new Scanner(System.in);
    static String[] str_arr;
    static int[] int_arr;
    static char[] char_arr;

    static void search(int n)
    {
        int l=int_arr.length;
        for(int i=0;i<l;i++)
        {
            if(int_arr[i]==n)
            {
               System.out.println("Element found at index "+i);
               return;
            }
        }
        System.out.println("Element not found");
    }

    static void search(char n)
    {
        int l=char_arr.length;
        for(int i=0;i<l;i++)
        {
            if(char_arr[i]==n)
            {
               System.out.println("Element found at index "+i);
               return;
            }
        }
        System.out.println("Element not found");
    }

    static void search(String n)
    {
        int l=str_arr.length;
        for(int i=0;i<l;i++)
        {
            if(str_arr[i].equals(n))
            {
               System.out.println("Element found at index "+i);
               return;
            }
        }
        System.out.println("Element not found");
    }

    static void menu()
    {
        System.out.println("Search for:- \n1.Number\n2.Character\n3.String\n4.Exit\nEnter your choice: ");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.print("Enter the number: ");
                int n=sc.nextInt();
                search(n);
                menu();
                break;
            case 2:
                System.out.print("Enter the character: ");
                char ch=sc.next().charAt(0);
                search(ch);
                menu();
                break;
            case 3:
                System.out.print("Enter the string: ");
                String s=sc.next();
                search(s);
                menu();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice");
                menu();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array of numbers: ");
        int n=sc.nextInt();
        int_arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the number at position "+(i+1)+": ");
            int_arr[i]=sc.nextInt();
        }
        System.out.print("Enter the size of array of characters: ");
        n=sc.nextInt();
        char_arr=new char[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the character at position "+(i+1)+": ");
            char_arr[i]=sc.next().charAt(0);
        }
        System.out.print("Enter the size of array of strings: ");
        n=sc.nextInt();
        str_arr=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the string at position "+(i+1)+": ");
            str_arr[i]=sc.next();
        }
        menu();
    }
}
