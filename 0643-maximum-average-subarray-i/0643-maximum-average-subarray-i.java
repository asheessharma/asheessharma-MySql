class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = 0.0;
        double maxavg = 0.0;
        for(int i=0;i<k;i++){
            result += nums[i];
        }
        maxavg = result;
        for(int i = k; i < nums.length;i++){
            result +=nums[i];
            result-=nums[i-k];
            maxavg = Math.max(maxavg,result);
        }
        return maxavg / k;
        
    }
}