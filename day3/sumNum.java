import java.util.*;

class SumImp{
	public static int SumDigit(int n){
		if(n<10){
			return n;
		}else{
			return (n%10)+SumDigit(n/10);
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		input.nextLine();
		System.out.println(SumDigit(num));
		input.close();		
	}
}
