class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        int n = nums.length;
        int ans[] = new int[k];
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            buckets.add(new ArrayList<>());
        }
        for(Map.Entry<Integer, Integer> map : count.entrySet()) {
            int number = map.getKey();
            int frequency = map.getValue();
            buckets.get(frequency).add(number);
        }
        int index = 0;
        for (int frequency = nums.length; frequency >= 0 && index < k; frequency--) {
            for (int number : buckets.get(frequency)) {
                ans[index++] = number;

                if (index == k) {
                    return ans;
                }
            }
        }
        return ans;
    }
}
