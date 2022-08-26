import java.math.BigInteger;
import java.util.Scanner;

class prep1 {
    static BigInteger factorial(int x){
        if(x==1){
            return BigInteger.ONE;
        }else{
            return BigInteger.valueOf(x).multiply(factorial(x-1));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you wish to find the factorial of: ");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.println(factorial(num));
        sc.close();
    }
}
