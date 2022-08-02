import java.util.*;
class Bubble{
	static void bubbleSort(int a[]){
		int len=a.length;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(a[j]>a[j+1]){
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];

				}
			}
		}
	}
	public static void main(String[] args){
		int [] data={12,15,16,1,2,5,0,9,11};
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(data));
		Bubble.bubbleSort(data);
		System.out.println("Sorted in ascending order: ");
		System.out.println(Arrays.toString(data));
	}
}
