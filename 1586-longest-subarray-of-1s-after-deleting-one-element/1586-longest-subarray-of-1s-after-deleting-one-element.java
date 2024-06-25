class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int len = 0;
        int k = 1;
        int zeros = 0;
        int n = nums.length;
        while(r<n){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
           
                len = r - l + 1 ;
                maxLen = Math.max(len ,maxLen);
            
            r++;
        }
        return (maxLen - 1);
    }
}