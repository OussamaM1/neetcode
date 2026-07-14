class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for (int n : nums) {
        //     set.add(n);
        // }
        // return set.size() != nums.length ? true : false;
        return Arrays.stream(nums).distinct().toArray().length != nums.length ? true : false;
    }
}