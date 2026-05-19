public class Solution {
    public void sortColors(int[] nums) {
        int one=0,zero=0,two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[two++]=2;
                nums[one++]=1;
                nums[zero++]=0;
            }
            else if(nums[i]==1){
                nums[two++]=2;
                nums[one++]=1;
            }
            else if(nums[i]==2){
                nums[two++]=2;
            }
        }

    
}}