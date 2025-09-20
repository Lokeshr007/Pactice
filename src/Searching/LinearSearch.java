package Searching;

public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
       int target = 30;
       int steps=1;
       int n=arr.length;
       for(int i=0;i<n;i++){
           for(int j=0;j<n/2;j++) {
               if (target == arr[i]) {
                   break;
               }
           }
           steps++;
       }

       System.out.println(steps);
    }
}

