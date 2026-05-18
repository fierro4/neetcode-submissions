class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minstack=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()||val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(!minstack.isEmpty() && minstack.peek().equals(stack.peek())){
            minstack.pop();
            
        }
        
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        int top=0;
        if(!stack.isEmpty()){
         top=stack.peek();}
        return top;
    }
    
    public int getMin() {
        int least=0;
        if(!minstack.isEmpty()){
         least=minstack.peek();}
        return least;
    }
    }

