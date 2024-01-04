import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
       int start = 0, end = nums.length - 1;
       while(start <= end);
       int mid = (start + end)/2;
       if(nums[mid] == target){
           return mid;
       }
       if(nums[mid] < target){
           start = mid + 1;
       }else{
           end = mid - 1;
       }
       return -1;
    }
    public static void main(Strings[] args){
       int nums_size = 0;
        if (sc.hasNextInt()) {
…         // prints the elements of an array
            System.out.print(arr[i] + " ");
        }
        
}