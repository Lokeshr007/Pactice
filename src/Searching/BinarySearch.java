package Searching;

public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target = 30;
        int l=0,r=arr.length-1;
        int steps=1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target){
                System.out.println("Found");
                break;
            }
            else if(arr[mid]<target){
                l = mid+1;
            }
            else {
                r = mid-1;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
