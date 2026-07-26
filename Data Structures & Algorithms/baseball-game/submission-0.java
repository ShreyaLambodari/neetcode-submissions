class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> s1 = new ArrayDeque<>();
        for(String operator : operations){
            if(operator.equals("+")){
                int top = s1.pop();
                int result = top + s1.peek();
                s1.push(top);
                s1.push(result);
            }else if(operator.equals("C")){
                s1.pop();
            }else if(operator.equals("D")){
                s1.push(2*s1.peek());
            }else{
                s1.push(Integer.parseInt(operator));
            }
            
        }int total =0;
            while(! s1.isEmpty()){
                total += s1.pop();
        }
        return total;
    }
}