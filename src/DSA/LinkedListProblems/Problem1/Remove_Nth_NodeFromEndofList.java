package DSA.LinkedListProblems.Problem1;

//Given the head of a linked list, remove the nth node from the end of the list and return its head.

import DSA.LinkedListProblems.LinkedListNode;
import DSA.LinkedListProblems.ListNode;

//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//Example 2:
//
//Input: head = [1], n = 1
//Output: []
//Example 3:
//
//Input: head = [1,2], n = 1
//Output: [1]
public class Remove_Nth_NodeFromEndofList {

   public static void main(String[] args){
       LinkedListNode list =new LinkedListNode();
       int arr[] = {1,2,3,4,5};
       for(int i=0;i<arr.length;i++) {
           list.insert(arr[i]);
       }


       ListNode n = list.removeNthFromEnd(list.head,2);
       System.out.println(n.toString());
   }

}
