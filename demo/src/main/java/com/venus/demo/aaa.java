package com.venus.demo;

public class aaa {
    public static void main(String[] args) {
        int[] arr={11,13,15,17,19,21,23};
        System.out.println(binary(arr, 19, 0, arr.length-1));
    }
    public static int binary(int[] arr,int key,int left,int right){
        if (left>=right){
            return -1;
        }
        int middle = (left+right)/2;
        if(arr[middle]==key){
            return middle+1;
        }else if(arr[middle]>key){
            return binary(arr, key, left, middle-1);
        }else {
            return binary(arr, key, middle, right+1);
        }
    }
}
