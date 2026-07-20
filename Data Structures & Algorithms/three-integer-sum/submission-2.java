class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

       List<List<Integer>> l1 = new ArrayList<>();

       for(int i=0; i< nums.length; i++){

        if(i > 0 && nums[i] == nums[i-1]){
            continue;
        }

        int j = i+1;
        int k = nums.length - 1;

        // nums[i] + nums[j] + nums[k] = 0;
        // i.e, nums[j] + nums[k] = - nums[i];
        int target = -nums[i];
        while(j < k){
            int sum = nums[j] + nums[k];
            if( sum == target ){
                l1.add(Arrays.asList(nums[i] , nums[j] , nums[k]));

                while(j < k && nums[j] == nums[j+1]){
                    j++;
                }while(j < k && nums[k] == nums[k-1]){
                    k--;
                }
                j ++;
                k --;
            }else if(sum > target){
                k --;
            }else{
                j ++;
            }
        }
       } 
       return l1;
    }
}
