class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int nums[]=new int[m+n];
        int j=0;
        for(int i=0;i<m;i++){
            nums[j]=nums1[i];
            j++;
        }
        for(int i=0;i<n;i++){
            nums[j]=nums2[i];
            j++;
        }
        Arrays.sort(nums);
        double med=0;
        if(nums.length%2==0){
          med=(nums[nums.length/2-1]+nums[nums.length/2])/2.0;
        }
        else{
            med=nums[nums.length/2];
        }
        return med;
    }
}