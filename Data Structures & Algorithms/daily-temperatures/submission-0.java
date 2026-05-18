class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for(int current=0;current<temperatures.length;current++){
            
            while(!stack.isEmpty() && temperatures[current]>temperatures[stack.peek()]){
                result[stack.peek()]=current-stack.peek();
                stack.pop();
            }
            stack.push(current);
        }
    return result;}
}
