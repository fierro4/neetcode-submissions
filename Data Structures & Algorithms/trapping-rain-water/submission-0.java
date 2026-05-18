class Solution {
    public int trap(int[] height) {
        int trap=0;
        int l=0;
        int r=height.length-1;
        int maxleft=0;
        int maxright=0;
        while(l<r){
            maxleft=Math.max(maxleft,height[l]);
            maxright=Math.max(maxright,height[r]);
            if(maxleft<=maxright){
                trap=trap+maxleft-height[l];
                l++;
            }
            else if(maxleft>maxright){
                trap=trap+maxright-height[r];
                r--;
            }
            
}

    return trap;}}
