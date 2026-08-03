class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int area=0;
        int maxarea=0;
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int top=stack.pop();
                int width=0;
                if(stack.isEmpty()){ //no left smaller
                    width=i;
                }
                else{ // there is left smaller at stack.peek(), right smaller at i
                    width=i-stack.peek()-1;
                }
                area=heights[top]*width;
                maxarea=Math.max(maxarea,area); 
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
                int top=stack.pop();
                int width=0;
                if(stack.isEmpty()){
                    width=heights.length;
                }
                else{
                    width=heights.length-stack.peek()-1;
                }
                area=heights[top]*width;
                maxarea=Math.max(maxarea,area); 
            }
    return maxarea;}
}
