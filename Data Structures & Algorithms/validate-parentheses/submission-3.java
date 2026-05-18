class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            else if(c==')'||c==']'||c=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                else if((c==')'&& stack.peek()=='(')||(c==']'&& stack.peek()=='[')||(c=='}'&& stack.peek()=='{')){
                    stack.pop();
                }
                else{return false;}
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
