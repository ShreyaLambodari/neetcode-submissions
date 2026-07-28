class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> s = new ArrayDeque<>();
        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*")
               && !token.equals("/")) {
                    s.push(Integer.parseInt(token));
            }else{
                int t1= s.pop();
                int t2 = s.pop();
                int ans =0;
                if(token.equals("+")){
                    ans = t2+t1;
                }else if(token.equals("-")){
                    ans = t2-t1;
                }else if(token.equals("*")){
                    ans = t2*t1;
                }else {
                    ans = t2/t1;
                }
                s.push(ans);
            }
        }
        return s.pop();
    }
}
