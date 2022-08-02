import java.util.*;

class First{
	public static int find(int[] arr,int value){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				System.out.println(arr[i]+" == " + value);
				++count;
			}else {
				System.out.println(arr[i]+" != "+value);
			}
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println("Hello world!!");
		int arr[]={1,2,1,1,5,5,6,7,8,1,1};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element u wish to find: ");
		int ele=sc.nextInt();
		sc.nextLine();
		System.out.println("The no. of occurances for 1 is: "+find(arr,ele));
	}
}
