class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            int area=(r-l)*Math.min(heights[l],heights[r]);
            maxarea=Math.max(maxarea,area);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        
    return maxarea;
    }
}
