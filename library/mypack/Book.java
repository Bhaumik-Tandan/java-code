package mypack;
public class Book
{
    int bookID;
    String bookName;
    double rentPriceWeekly;
    String bookDescription;
    boolean isAvailable;
    public double calculateWeeklyIncome()
    {
        if(isAvailable)//if book is available
        return rentPriceWeekly;
        return 0;
    }
    public int getbookId()
    {
        return bookID;
    }
    public void setbookId(int b)
    {
        bookID=b;
    }
    public String getbookName()
    {
        return bookName;
    }
    public void setbookName(String b)
    {
        bookName=b;
    }
    public double getrentPriceWeekly()
    {
        return rentPriceWeekly;
    }
    public void setrentPriceWeekly(double b)
    {
        rentPriceWeekly=b;
    }
    public String getbookDescription()
    {
        return bookDescription;
    }
    public void setbookDescription(String b)
    {
        bookDescription=b;
    }
}