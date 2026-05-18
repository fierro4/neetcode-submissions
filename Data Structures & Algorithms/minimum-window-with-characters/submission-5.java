class Solution {
    public String minWindow(String s, String t) {
        String res=new String("");
        HashMap<Character,Integer> small=new HashMap<>();
        HashMap<Character,Integer> big=new HashMap<>();
        if(s.length()<t.length()){
            return "";
        }
        for(int i=0;i<t.length();i++){
            small.put(t.charAt(i),small.getOrDefault(t.charAt(i),0)+1);
        }
        int required=small.size();
        int l=0;
        int formed=0;
        int minLen = Integer.MAX_VALUE;
        int start=0;
        for(int r=0;r<s.length();r++){
            big.put(s.charAt(r),big.getOrDefault(s.charAt(r),0)+1);
            char c=s.charAt(r);
            if(small.containsKey(c) && big.get(c)==small.get(c)){
                formed++;
            }
            while(formed==required){
               
                if(r-l+1<minLen){
                     start=l;
                     minLen=Math.min(minLen,r-l+1);
                }
                 
                big.put(s.charAt(l),big.getOrDefault(s.charAt(l),0)-1);
                c = s.charAt(l);
                if(small.containsKey(c) && big.get(c)<small.get(c)){
                    formed--;
                }
                l++;
            }
        }
    if(minLen == Integer.MAX_VALUE){
        return "";
    }
    return s.substring(start, start + minLen);
}
}
