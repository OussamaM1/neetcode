class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();        
    }
    
    public void push(int val) {
        this.stack.push(val);
        if(this.minStack.isEmpty() || val <= this.minStack.peek()) {
            this.minStack.push(val);
        }
    }
    
    public void pop() {
        if(this.stack.isEmpty()) return;
        if(this.stack.peek().equals(this.minStack.peek())) {
            this.minStack.pop();
        }
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
