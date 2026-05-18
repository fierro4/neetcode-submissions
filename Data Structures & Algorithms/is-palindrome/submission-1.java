class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        char[] arr=s.toLowerCase().toCharArray();
        while(l<r){
            while(l<r && !isAlphaNum(arr[l])){
                l++;
            }
            while(r>l && !isAlphaNum(arr[r])){
                r--;
            }
            
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isAlphaNum(char c){
        return((c>='A'&& c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9'));
    }
}
