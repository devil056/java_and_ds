import java.util.Scanner;
 
 
class BinSearch{
 
 
  int binarySearch(int array[],int element, int low,int high){
 
    while (low<=high){
      int mid=low+(high-low)/2;
 
      if (array[mid]==element){
        System.out.println("value of low,mid,high "+low + " " + mid  +" " +high);
 
        return mid;
      }
      if (array[mid]<element){
        low=mid+1;
           System.out.println("value of low,mid,high "+low + " " + mid  +" " +high);
      }
      else{
 
        high=mid-1;
           System.out.println("value of low,mid,high "+low + " " + mid  +" " +high);
      }
 
    }
    return -1;
  }
 
public static void main(String args[]){
  BinSearch obj=new BinSearch();
 
  int [] arr={3,4,5,6,7,8,9};
 
  int n=arr.length;
 
  Scanner input=new Scanner(System.in);
 
  System.out.print("Enter the element to be searched: ");
 
  int element=input.nextInt();
 
  input.close();
  int result= obj.binarySearch(arr,element,0,n-1);
 
  if (result==-1){
    System.out.println("Not found");
  }
  else{
    System.out.println("Element found at "+ result +" index");
  		}
	}
}
