class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int height=1;
        int length=1;
        int area=1;
        int maxArea=0;
        while(l<r){
            height=Math.min(heights[l],heights[r]);
            length=r-l;
            area=height*length;
            maxArea=Math.max(area,maxArea);  
            
            if(heights[l]<heights[r]){
                l++;}
            else{
                r--;
            }
            
  }
        
    return maxArea;
    }
}
