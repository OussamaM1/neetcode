class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> sign = new HashMap<>();
        sign.put('}', '{');
        sign.put(')', '(');
        sign.put(']', '[');
        for(char c : s.toCharArray()) {
            if(sign.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() == sign.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size() != 0 ? false : true;
    }
}
