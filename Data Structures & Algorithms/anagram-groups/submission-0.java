class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groups= new HashMap<>();
        for(String i : strs){
            int[] freq=new int[26];
            for(char c: i.toCharArray()){
                freq[c-'a']++;}
                //gen key
                StringBuilder sb=new StringBuilder();
                for(int m:freq){
                    sb.append('#');
                    sb.append(m);
                }
                String key=sb.toString();
                groups.putIfAbsent(key,new ArrayList<>());
                groups.get(key).add(i);
            }
        
    return new ArrayList<>(groups.values());

    }
}
