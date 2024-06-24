class Solution {
    public int longestOnes(int[] arr, int k) {
        int l=0,r=0;
        int zeros = 0;
        int maxLen = 0;
        int n = arr.length;
        int len;
        while(r<n){
            if(arr[r] == 0){
                zeros++;

            }
            if(zeros>k){
                if(arr[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                len = r - l + 1;
                maxLen = Math.max(len,maxLen);
            }
            r++;
        }
        return maxLen;
    }
}