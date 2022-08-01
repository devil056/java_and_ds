package com.day2;

//Linear search
//takes time to go through each and every element inorder to find the input
//best case O(1) and the worst case is O(n) where n- no of elements in the array

import java.util.Scanner;

public class first {

    static void findItem(int[] arr,int item){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==item){
                System.out.println("Item found at position:"+i);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Data Structures");
        int[] inputArray={12,87,56,9,32};
        Scanner sc=new Scanner(System.in);
        findItem(inputArray,sc.nextInt());
    }
}
