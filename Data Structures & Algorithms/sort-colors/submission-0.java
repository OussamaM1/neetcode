class Solution {
    public void sortColors(int[] nums) {
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i=0; i<3; i++) {
            buckets.add(new ArrayList<>());
        }

        // Let's add each elements to it bucket
        for(int num : nums) {
            buckets.get(num).add(num);
        }

        // Edit the final array
        int index = 0;
        for(List<Integer> bucket: buckets) {
            for(int element: bucket) {
                nums[index++] = element;
            }
        }
    }
}