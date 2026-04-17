class MinStack {

    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;

    public MinStack() {
        this.stack = new LinkedList();
        this.minStack = new LinkedList();
    }
    
    public void push(int val) {
        stack.addFirst(val);
        int currentMin = minStack.isEmpty() ? val : Math.min(val, minStack.getFirst());
        minStack.addFirst(currentMin);
    }
    
    public void pop() {
        stack.removeFirst();
        minStack.removeFirst();
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
        return minStack.getFirst();
    }
}
