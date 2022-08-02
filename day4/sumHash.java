//[2,7,11,15,1,12] t=> 13
//12,1 11,2 
//hashmaps
import java.util.*;

class SumTwo{

  public int[] findTwo(int []nums,int target){
    for (int i=0;i<nums.length;i++){
      for (int j=i+1;j<nums.length;j++){
        if (nums[i]+nums[j]==target){
          return new int[]{i,j};
        }
      }
    }
    return new int[]{};
  }
  public int [] sumTwo(int [] nums, int target){

    Map<Integer,Integer> foundSet=new HashMap<>();

    int [] returns =new int [2];

    for (int i=0;i<nums.length;i++){
      Integer now=nums[i];
      //13 to be the sum =>2 , 11
      Integer lookingFor=target-now;
      if (foundSet.containsKey(lookingFor)){
        returns[0]=foundSet.get(lookingFor);
        returns[1]=i;
        return returns;
      }else{
        foundSet.put(now,i);
      }
      
    }

    return returns;
  }
  public static void main(String args[]){

    SumTwo st1=new SumTwo();

    int[] arr=new int[2];
    //arr=st1.sumTwo(new int[]{2,7,11,15,1,12},13);
    //System.out.println(arr[0]+ " " + arr[1]  );
   //System.out.println(arr.length);
   /* for (int element:arr){
      System.out.println(element);
    }*/
    int[] rr=new int[2];
    rr=st1.findTwo(new int[]{2,7,11,15,1,12},13);
      for (int element:rr){
      System.out.println(element);
    }
  }
}