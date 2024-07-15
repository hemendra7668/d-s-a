package code;

import java.util.Arrays;

public class Consecute_1 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[] {  1, 1, 1, 0, 1, 1, 1 };
        Solution ss = new Solution();
        ss.findMaxConsecutiveOnes(arr);
        System.out.println(ss.findMaxConsecutiveOnes(arr));
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int te[] = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                te[j]++;
            } else {
                j++;

            }
        }

        int maxx = Arrays.stream(te).max().getAsInt();
        return maxx;
    }
}
