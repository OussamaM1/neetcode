class MinStack {

    Vector<Integer> stack;

    public MinStack() {
        this.stack = new Vector<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
    }
    
    public void pop() {
        this.stack.remove(this.stack.size()-1);
    }
    
    public int top() {
        return this.stack.lastElement();
    }
    
    public int getMin() {
        return this.stack.stream().min(Integer::compareTo).orElse(0);
    }
}
