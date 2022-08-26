import java.util.Scanner;

class recurTest {
    static int fact(int x){
        if(x==1){
            return 1;
        }else{
            return x*fact(x-1);
        }
    }

    static int fib(int x){
        if(x==0){
            return 0;
        }
        if(x==1||x==2){
            return 1;
        }else{
            return (fib(x-1)+fib(x-2));
        }
    }

    public static void main(String[] args){
        int num=7;
        System.out.println(recurTest.fact(5));
        for(int i=0;i<20;i++){
            System.out.print(recurTest.fib(i)+" ");
        }
    }
}
