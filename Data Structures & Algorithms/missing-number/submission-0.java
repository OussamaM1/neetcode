class Solution {
    public int missingNumber(int[] nums) {
        boolean ans[] = new boolean[nums.length+1];
        for(int num : nums) {
            ans[num] = true; 
        }
        for(int i=0; i<ans.length;i++) {
            if(!ans[i]) return i;
        }

        return 0;
    }
}
