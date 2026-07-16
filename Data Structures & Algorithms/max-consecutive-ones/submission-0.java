class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, i = 0, count = 1;
        while(i<nums.length) {
            if(nums[i] == 0) {
                i++;
                count = 1;
                continue;
            }
            if(i+1<nums.length && nums[i] == nums[i+1]) {
                count++;
            } else {
                ans = Math.max(count, ans);
            }
            i++;
        } 
        return ans;
    }
}