class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean add[] = new boolean[strs.length];
        for(int i=0; i<strs.length;i++) {
            if(add[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            add[i] = true;
            for(int j=i+1; j<strs.length;j++) {
                if(isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    add[j] = true;
                }
            }
            ans.add(group);
        }
        return ans;
    }

    // function to verify if 2 strings are anagrams
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int ans[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;
        }
        for(int value: ans) {
            if(value != 0) return false;
        }
        return true;
    }
}
