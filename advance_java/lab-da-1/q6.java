import java.util.Scanner;

interface Sports {
    int wightage=8;
    void calculateScore();
}

class Subject {
    int score;
    String name;
}

class Personal
{
    Subject s[]=new Subject[5];
    void take_input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            s[i]=new Subject();
            System.out.print("\nEnter name of subject "+(i+1)+" : ");
            s[i].name=sc.next();
            System.out.print("\nEnter score of subject "+(i+1)+" : ");
            s[i].score=sc.nextInt();
        }
    }
}

class Academic extends Personal implements Sports 
{

    public void calculateScore()
    {
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+s[i].score;
        }
        System.out.println("Total score is "+sum);
        System.out.println("Sports weightage is "+wightage);
        System.out.println("Sports score is "+wightage*sum/100);
    }
}

public class q6 {
    public static void main(String[] args)
    {
        Academic a=new Academic();
        a.take_input();
        a.calculateScore();
    }
}
