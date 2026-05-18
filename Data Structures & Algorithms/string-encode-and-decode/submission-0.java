class Solution {

    public String encode(List<String> strs) {
        int num=0;
        StringBuilder sb=new StringBuilder();
        for(String i : strs){
            num=i.length();
            sb.append(num);
            sb.append('#');
            sb.append(i);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int hash=str.indexOf('#',i);
            int len=Integer.parseInt(str.substring(i,hash));
            int start=hash+1;
            int end=start+len;
            res.add(str.substring(start,end));
            i=end;
        }
        return res;
    }

}
