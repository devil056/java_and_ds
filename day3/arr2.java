import java.util.*;
class Cubes{
	public static int finder(int num){
		int res= num*num*num;
		System.out.println("The cube of "+num+" is "+res);
		return res;
	}
	public static void main(String[] args){
		int arr[]={1,2,3};
		int cube[]=new int [arr.length];
		for(int i=0;i<arr.length;i++){
			cube[i]=finder(arr[i]);
		}
		System.out.println(Arrays.toString(cube));
	}
}
