import java.util.Scanner;

class SumDigit {
    static void divisible3(int x){
        if(x%3==0){
            System.out.println("The number provided is divisible by 3.");
        }
    }
    static int sumOfDigits(int num){
        int sum;
        if(num==0){
            return 0;
        }else{
            sum=(num%10)+sumOfDigits(num/10);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        sc.close();
        System.out.println(sumOfDigits(num));
        divisible3(sumOfDigits(num));
    }
}
