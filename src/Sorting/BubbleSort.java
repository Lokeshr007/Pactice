package Sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,2,4,1,3};
        int n= arr.length;
        for(int i = 0; i < n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
