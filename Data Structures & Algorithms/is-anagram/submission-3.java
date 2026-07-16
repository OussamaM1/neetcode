class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int ans[] = new int[(int)'z'+1];
        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i)]++;
            ans[t.charAt(i)]--;
        }
        for (int a : ans) {
            if(a!=0) return false;
        }
        return true;
    }
}
