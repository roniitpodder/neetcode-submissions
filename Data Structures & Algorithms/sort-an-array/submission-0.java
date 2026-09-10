class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[]nums,int l,int r){
        if(l>=r) return;
        int m=l+(r-l)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,r,m);
    }
    void merge(int[] nums, int l, int r, int m){
        int[] temp=new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=r){
            if(nums[i]<nums[j]) temp[k++]=nums[i++];
            else temp[k++]=nums[j++];
        }
        while(i<=m) temp[k++]=nums[i++];
        while(j<=r) temp[k++]=nums[j++];
        for(int x=0;x<temp.length;x++) nums[l+x]=temp[x];
    }
}