class Solution {
    public int characterReplacement(String s, int k) {
        char[] input= s.toCharArray();
        int l=0;
        int len=0;
        int maxfreq=0;
        HashMap<Character,Integer> chars=new HashMap<>();
        for(int r=0;r<input.length;r++){
           chars.put(input[r], chars.getOrDefault(input[r], 0) + 1);
           maxfreq=Math.max(maxfreq,chars.get(input[r]));
           if((r-l+1)-maxfreq>k){
            chars.put(input[l],(chars.get(input[l])-1));
            l++;
           }
           len=r-l+1;
        }
        return len;
        
     }
}
