class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[] = new int[arr.length];
        int maxSoFar = -1;
        for(int i=arr.length-1; i>=0; i--) {
            ans[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, arr[i]);
        }
        return ans;
    }
}