class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer> l1 = new ArrayList<>();
        for(int n : map.keySet()){
            if(map.get(n) > nums.length/3){
                l1.add(n);
            }
        }
        return l1;
    }
}