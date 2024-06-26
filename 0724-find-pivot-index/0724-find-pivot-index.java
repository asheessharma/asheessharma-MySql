class Solution {
    public int pivotIndex(int[] nums) {
        int [] left = new int[nums.length];
        int [] right = new int [nums.length];
        int n = nums.length-1;
        right[n] = nums[n];
        left [0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            left[i] = nums[i] + left[i-1];
            right[n-i] = nums[n-i] + right[n-i+1];
        } 
        // for(int i = n-1 ; i >=0 ;i--){
        //     right[i] = nums[i] + right[i+1];
        // }
        
        for(int j = 0; j < nums.length;j++){
            if(left[j] == right[j]){
                return j;
            }
        }
        return -1;
    }
}