import java.util.*;

class Palindrome{
	static int recur(int n,int temp) {
		if(n == 0) { 
			return temp ;
		}else {
      	temp=(temp*10 + n%10);
       //System.out.println("recursive number"+ (10)*(n%10));
			return recur(n/10,temp) ;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int out=recur(num,0);
		System.out.println(out);
	}
}