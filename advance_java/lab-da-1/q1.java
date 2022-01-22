import java.util.Scanner;

public class q1
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("(19BIT0292)Enter the number: ");
        int n=s.nextInt();
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        //check rev is prime or not
        int flag=0;
        for(int i=2;i<=rev/2;i++)
        {
            if(rev%i==0)
            {
                flag=1;
                break;
            }
        }

        if(rev==1)
        System.out.print("Reverse of "+temp+" is "+rev+" which is neither prime nor composite");
        else if(flag==0)
            System.out.println("Reverse of "+temp+" which is "+rev+" is a prime number");
        else
            System.out.println("Reverse of "+temp+" which is "+rev+" is not a prime number");
    }
}