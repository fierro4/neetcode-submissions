class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> small=new HashMap<>();
        HashMap<Character,Integer> big=new HashMap<>();
        for(int i=0;i<t.length();i++){
            small.put(t.charAt(i),small.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0;
        int required=small.size();
        int formed=0;
        int start=0;
        int minLen=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            big.put(c,big.getOrDefault(c,0)+1);
            if(small.containsKey(c) && big.get(c)== small.get(c)){
                formed++;
            }
            while(formed==required){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    start=l;
                }
                char b=s.charAt(l);
                big.put(b,big.getOrDefault(b,0)-1);
                if(small.containsKey(b) && big.get(b)<small.get(b)){
                formed--;
            }
                l++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start,start+minLen);
        }
    }
}
