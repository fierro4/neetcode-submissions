class Solution {
    public int singleNumber(int[] nums) {
        int dig=1;
        int val=1;
        for(int i:nums){
         dig=i<<1;
            val=val^dig;
        }
        return val>>1;

    }
}
