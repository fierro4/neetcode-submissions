class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }

        int[] small = new int[128];
        int[] big = new int[128];

        for(int i=0;i<t.length();i++){
            small[t.charAt(i)]++;
        }

        int l=0;
        int required=0;
        int formed=0;
        int start=0;
        int minLen=Integer.MAX_VALUE;

        for(int i=0;i<128;i++){
            if(small[i]>0){
                required++;
            }
        }

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            big[c]++;

            if(small[c]>0 && big[c]==small[c]){
                formed++;
            }

            while(formed==required){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    start=l;
                }

                char b=s.charAt(l);
                big[b]--;

                if(small[b]>0 && big[b]<small[b]){
                    formed--;
                }

                l++;
            }
        }

        return minLen==Integer.MAX_VALUE
                ? ""
                : s.substring(start,start+minLen);
    }
}