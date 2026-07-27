class NumArray {

    private final int ans[];

    public NumArray(int[] nums) {
        this.ans = new int[nums.length+1];
        for(int i=0; i<nums.length;i++) {
            this.ans[i+1] = this.ans[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return this.ans[right+1] - this.ans[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */