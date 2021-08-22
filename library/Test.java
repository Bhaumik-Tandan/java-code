import mypack.*;
import java.util.*;
public class Test
{
    static void displayBooksArrayInfo(Book b[])
    {
        for(int i=0;i<b.length;i++)
        {
            System.out.println("\nData of book "+(i+1)+"\nBook id: "+b[i].getbookId());
            System.out.println("Book name: "+b[i].getbookName());
            System.out.println("Book rent price weekly: "+b[i].getrentPriceWeekly());
            System.out.println("Book description: "+b[i].getbookDescription());
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n=s.nextInt();
        Book lib[]=new Book[n];
        for(int i=0;i<n;i++)
        {
            lib[i]=new Book();
            System.out.println("Enter the  book id of book "+(i+1)+": ");
            lib[i].setbookId(s.nextInt());
            System.out.println("Enter the book name of book "+(i+1)+": ");
            s.nextLine();
            lib[i].setbookName(s.nextLine());
            System.out.println("Enter the rent price weekly of book "+(i+1)+": ");
            lib[i].setrentPriceWeekly(s.nextDouble());
            System.out.println("Enter the description of book "+(i+1)+": ");
            s.nextLine();
            lib[i].setbookDescription(s.nextLine());
        }
        displayBooksArrayInfo(lib);
    }
}