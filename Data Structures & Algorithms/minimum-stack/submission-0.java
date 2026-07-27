class MinStack {
Stack<Integer> s;
Stack<Integer> minstack;
    public MinStack() {
        s= new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty() && minstack.isEmpty()){
            s.push(val);
            minstack.push(val);
        }else{
            s.push(val);
            minstack.push(Math.min(minstack.peek(), val));
        }
    }
    
    public void pop() {
        s.pop();
        minstack.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
