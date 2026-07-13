class MyHashSet {

ArrayList<Integer> a1;
    public MyHashSet() {
        a1 = new ArrayList<>();
    }
    
    public void add(int key) {
        if( !a1.contains(key)){
            a1.add(key);
        }
    }
    
    public void remove(int key) {
        if(a1.contains(key)){
            a1.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        return a1.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */