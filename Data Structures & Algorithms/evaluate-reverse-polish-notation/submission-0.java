class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int num=0;
        int res=0;
       for(int i=0;i<tokens.length;i++){
        if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
            int a= stack.pop();
            int b= stack.pop();
            switch(tokens[i]){
            case "+":
            res=b+a;
            break;
            case "-":
            res=b-a;
            break;
            case "/":
            res=b/a;
            break;
            case "*":
            res=b*a;
            break;
            default:
            break;}
            stack.push(res);
        }
        else{
            num=Integer.parseInt(tokens[i]);
            stack.push(num);
        }
       } 
       return stack.peek();
    }
}
