import java.util.*;

class StringRecur{
	public static int CharCount(String input){
		int length=input.length();
		if(length==0 || length == 1){
			return 0;
		} else {
			if(input.substring(0,2).equals("hi")){
				return 1+CharCount(input.substring(2));
			}else{
				return CharCount(input.substring(1));
			}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("The number of times hi is present in a given string: "+CharCount(str));
		sc.close();
	}
}
