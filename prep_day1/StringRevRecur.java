import java.util.Scanner;

public class StringRevRecur {
    static void reverseString(String line){
        if((line==null) || (line.length()<=1)){
            System.out.print(line+" ");
        }else{
            System.out.print(line.charAt(line.length()-1)+"");
            reverseString(line.substring(0,line.length()-1));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        reverseString(input);
    }
}
