class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for(int n : nums) {
            count = n == 1 ? count+1 : 0;
            ans = Math.max(ans , count);
        }
        return ans;
    }
}