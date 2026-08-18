class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int count=0;
        int maxcount=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                //abcabcbb
                
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            
            maxcount=Math.max(maxcount,r-l+1);
        }
    return maxcount;}
}
