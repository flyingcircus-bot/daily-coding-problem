//This problem was recently asked by Google.

//Given a list of numbers and a number k, return whether any two numbers from the list add up //to k.

//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

//Bonus: Can you do this in one pass?

import java.util.*;

public class SumProblem{

    public static void main(String []args){
        int[] nums = {10, 15, 3, 7};
        int target = 1;
        System.out.println("Result: " + sumOfTwo(nums, target));
     }
     
     
    public static boolean sumOfTwo(int[] nums, int target){
        Set<Integer> arl = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(arl.contains(nums[i])){
                return true;
            }
            arl.add(target-nums[i]);
        }
        return false;
     }

}
