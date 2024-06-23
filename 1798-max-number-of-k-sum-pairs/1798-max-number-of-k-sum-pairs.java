import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        // Arrays.sort(nums);
        // int i = 0;
        // int j = nums.length - 1;
        // int opers = 0;
        // while(i<j){
        //     int sum = nums[i]+nums[j];
        //     if(sum==k){
        //         opers++;
        //         i++;
        //         j--;
        //     }
        //     else if(sum < k){
        //         i++;
        //     }
        //     else {
        //         j--;
        //     }
        // }
        // return opers;
        int op = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j = 0; j < nums.length; j++){
            int compliment = k-nums[j];
            if(map.getOrDefault(compliment , 0) > 0){
                op++;
                map.put(compliment, map.get(compliment)-1);
            }
            else{
                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            }
            
        }
        return op;

    }
}