package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){

        int arr[] = {3,4,1,5,6,2};

        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int left, int right) {
        if(left<right){

            int mid = (left+right)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);

            merge(arr,left,mid,right);

        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1= mid-left+1;
        int n2 = right-mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int x=0;x<n1;x++){
            leftArr[x]=arr[left+x];
        }

        for(int x=0;x<n2;x++){
            rightArr[x]=arr[mid+1+x];
        }

        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                i++;

            }
            else{
                arr[k]=rightArr[j];
                j++;
            }

            k++;
        }


        while(i<n1){
            arr[k++]=leftArr[i];
            i++;
        }


        while(j<n2){
            arr[k++]=rightArr[j];
            j++;
        }



    }
}
