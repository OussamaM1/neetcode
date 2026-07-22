class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int num : nums) {
            ans.add(num);
        }
        return ans.size() == nums.length ? false : true;
    }
}