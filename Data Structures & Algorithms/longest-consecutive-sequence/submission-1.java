class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers=new HashSet<>();
        int longest=0;
        for(int i:nums){
                numbers.add(i);
        }
        for(int i:numbers){
            if(!numbers.contains(i-1)){
                int current=i;
                int length=1;
                while(numbers.contains(current+1)){
                    current++;
                    length++;
                }
            longest=Math.max(longest,length);    
        }
        }
        return longest; 
    }
}
