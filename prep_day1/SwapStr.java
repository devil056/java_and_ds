import java.util.Scanner;

class SwapStr {
    static String revString(String ex){
        if(ex==null||ex.equals("")){
            return ex;
        }
        return revString(ex.substring(1))+ex.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type the string you wish to check for palindrome: ");
        String input=sc.nextLine();
        String reverse=revString(input);
        System.out.println(reverse);
        if(input.equalsIgnoreCase(reverse)){
            System.out.println("The typed string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
    }
}
