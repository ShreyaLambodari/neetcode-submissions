class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0; j< nums.length; j++){
            if(nums[j] != nums[i]){
                int temp = nums[j];
                i++;
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return i+1;
    }
}