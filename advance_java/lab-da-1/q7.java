import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String reverse = "";
        for(String word : words){
            String reverseWord = "";
            for(int i = word.length()-1; i >= 0; i--){
                reverseWord += word.charAt(i);
            }
            reverse += "a"+reverseWord + "a ";
        }
        System.out.println(reverse);
    }   
}
