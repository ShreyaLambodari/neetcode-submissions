class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer>s=new ArrayDeque<>();
        for(int i=0; i<asteroids.length; i++){
            boolean destroyed = false;
            while(!s.isEmpty() && s.peek() > 0 && asteroids[i] <0 ){
                if(Math.abs(s.peek()) == Math.abs(asteroids[i])){
                    s.pop();
                    destroyed =true;
                    break;
                }else if(Math.abs(s.peek()) > Math.abs(asteroids[i])){
                    destroyed = true;
                    break;
                }else{
                    s.pop();
                }
            }
            if(!destroyed){
                s.push(asteroids[i]);
            }
        }
        int []result = new int[s.size()];
        int index=result.length-1;
        while(!s.isEmpty()){
            result[index]=s.pop();
            index--;
        }
        return result;
    }
}