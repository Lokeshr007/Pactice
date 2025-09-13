package Searching;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,7,8};
        int target = 5;
        int found= -1;
        for(int nums:arr){
            if(nums==target){
                found = 1;
            }
        }
        if(found!=1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found");
        }
    }
}

