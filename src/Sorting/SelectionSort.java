package Sorting;

import java.util.Arrays;

public class SelectionSort{
    public static  void main(String[] args){
        int arr[]={6,5,2,9,3,4};

        int minIndex=-1;
        for(int i=0;i<arr.length;i++){
            minIndex = i;

            for(int j = i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j])
                    minIndex = j;
            }

            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}