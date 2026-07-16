class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();

        for (String s : strs) {
            String sortedS = sortString(s);
            hs.computeIfAbsent(sortedS, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(hs.values());
    }

    public String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}