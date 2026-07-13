class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(! map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
            map.put(nums[i], map.get(nums[i])+1);
        }
        int maxfreq =0;
        int value =0;
        for(Map.Entry<Integer, Integer> e : map.entrySet() ){
            if(e.getValue() > maxfreq){
                maxfreq = e.getValue();
                value = e.getKey();
            }
        }
        return value;
    }
}