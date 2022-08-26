import java.util.Scanner;

class FibRecu{
    static int fibGen(int x){
        if(x==0){
            return 0;
        }
        if(x==1||x==2){
            return 1;
        } else{
            return (fibGen(x-1)+fibGen(x-2));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            System.out.print(fibGen(i)+" ");
        }
    }
}
