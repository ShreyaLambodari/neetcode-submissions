class Solution {
    public String longestCommonPrefix(String[] strs) {
        String assumefinal = strs[0];
        for (int i=1; i<strs.length; i++){
           int j =0;
           while(j < assumefinal.length() && j < strs[i].length() && assumefinal.charAt(j) == strs[i].charAt(j)){
            j++;
           }
           assumefinal = assumefinal.substring(0, j);
        }
        return assumefinal;
    }
}