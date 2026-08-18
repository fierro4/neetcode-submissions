class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxlen = 0;
        int maxFrequency = 0; 
        int[] counts = new int[26];
        
        for (int r = 0; r < s.length(); r++) {
           counts[s.charAt(r) - 'A']++;
            maxFrequency = Math.max(maxFrequency, counts[s.charAt(r) - 'A']);
            
            if ((r - l + 1) - maxFrequency > k) {
                counts[s.charAt(l) - 'A']--; 
                l++;
            }
            
            maxlen = Math.max(maxlen, r - l + 1);
        }
        
        return maxlen;
    }
}