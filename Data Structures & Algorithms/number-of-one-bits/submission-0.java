class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int mask=0;
        int result=0;
        for(int i=0;i<32;i++){
            mask=1<<i;
            result=mask & n;
            if(result>0){
                count++;
            }
            else{
                count=count+0;
            }
        }
        return count;
    }
}
