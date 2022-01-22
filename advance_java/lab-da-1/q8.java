import java.util.Scanner;

class InvalidLength extends Exception
{
    public InvalidLength(int a,int b,int c)
    {
        super("A triangle with sides "+a+" "+b+" "+c+" is invalid");
    }
}

public class q8 {
    public static void area(int a,int b,int c)
    {
        double s = (a+b+c)/2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle is "+area);
    }
    public static void main(String[] args) throws InvalidLength {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the length of the sides of the triangle: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
            area(a,b,c);
        else
            throw new InvalidLength(a,b,c);
    }    
}
