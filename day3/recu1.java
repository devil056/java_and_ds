import java.util.*;

class Fibonocci{
	public static int feb(int n){
		if(n==0){
			return 0;
		}else if(n==1 || n==2){
			return 1;
		} else{
			return feb(n-1)+feb(n-1);
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		input.nextLine();
		for(i=0;i<5;i++){
			System.out.println(feb(i));
		}
		input.close();		
	}
}
