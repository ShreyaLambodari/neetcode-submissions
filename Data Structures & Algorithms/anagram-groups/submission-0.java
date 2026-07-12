class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> l1 = new HashMap<>();

        for(int i=0; i< strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s1 =  new String(arr);

            if(! l1.containsKey(s1)){
                l1.put(s1, new ArrayList<>());
            }
            l1.get(s1).add(strs[i]);
        }
        return new ArrayList<>(l1.values());
    }
}
