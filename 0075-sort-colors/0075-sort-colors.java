import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int count_0=0,count_1=0,count_2=0;
        for(int num:nums){
            if(num==0){
                count_0++;
            }
            else if(num==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }
        int index=0;
        for(int i=0;i<count_0;i++){
            nums[index++]=0;
        }
        for(int i=0;i<count_1;i++){
            nums[index++]=1;
        }
        for(int i=0;i<count_2;i++){
            nums[index++]=2;
         }
        
    }
}