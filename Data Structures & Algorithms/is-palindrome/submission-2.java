class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char ch=s.charAt(i);
            char ch2=s.charAt(j);
            if(!Character.isLetterOrDigit(ch)){
                i++;
                continue;
            }       
            if(!Character.isLetterOrDigit(ch2)){
                j--;
                continue;
            } 
            if(ch!=ch2) {
                return false;
            } 
            else{
                i++;j--;
            }     
            }
        return true;}
    }

