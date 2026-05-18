class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str=s.toCharArray();
        int left=0;
        int len=0;
        int maxlen=0;
        HashSet<Character> num=new HashSet<>();
        
        for(int right=0;right<str.length;right++){
            if(num.contains(str[right])){
                 while(num.contains(str[right])){
                num.remove(str[left]);
                left++;
                } 
            }
            num.add(str[right]);
                len=right-left+1;
                if(len>maxlen){
                    maxlen=len;
                }
        }
    return maxlen;}
}
