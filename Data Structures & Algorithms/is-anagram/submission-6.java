class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char[] s1=s.toCharArray();
            map1.put(s1[i],map1.getOrDefault(s1[i],0)+1);
    }   for(int i=0;i<t.length();i++){
            char[] t1=t.toCharArray();
            map2.put(t1[i],map2.getOrDefault(t1[i],0)+1);
    }
    return map1.equals(map2);
}}
