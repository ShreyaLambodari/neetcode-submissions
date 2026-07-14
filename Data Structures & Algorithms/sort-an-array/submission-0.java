public class Sort {
    public void quickSort(int[] nums, int low, int high) {
        // lets consider mid value as pivot element;
        if (low < high) {
            int mid = low + (high - low) / 2;
            int pivotelement = nums[mid];

            int i = low;
            int j = high;

            while(i <= j){
                while((nums[i] < pivotelement) && i <= high-1){
                    i++;
                }
                while((nums[j] > pivotelement) && j>= low+1){
                    j--;
                }
                if(i <= j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    i++;
                    j--;
                }
            }
            if(low < j){
                quickSort(nums, low, j);
            }
            if(i < high){
                quickSort(nums, i, high);
            }
        }
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        Sort s1 = new Sort();
        s1.quickSort(nums, low, high);

        return nums;
    }
}