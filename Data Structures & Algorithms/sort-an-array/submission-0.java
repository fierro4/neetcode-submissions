class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;   
    }
    public void mergeSort(int[] nums,int l, int r){
        if(l>=r) return;
        int m=(l+r)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,m,r);
    }
    public void merge(int[] nums,int l, int m,int r){
        int i=l;
        int j=m+1;
        int[] temp=new int[r-l+1];
        int k=0;
        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                temp[k]=nums[i];
                i++;
                k++;
            }
            else{
                temp[k]=nums[j];
                k++;
                j++;
            }
        }
        while(i<=m){
            temp[k]=nums[i];
                i++;
                k++;
        }
        while(j<=r){
            temp[k]=nums[j];
                k++;
                j++;
        }
        for(i=l;i<=r;i++){
            nums[i]=temp[i-l];
        }


    }
}