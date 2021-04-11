import java.util.*;

class Driver
{
    int drid;
    String drph,drli,drad,de_name;

    //Setter
    void set(int id,String ph,String li,String ad,String name)
    {
        drid=id;
        drph=ph;
        drli=li;
        drad=ad;
        de_name=name;
    }

    //Getter
    int getid()
    {
        return drid;
    }

    String getph()
    {
        return drph;
    }

    String getli()
    {
        return drli;
    }

    String getad()
    {
        return drad;
    }

    String getna()
    {
        return de_name;
    }

    @Override
    public String toString() { 
        return String.format("\nDriver data: "+drid+" "+drph+" "+drli+" "+drad+" "+de_name); 
    } 
}

class Customer
{
    int cuid;
    String cuph,cuad,cus_name;

    //Setter
    void set(int id,String ph,String ad,String name)
    {
        cuid=id;
        cuph=ph;
        cuad=ad;
        cus_name=name;
    }

    //Getter
    int getid()
    {
        return cuid;
    }

    String getph()
    {
        return cuph;
    }

    String getad()
    {
        return cuad;
    }

    String getna()
    {
        return cus_name;
    }

    @Override
    public String toString() { 
        return String.format("\nCustomer data: "+cuid+" "+cuph+" "+cuad+" "+cus_name); 
    }
}

class Rides
{
    int riid;
    String s_ad,e_ad,pay_met;
    double co;

    //Setter
    void set(int id,String ad,String ead,String p,double c)
    {
        riid=id;
        s_ad=ad;
        e_ad=ead;
        pay_met=p;
        co=c;
    }
    
    //Getter
    int getid()
    {
        return riid;
    }

    String getsad()
    {
        return s_ad;
    }

    String getead()
    {
        return e_ad;
    }

    String getp()
    {
        return pay_met;
    }

    double getco()
    {
        return co;
    }

    @Override
    public String toString() { 
        return String.format(riid+" "+s_ad+" "+e_ad+" "+pay_met+" "+co); 
    }
}
public class maths {

    //Method to print all rides
    static void pri(Rides r[])
    {
        System.out.println("Data of all rides\n");
        for(int i=0;i<r.length;i++)
        System.out.println(r[i]);
    }

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        Customer c=new Customer();
        System.out.print("\nEnter the values of customer data in the following order: \n"+
        "id, phone number, address and name: \n");
        c.set(s.nextInt(),s.next(),s.next(),s.next());
        System.out.println("\nThe data you entered is: ");
        System.out.println(c.getid()+" "+c.getph()+" "+c.getad()+" "+c.getna());

        Driver d=new Driver();
        System.out.println("\nEnter the values of driver data in the following order: \n"+
        " id, phone number, license number, address and name: \n");
        d.set(s.nextInt(),s.next(),s.next(),s.next(),s.next());
        System.out.println(d.getid()+" "+d.getph()+" "+d.getli()+d.getad()+" "+d.getna());

        Rides r[];
        r=new Rides[2];
        r[0]=new Rides();
        r[1]=new Rides();
        r[0].set(324,"ABCD","DEF","Cash",34.4);
        r[1].set(124,"JKSD","OLK","Card",14.4);
        
        System.out.println("Data for ride at index[0]: ");
        System.out.print(r[0].getid()+" "+r[0].getsad()+" "+r[0].getead()+r[0].getp()+" "+r[0].getco());
        System.out.println(c);
        System.out.println(d);
        pri(r);
    }
}