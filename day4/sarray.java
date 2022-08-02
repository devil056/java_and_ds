import java.util.*;
class SortedArray1{
	public static void main(String args[]){
		int[] arr={1,1,2,2,3,3,3,4,5,5,5};
		int i=0;
		int j=0;
		while(i<arr.length){
			if(arr[i]>arr[j]){
				j++;
				arr[j]=arr[i];
			}
			i++;
		}
		for(i=0;i<=j;i++){
			System.out.println("elements are: "+arr[i]);
		}
	}
}
