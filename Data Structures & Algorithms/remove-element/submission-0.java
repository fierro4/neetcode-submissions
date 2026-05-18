class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int k=nums.length;
        int m=0;
        for(int i=0;i<len;i++){
            if(nums[i]==val){
                k--;
            }
            else{
                nums[m]=nums[i];
                m++;
            }
        }
        return k;
    }
}