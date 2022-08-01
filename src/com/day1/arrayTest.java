package com.day1;

import java.util.Arrays;

public class arrayTest {
    public static void main(String[] args){
        //In case if we are to define the array after variable only that variable will hold array values
        //and the rest of the two just hold single integer values
        int a[],b,c;
        int[] d,e;
        //disadvantage of using the arrays is that even though we defined it earlier we need to again feed the values
        //stating that it needs to considered as an array. It is and array literal
        //https://www.geeksforgeeks.org/arrays-in-java/
        a=new int[]{1,2,3,5,68,9};
        b=3;
        c=1;
        d=new int[]{3,5,6};
        e=new int[]{9,10,11};
        System.out.println(Arrays.toString(a)+" "+b+" "+c);
        System.out.println("Complete arrays defined");
        System.out.println(Arrays.toString(d)+" "+Arrays.toString(e));
    }
}
