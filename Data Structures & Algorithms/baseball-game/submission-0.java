class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(String string : operations) {
            if(string.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if(string.equals("C")) {
                stack.pop();
            } else if(string.equals("D")) {
                stack.push(stack.peek()*2);
            } else {
                stack.push(Integer.parseInt(string));
            }
        }
        for(int num : stack) {
            ans+=num;
        }
        return ans;
    }
}