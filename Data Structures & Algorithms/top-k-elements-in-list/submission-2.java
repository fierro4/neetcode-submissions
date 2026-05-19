class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i :nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int key:freq.keySet()){
            int f=freq.get(key);
            if(buckets[f]==null){
                buckets[f]=new ArrayList<>();
            }
            buckets[f].add(key);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=buckets.length-1;result.size()<k && i>=0;i--){
            if(buckets[i]!=null){
                result.addAll(buckets[i]);
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=result.get(i);
        }
    return res;
    }

}
