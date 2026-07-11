class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> s1 = new HashSet<> ();
       for(int i =0; i<nums.length; i++){
           if(!s1.add(nums[i])){
            return true;
           }
       }
       return false;
    }
}