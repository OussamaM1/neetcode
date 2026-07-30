class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> prefixFrequency = new HashMap<>();
        prefixFrequency.put(0, 1);

        for (int n : nums) {
            currentSum += n;
            int diff = currentSum - k;
            ans += prefixFrequency.getOrDefault(diff, 0);
            prefixFrequency.put(currentSum, prefixFrequency.getOrDefault(currentSum, 0) + 1);
        }
        return ans;
    }
}