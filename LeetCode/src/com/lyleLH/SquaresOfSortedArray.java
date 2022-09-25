package com.lyleLH;

import java.util.ArrayList;

public class SquaresOfSortedArray {
    /*
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
    * */
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int lo = 0;
        int hi = nums.length -1;
        for (int i = 0;i <= nums.length-1;i ++){
            if(Math.abs(nums[lo])>Math.abs(nums[hi])){

            }else {

            }
        }
        return result;
    }
}
