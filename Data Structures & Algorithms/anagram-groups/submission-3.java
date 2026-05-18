class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            int[] count=new int[26];
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int val : count) {
                sb.append('#'); 
                sb.append(val);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
       
