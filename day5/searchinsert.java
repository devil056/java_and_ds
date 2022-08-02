import java.util.*;

class SearchInsert{
    public static void main(String[] args){
        int[] array1={1,3,5,6};
        Scanner sc=new Scanner(System.in);
        int searchNum=sc.nextInt();
        for(int i=0;i<array1.length;i++){
            if(array1[i]==searchNum){
                System.out.println("Number found at position:"+i);
            }else if(array1[i]<searchNum && array1[i+1]>searchNum){
                    System.out.println("Value not found. But incase if had it been in array it would occupy the position:");
                    System.out.println(i+1);
            } else{
                System.out.println("Value not found. But incase if had it been in array it would occupy the position:");
                System.out.println(array1.length);
            }
        }
        sc.close();
    }
}