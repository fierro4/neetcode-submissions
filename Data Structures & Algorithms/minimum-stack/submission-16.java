class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minstack;
    public MinStack() {
        minstack=new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(!minstack.isEmpty() && val<=minstack.peek()){
            minstack.push(val);
        }
        else if(minstack.isEmpty()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int num=stack.pop();
        if(!minstack.isEmpty() && num==minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}
