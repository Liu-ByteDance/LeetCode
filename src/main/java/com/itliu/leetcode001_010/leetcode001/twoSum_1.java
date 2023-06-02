package com.itliu.leetcode001_010.leetcode001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @create 2023-04-05-8:41
 */
public class twoSum_1 {
    public static void main(String[] args) {
//        写数组的三种方法:
//        int[] nums = new int[4];
//        int[] nums = new int[]{2,7,11,15};
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; ++i) {
        if (hashtable.containsKey(target - nums[i])) {
            return new int[]{hashtable.get(target - nums[i]), i};
        }
        hashtable.put(nums[i], i);
    }
    return new int[0];
}
}
