class Solution {
    public int singleNumber(int[] nums) {
        int val=0;
        for(int i:nums){
            val=val^i;
        }
        return val;

    }
}
