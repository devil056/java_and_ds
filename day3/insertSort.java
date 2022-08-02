import java.util.*;

class InsertSort{
	public static void main(String[] args){
		int[] arr={12,4,5,2,89};
		System.out.println("Original array: "+Arrays.toString(arr));

		for(int k=1;k<arr.length-1;k++){
			int temp=arr[k];
			int j=k-1;
			while(j>=0 && temp<=arr[j]){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		System.out.println("Sorted array:"+Arrays.toString(arr));
	}
}
