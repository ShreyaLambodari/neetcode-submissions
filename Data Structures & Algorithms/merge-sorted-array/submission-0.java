class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int leftfinger = m-1;
        int rightfinger = n-1;
        int emptyslot = m+n-1;

        while(rightfinger >= 0){
            if( leftfinger >=0 && nums1[leftfinger] > nums2[rightfinger]){
                nums1[emptyslot] = nums1[leftfinger];
                leftfinger --;
            }else{
                nums1[emptyslot] = nums2[rightfinger];
                rightfinger --;
            }
            emptyslot --;
        }
    }
}