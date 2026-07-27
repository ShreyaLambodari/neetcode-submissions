class MyStack {

Deque<Integer> s1;
Deque<Integer> s2;
    public MyStack() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        while(s1.size() > 1){
            s2.add(s1.pop());
        }
        int poped = s1.pop();
        
        while(s2.size()>0){
            s1.add(s2.pop());
        }

        return poped;
    }
    
    public int top() {
         while(s1.size()>1){
            s2.add(s1.pop());
        }
        int toped = s1.pop();
        s2.add(toped);
        while(s2.size()>0){
            s1.add(s2.pop());
        }

        return toped;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */