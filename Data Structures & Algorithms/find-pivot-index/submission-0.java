class Solution {
    public int pivotIndex(int[] nums) {
        int ans[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
            ans[i+1] = ans[i] + nums[i];
        }
        for(int i=0; i<nums.length;i++) {
            if(i == 0) {                
                if(ans[nums.length] - nums[i] == 0) return i;
                else continue;
            }
            if(i == nums.length-1) {
                if(ans[nums.length] - nums[nums.length-1] == 0) return i;
                else continue;
            }
            if(ans[i] == ans[nums.length] - ans[i] - nums[i]) return i;

        }
        return -1;
    }
}