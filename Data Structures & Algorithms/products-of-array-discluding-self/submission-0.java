class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int mul = 1;
        int zeroCount = 0;
        for(int n : nums) {
            if(n != 0)
                mul *= n;
            else
                zeroCount++;
        }
        if(zeroCount > 1) return new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(zeroCount > 0) {
                ans[i] = (nums[i] == 0) ? mul : 0;
            } else ans[i] = mul/nums[i];
        }
        return ans;
        
    }
}  
