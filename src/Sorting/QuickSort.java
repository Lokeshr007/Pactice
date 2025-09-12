package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {6,1,5,9,4,3,2};

        quicksort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int low, int high) {

        if(low<high){
            int part=partion(arr,low,high);

            quicksort(arr,low,part-1);
            quicksort(arr,part+1,high);
        }
    }

    private static int partion(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;

    }
}
