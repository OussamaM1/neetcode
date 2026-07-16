class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans = new HashMap<>();
        for(String string : strs) {
            ans.computeIfAbsent(generateKey(string), k -> new ArrayList<>()).add(string);
        }
        return new ArrayList<List<String>>(ans.values());
    }

    public String generateKey(String s) {
        int count[] = new int[26];
        for(int i=0; i<s.length();i++) {
            count[s.charAt(i) - 'a']++;
        }
        return Arrays.toString(count);
    }
}
