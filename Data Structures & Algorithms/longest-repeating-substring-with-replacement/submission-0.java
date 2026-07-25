class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, maxlen =0, maxcount=0;
        for(int right =0; right<s.length(); right++){

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0)+ 1);
            maxcount = Math.max(maxcount, map.get(ch));

            int windowsize = right - left +1;
        //agar windowsize bada hai usme maxcount bhi kafi hai lekin jo 
        //capacity hai k ki usse zyada cheezein agar badalne bologe toh kaise badlega isiliye hum 
        // left character ko he window size se hta denge and hashmap se bhi kam kr denge
            if(windowsize - maxcount > k){
                char leftchar = s.charAt(left);
                map.put(leftchar, map.get(leftchar)-1);
        // hmm ab toh windowsize se bhi hatt gya, hashmap se bhi isiliye ab left ko aage badhayenge 
        // taki window bhi shrink hogi and  firse windowsize bhi pta lga sakenge
                left++;
            }
            maxlen = Math.max(maxlen, right - left +1);

        }
        return maxlen;
    }
}
