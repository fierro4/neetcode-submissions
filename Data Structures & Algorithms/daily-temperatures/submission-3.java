class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int n=temperatures.length;
        int[] result=new int[n];
        for (int i=0;i<n;i++){
            int val=temperatures[i];
             
            while(!stack.isEmpty() && temperatures[stack.peek()]<val){
                result[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            stack.push(i);
            
    }
return result;}}
