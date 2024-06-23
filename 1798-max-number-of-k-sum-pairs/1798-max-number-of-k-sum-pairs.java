class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int opers = 0;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==k){
                opers++;
                i++;
                j--;
            }
            else if(sum < k){
                i++;
            }
            else {
                j--;
            }
        }
        return opers;

    }
}