//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int low=0,high = arr.length-1;

        int target = 10;
        int steps = 0;
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid]==target){
                System.out.println("Target Found  "+steps);
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

            steps+=1;
        }

        System.out.println("Not Found");

    }
}