import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        int index=0;
        for(int i=0;i<m;i++){
            arr[index]=nums1[i];
            index++;
        }
        for(int j=0;j<n;j++){
            arr[index]=nums2[j];
            index++;
        }
        Arrays.sort(arr);
        int len = arr.length;

        if (len % 2 == 0) {
            return (arr[len/2 - 1] + arr[len/2]) / 2.0;
        }
        else {
            return arr[len/2];
        }
    }
}
 
    