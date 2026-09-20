class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m+n];
        int i = 0, j = 0, k = 0;
        // Compare and merge elements
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } 
            else {
                mergedArray[k++] = nums2[j++];
            }
        }
        // Copy remaining elements from arr1
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        // Copy remaining elements from arr2
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }
        int totalLen = m+n;
        if(totalLen%2==0){
            return ((double)mergedArray[totalLen/2-1] + mergedArray[totalLen/2])/2.0;
        } 
        else{
            return mergedArray[totalLen/2];
        }
    }
}