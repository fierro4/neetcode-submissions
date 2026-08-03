
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>(); // stores indices
        int maxArea = 0;

        // Traverse all bars
        for (int i = 0; i < heights.length; i++) {

            // Current bar is smaller than the bar at stack top
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {

                int top = stack.pop(); // index of the bar whose area we're calculating

                int width;
                if (stack.isEmpty()) {
                    // No smaller bar on the left
                    width = i;
                } else {
                    // Width between left smaller and right smaller
                    width = i - stack.peek() - 1;
                }

                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        // Process remaining bars in the stack
        while (!stack.isEmpty()) {

            int top = stack.pop();

            int width;
            if (stack.isEmpty()) {
                width = heights.length;
            } else {
                width = heights.length - stack.peek() - 1;
            }

            int area = heights[top] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}