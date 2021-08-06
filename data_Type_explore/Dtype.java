//Range of byte -127 to 128
public class Dtype{
    public static void main(String args[])
    {
        //byte a=128;//losely conversion error will come
        byte a=127;//executed
        // short b=345345;//losely conversion error will come
        //if flaot in range it works without writing f
        // float k=343.3243333333333333333333333333333333333333333;//double convert into float may give losely
        float b=343.3243333333333333333333333333333333333333333f;//float given to float
        double d=323323e-3;//given in order scientific notation
        b=234e-2f;//for float
        boolean bol=true;
        // System.out.print(bol);//prints true in case of c it prints 1
        //char ch=7979879;//gives error becasue ascii range exceeded
        char ch=67;
        // System.out.print(ch);//print ascii value character
        System.out.println('3'+'3'+'2');//prints the sum of acii value of all
        char ac=65,bc=89,dc=90;
         System.out.println(ac+bc+dc);//this also prints the sum
         ac='a';bc='f';dc='o';
          System.out.println(ac+bc+dc);//this also prints the sum
           System.out.println(ac+""+bc+""+dc);//this pritns the characters
        // int in=34.3;//gives error beause of losesy loss
        int in =(int)32.3;
        System.out.println(in);
        b=33/2;
        System.out.println(b);//prints 16.0
    }
}