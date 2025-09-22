package DSA.Stack;

public class Runner {
    public static void main(String[] args){
        DynamicStack nums = new DynamicStack();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);
        System.out.println(nums.pop());
        System.out.println(nums.peek());
        nums.show();
    }
}
