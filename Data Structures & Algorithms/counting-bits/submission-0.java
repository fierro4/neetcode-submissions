class Solution {
    public int[] countBits(int n) {
        int mask=0;
        int val=0;
        
        int[] output=new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            for(int j=0;j<32;j++){
                mask=1<<j;
                val=mask&i;
                if(val>0){
                    count++;
                }}
            output[i]=count;
              
    }
    return output;}
}
