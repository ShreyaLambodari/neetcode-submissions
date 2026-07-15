class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftproduct = new int[nums.length];
        leftproduct[0] =1;

        for(int i=1; i<nums.length; i++){
            leftproduct[i] = leftproduct[i-1]*nums[i-1];
        }

        int[] rightproduct = new int[nums.length];
        rightproduct[nums.length-1] =1;

        for(int i=nums.length-2; i>=0; i--){
            rightproduct[i] = nums[i+1]*rightproduct[i+1];
        }
        int l=0; 
        int r =0;
        while(l<leftproduct.length && r<rightproduct.length){
            leftproduct[l] = leftproduct[l] * rightproduct[r];
            l++;
            r++;
        }
        return leftproduct;
    }
}  
