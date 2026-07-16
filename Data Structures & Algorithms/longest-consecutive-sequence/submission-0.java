class Solution{
    public int longestConsecutive(int[] nums){
        HashSet<Integer> h1 = new HashSet<>();
        int maxfreq =0;
        for(int n: nums){
            h1.add(n);
        }
        for(int n : h1){
            if(! h1.contains(n-1)){
                int currentnum = n;
                int currentlen =1;
                while(h1.contains(currentnum + 1)){
                    currentlen ++;
                    currentnum ++;
                }
                maxfreq = Math.max(maxfreq, currentlen);
            }
        }
        return maxfreq;
    }
}