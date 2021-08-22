import java.util.*;
class Cryptogram
{
    char[] alphabet, scrambled_alphabet;
    public void creat_alphabet()//initialses a random text
    {
        alphabet=new char[26];
        for(int i=0;i<26;i++)
        alphabet[i]=(char)((int)'a'+i);
    }
    
    public String toString()
    {
        return String.valueOf(alphabet)+"\n"+String.valueOf(scrambled_alphabet);
    }
    void swap(int i)
    {
        int p=(int)Math.floor(Math.random()*scrambled_alphabet.length);//selects a random position
        char t=scrambled_alphabet[p];
        scrambled_alphabet[p]=scrambled_alphabet[i];
        scrambled_alphabet[i]=t;
    }
    Cryptogram()
    {
        creat_alphabet();
        scrambled_alphabet=new char[alphabet.length];// Instantiate the scrambled array to the size of the alphabet array
        for(int i=0;i<scrambled_alphabet.length;i++)//Pass the contents of alphabet array to the scrambled array 
            scrambled_alphabet[i]=alphabet[i];
        for(int i=scrambled_alphabet.length-1;i>=0;i--)//goes backward
        swap(i);
    }
    String encrypt(String p)
    {
        String e="";
        for(int i=0;i<p.length();i++)
        e+=Character.toString(scrambled_alphabet[findCode(p.charAt(i))]);   
        return e;  
    }
    int findCode(char c)
    {
         for(int i=0;i<26;i++)
        if(c==alphabet[i])
        return i;
        return 0;
    }
    int findLetter(char c)
    {
         for(int i=0;i<26;i++)
        if(c==scrambled_alphabet[i])
        return i;
        return 0;
    }
    String decrypt(String p)
    {
        String e="";
        for(int i=0;i<p.length();i++)
        e+=Character.toString(alphabet[findLetter(p.charAt(i))]);   
        return e;  
    }
}
public class CryptogramClient

{

public static void main( String [] args )

{

Cryptogram cg = new Cryptogram();

System.out.println(cg); // print alphabet and substitution code


Scanner scan = new Scanner( System.in );


System.out.println( "\nEnter the phrase to encrypt:" );

String phrase = scan.nextLine( );


String code = cg.encrypt( phrase );


System.out.println( "The encrypted phrase is " + code );


String plainText = cg.decrypt( code );


System.out.println( "The decrypted phrase is " + plainText );

}

}