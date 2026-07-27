class MyQueue {
Deque<Integer> q1 ;
// Deque<Integer> q2 ;
    public MyQueue() {
        q1=new ArrayDeque<>();
        // q2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        // while(q1.size()>1){
        //     q2.add(q1.pop());
        // }
        int poped = q1.pop();
        // q1.add(q2.pop());
        return poped;
    }
    
    public int peek() {
        // while(q1.size()>1){
        //     q2.add(q1.pop());
        // }
        int peeked = q1.peek();
        // q1.add(q2.pop());
        return peeked;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */